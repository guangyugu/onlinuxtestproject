package com.gugy.onlinux.service;

import com.gugy.onlinux.entities.UserBean;
import com.gugy.onlinux.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author GGY
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void insert(UserBean userBean){
        userMapper.insert(userBean);
    }

    public List<UserBean> findAll(){
       return userMapper.findAll();
    }

    public void update(UserBean userBean){
        userMapper.update(userBean);
    }
}
