package com.gugy.onlinux.controller;

import com.gugy.onlinux.entities.UserBean;
import com.gugy.onlinux.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author GGY
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/insert")
    public void insert(UserBean userBean){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(new Date());
        userBean.setCreateTime(format);
        userBean.setModifyTime(format);
        userService.insert(userBean);
    }

    @GetMapping("/userList")
    public List<UserBean> findAll(){
        return userService.findAll();
    }

    @PostMapping("/update")
    public void update(UserBean userBean){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(new Date());
        userBean.setModifyTime(format);
        userService.update(userBean);
    }
}
