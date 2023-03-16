package com.minsung.reward.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("hello", "김민성님");

        return "hello";
    }
}
