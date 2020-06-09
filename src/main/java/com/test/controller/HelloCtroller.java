package com.test.controller;

import com.mysql.cj.util.StringUtils;
import com.test.model.User;

import com.test.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloCtroller {
    @Autowired
    UserServiceImpl userService ;
    @GetMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }
    @PostMapping("/login")
     public String login(ModelMap modelMap, @RequestParam("username") String username, @RequestParam("password") String password){
        User user = userService.getUser(username, password);
        if(user != null){
            modelMap.put("user",user);
            return "table";
        }else{
            modelMap.put("error","登入失败");
            return "index";
        }

    }
    @GetMapping("/")
    public String index(ModelMap modelMap){
        modelMap.put("name","xiaoliu");
        return "index";
    }
}
