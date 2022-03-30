package com.study.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginPageController {

    // 로그인 페이지
    @GetMapping("")
    public String openLoginPage(){
        return "login/login";
    }
}
