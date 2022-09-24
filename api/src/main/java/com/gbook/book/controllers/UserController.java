package com.gbook.book.controllers;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class UserController {
    @GetMapping("/mypage_lend")
    public String loadMyPageLendRecords(@CookieValue(value = "user_no", required = false) String userNo) {
        return "mypage-lend";
    }
}
