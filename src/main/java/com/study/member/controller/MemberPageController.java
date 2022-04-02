package com.study.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberPageController {

    //회원가입 페이지
    @GetMapping("/signup")
    public String openSignUpPage(){
        return "member/signup";
    }
}
