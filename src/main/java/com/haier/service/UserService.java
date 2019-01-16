package com.haier.service;

import com.github.pagehelper.PageInfo;
import com.haier.po.User;

import java.util.List;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/5/12 15:26
 */
public interface UserService {

    Integer insertOne(User user);

    //如果用户名和密码存在并匹配,返回User,否则返回null
    User findUser(String username, String password);

    //根据id查找用户
    User selectOne(Integer id);

    //综合条件查询用户列表-带分页
    PageInfo<User> selectByCondition(User user, Integer pageNum, Integer pageSize);

    //综合条件查询用户列表-不带分页
    List<User> selectByCondition(User user);

    List<User> selectAllUser(User user);
    //根据主键更新用户
    Integer updateOne(User user);

    //删除用户(逻辑删除)
    Integer deleteOne(Integer id);

    //修改用户密码
    Integer modifyPwd(User user);

    //按groupId查询相应user List
    List<User> selectByGroupId(Integer groupid);

    //按groupId查询开发人员,上海组(11-19)返回上海开发组(12),杭州返回杭州开发组
    List<User> selectDever();

    User selectByIdentity(String identity);

    //用例设计人员,用于用例列表筛选下拉框数据填充
    List<User> selectCaseDesigners();

    List<User> selectCustomUsers();
}
