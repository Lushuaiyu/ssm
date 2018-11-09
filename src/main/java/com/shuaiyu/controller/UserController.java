package com.shuaiyu.controller;

import com.shuaiyu.po.User;
import com.shuaiyu.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lsy on 2018/11/8 0008.
 *
 * @author Administrator
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Resource
    private UserService userService;


    @RequestMapping("getUser")
    @ResponseBody
    public User getUser(Integer id) throws Exception {
        return userService.queryById(id);
    }
    @RequestMapping("delUser")
    @ResponseBody
    public Integer delUser(Integer id) throws Exception {
        return userService.delete(id);
    }
    @RequestMapping("insetUser")
    @ResponseBody
    public Integer insetUser( User user) throws Exception {
       return userService.insert(user);
    }

    @RequestMapping("updateUser")
    @ResponseBody
    public Integer updateUser(User user) throws Exception {
        return userService.update(user);
    }

    @RequestMapping("queryCount")
    @ResponseBody
    public Integer queryCount(String userName) throws Exception {
        Map map = new HashMap();
        map.put("userName", userName);
        return userService.queryCountByParams(map);
    }
    @RequestMapping("updateParams")
    @ResponseBody
    public Integer updateParams(String userPwd) throws Exception {
        Map map = new HashMap(16);
        Integer [] ids = new Integer[]{49, 50, 51, 52};
        map.put("ids",ids);
        map.put("userPwd", userPwd);
        return userService.updateBatch(map);
    }
}
