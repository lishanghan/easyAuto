package com.haier.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.haier.enums.RegexEnum;
import com.haier.enums.UserGroup;
import com.haier.mapper.UserMapper;
import com.haier.po.User;
import com.haier.po.UserExample;
import com.haier.service.TcaseService;
import com.haier.service.TcustomService;
import com.haier.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/5/12 15:27
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    UserMapper userMapper;

    @Override
    public Integer insertOne(User user) {
        userMapper.insertSelective(user);
        return user.getId();
    }

    @Override
    public User findUser(String username, String password) {
        User finded = this.selectByIdentity(username);
        if (finded != null) {
            if (finded.getPassword().equals(DigestUtils.md5Hex(password))) {
                return finded;
            }
        }
        return null;
    }

    @Override
    public User selectOne(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo<User> selectByCondition(User user, Integer pageNum, Integer pageSize) {

        PageHelper.startPage(pageNum, pageSize);
        List<User> users = this.selectByCondition(user);
        PageInfo<User> pageInfo = new PageInfo<>(users);
        return pageInfo;
    }

    @Override
    public List<User> selectByCondition(User user) {
        return this.getUsers(user, false);
    }

    @Override
    public List<User> selectAllUser(User user) {
        return this.getUsers(user, true);
    }

    public List<User> getUsers(User user, Boolean selectAllGroup) {
        if (selectAllGroup == null) {
            selectAllGroup = false;
        }
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andStatusGreaterThan(0);
        if (!selectAllGroup) {
            criteria.andGroupidGreaterThan(1);//(-1-未分组,1-超级管理员)
        }
        if (user != null) {
            if (user.getId() != null) {
                criteria.andIdEqualTo(user.getId());
            }
            if (user.getGroupid() != null) {
                criteria.andGroupidEqualTo(user.getGroupid());
            }
            if (StringUtils.isNotBlank(user.getIdentity())) {
                criteria.andIdentityLike("%" + user.getIdentity() + "%");
            }
            if (StringUtils.isNotBlank(user.getRealname())) {
                criteria.andRealnameLike("%" + user.getRealname() + "%");
            }
            if (StringUtils.isNotBlank(user.getRemark())) {
                criteria.andRemarkLike("%" + user.getRemark() + "%");
            }
        }
        return userMapper.selectByExample(example);
    }

    @Override
    public Integer updateOne(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public Integer deleteOne(Integer id) {
        User user = new User();
        user.setId(id);
        user.setStatus(-1);
        return updateOne(user);
    }

    @Override
    public Integer modifyPwd(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public List<User> selectByGroupId(Integer groupId) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andStatusGreaterThan(0);
        if (groupId != null) {
            criteria.andGroupidEqualTo(groupId);
        }
        return userMapper.selectByExample(userExample);
    }

    @Override
    public List<User> selectDever() {
        return selectByGroupId(UserGroup.DEVER.getGroupId());
    }

    @Override
    public User selectByIdentity(String identity) {
        User condition = new User();
        condition.setIdentity(identity);
        List<User> users = this.selectByCondition(condition);
        for (User u : users) {
            if (u.getIdentity().equalsIgnoreCase(identity)) {
                return u;
            }
        }
        return null;
    }

    @Autowired
    TcaseService tcaseService;

    @Override
    public List<User> selectCaseDesigners() {
        List<String> caseDesigners = tcaseService.selectCaseDesigners();
        List<User> allUsers = this.selectAllUser(null);
        List<User> caseDesignersUser = allUsers.stream().filter(user -> caseDesigners.contains(user.getRealname())).collect(Collectors.toList());
        return caseDesignersUser;
    }

    @Autowired
    TcustomService tcustomService;

    @Override
    public List<User> selectCustomUsers() {
        List<String> customUsers = tcustomService.selectCustomUsers();
        List<User> allUsers = this.selectAllUser(null);
        List<User> ret = allUsers.stream().filter(user -> customUsers.contains(user.getRealname())).collect(Collectors.toList());
        return ret;
    }
}
