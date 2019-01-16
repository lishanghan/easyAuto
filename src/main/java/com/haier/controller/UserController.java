package com.haier.controller;

import com.haier.enums.RegexEnum;
import com.haier.enums.StatusCodeEnum;
import com.haier.exception.HryException;
import com.haier.po.User;
import com.haier.response.Result;
import com.haier.service.UserService;
import com.haier.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/5/12 15:11
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    //按主键查询用户
    @PostMapping("/selectOne")
    public Result selectOne(Integer id) {
        return ResultUtil.success(userService.selectOne(id));
    }

    //新增用户
    @PostMapping("/insertOne")
    public Result insertOne(@Validated User user) {
        //用户名校验,只支持邮箱
        if (!user.getIdentity().matches(RegexEnum.EMAIL_REGEX.getRegex())) {
            throw new HryException(StatusCodeEnum.REGEX_ERROR_EMAIL, "用户名必须是邮箱");
        }
        //密码校验,密码只能是数字,字母,英文符号,不包括空格
        if (!user.getPassword().matches(RegexEnum.PWD_REGEX.getRegex())) {
            throw new HryException(StatusCodeEnum.REGEX_ERROR_PWD);
        }
        //数据重复性校验
        User condition = new User();
        condition.setIdentity(user.getIdentity());
        List<User> users = userService.selectAllUser(condition);
        for (User u : users) {
            if (u.getIdentity().equalsIgnoreCase((user.getIdentity()))) {
                throw new HryException(StatusCodeEnum.EXIST_RECORD, "重复的用户名");
            }
        }
        user.setPassword(DigestUtils.md5Hex(user.getPassword()));
        return ResultUtil.success(userService.insertOne(user));
    }

    //更新用户
    @PostMapping("/updateOne")
    public Result updateOne(User user) {
        if (user == null || user.getId() == null) {
            return ResultUtil.error(StatusCodeEnum.PARAMETER_ERROR);
        }
        user.setIdentity(null);
        user.setPassword(null);
        return ResultUtil.success(userService.updateOne(user));
    }

    //删除用户
    @PostMapping("/deleteOne")
    public Result deleteOne(Integer id) {
        return ResultUtil.success(userService.deleteOne(id));
    }

    //综合查询-返回pageInfo
    @PostMapping("/selectByConditionWithPageInfo")
    public Result selectByCondition(User user, Integer pageNum, Integer pageSize) {
        if (pageNum == null || pageSize == null) {
            pageNum = 1;
            pageSize = 10;
        }
        return ResultUtil.success(userService.selectByCondition(user, pageNum, pageSize));
    }

    //综合查询-不带分页信息-返回List
    @PostMapping("/selectByCondition")
    public Result selectByCondition(User user) {
        return ResultUtil.success(userService.selectByCondition(user));
    }

    @PostMapping("/selectCaseDesigners")
    public Result selectCaseDesigners() {
        return ResultUtil.success(userService.selectCaseDesigners());
    }

    @PostMapping("/selectCustomUsers")
    public Result selectCustomUsers() {
        return ResultUtil.success(userService.selectCustomUsers());
    }

    //根据GroupId查询相应组的用户列表
    @PostMapping("/selectByGroupId")
    public Result selectByGroupId(Integer groupId) {
        return ResultUtil.success(userService.selectByGroupId(groupId));
    }

    @PostMapping("/selectDever")
    public Result selectDever() {
        return ResultUtil.success(userService.selectDever());
    }

    //修改用户密码
    @PostMapping("/modifyPwd")
    public Result modifyPwd(String identity, String oldPwd, String newPwd) {
        if (StringUtils.isAnyBlank(identity, oldPwd, newPwd)) {
            throw new HryException(StatusCodeEnum.PARAMETER_ERROR, "用户名,旧密码,新密码任一项不可为空");
        }
        if (!newPwd.matches(RegexEnum.PWD_REGEX.getRegex())) {
            throw new HryException(StatusCodeEnum.REGEX_ERROR_PWD, "请确认输入的新密码");
        }
        //根据identity查询status>0的用户名
        User user = userService.selectByIdentity(identity);
        if (user == null) {
            throw new HryException(StatusCodeEnum.NOT_FOUND, "未发现此用户名:" + identity);
        }

        //用户存在 ,并且旧密码输入正确,则使用新密码更新
        if (!user.getPassword().equals(DigestUtils.md5Hex(oldPwd))) {
            throw new HryException(10087, "旧密码不匹配");
        }
        User update = new User();
        update.setId(user.getId());
        update.setPassword(DigestUtils.md5Hex(newPwd));

        return ResultUtil.success(userService.modifyPwd(update));
    }

    //登录
    @PostMapping("/login")
    public Result login(HttpServletRequest request, HttpServletResponse response, String identity, String password) throws UnsupportedEncodingException {
        HttpSession session;
        User user = null;
        if (!StringUtils.isAnyBlank(identity, password)) {
            if (!identity.contains("@")) {
                identity += "@legain.com";
            }
            user = userService.findUser(identity, password);
        }
        if (user == null) {
            return ResultUtil.error(StatusCodeEnum.LOGIN_ERROR);
        } else {
            session = request.getSession(true);
            session.setMaxInactiveInterval(60 * 60 * 24 * 30);//秒为单位,设置一个月的有效时间
            session.setAttribute("userSession", user.getIdentity());
            //设置cookie信息
            Cookie identityCookie = new Cookie("identityCookie", URLEncoder.encode(user.getIdentity(), "utf-8"));
            identityCookie.setPath("/");
            identityCookie.setMaxAge(Integer.MAX_VALUE);//设置cookie永不过期.setMaxAge单位为秒

            Cookie uidCookie = new Cookie("uidCookie", URLEncoder.encode(user.getId() + "", "utf-8"));
            uidCookie.setPath("/");
            uidCookie.setMaxAge(Integer.MAX_VALUE);//设置cookie永不过期.setMaxAge单位为秒

            Cookie realnameCookie = new Cookie("realnameCookie", URLEncoder.encode(user.getRealname(), "utf-8"));
            realnameCookie.setPath("/");
            realnameCookie.setMaxAge(Integer.MAX_VALUE);

            Cookie groupidCookie = new Cookie("groupidCookie", URLEncoder.encode(user.getGroupid().toString(), "utf-8"));
            groupidCookie.setPath("/");
            groupidCookie.setMaxAge(Integer.MAX_VALUE);

            response.addCookie(identityCookie);
            response.addCookie(realnameCookie);
            response.addCookie(groupidCookie);
            response.addCookie(uidCookie);

            return ResultUtil.success();
        }
    }

    //登出
    @PostMapping("/logout")
    public Result logout(HttpSession session) {
        Object userSession = null;
        if (session != null) {

            userSession = session.getAttribute("userSession");
            if (userSession != null) {
                log.debug("用户session为:" + userSession.toString());
            }
            //清除session即可
            session.invalidate();
            log.debug("用户session清除成功");
        }
        if (userSession != null) {
            return ResultUtil.success("用户session为:" + userSession.toString() + ",登出成功!");
        } else {
            return ResultUtil.success("无用户登录信息,登出成功!");
        }
    }
}
