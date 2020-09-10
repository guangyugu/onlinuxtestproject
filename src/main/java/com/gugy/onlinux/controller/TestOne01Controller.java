package com.gugy.onlinux.controller;

import com.lonmo.util.DESPlus;
import com.lonmo.util.DESPwd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestOne01Controller {

    @GetMapping("/jiami")
    public String jiami(String str){
        String resultStr = "";
        try {
            DESPlus des = new DESPlus();
            System.out.println("加密后的字符：" + des.encrypt(str));
            System.out.println("解密后的字符：" + des.decrypt(des.encrypt(str)));
            resultStr="加密前的字符："+str+"||"+"加密后的字符：" + des.encrypt(str)+"||"+"解密后的字符：" + des.decrypt(des.encrypt(str));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultStr;
    }
    @GetMapping("/jiami1")
    public String jiami1(String str){
        String resultStr = "";
        try {
            DESPwd des = new DESPwd();
            System.out.println("加密后的字符：" + des.encrypt(str));
            System.out.println("解密后的字符：" + des.decrypt(des.encrypt(str)));
            resultStr="加密前的字符："+str+"||"+"加密后的字符：" + des.encrypt(str)+"||"+"解密后的字符：" + des.decrypt(des.encrypt(str));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultStr;
    }
}
