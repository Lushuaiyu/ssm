package com.shuaiyu.service;

import com.shuaiyu.base.BaseService;
import com.shuaiyu.dao.UserMapper;
import com.shuaiyu.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lsy on 2018/11/8 0008.
 *
 * @author Administrator
 */
@Service
public class UserService extends BaseService<User> {
    @Autowired
    private UserMapper userMapper;
}
