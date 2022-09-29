package com.aliyunidaas.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/logout-success")
    public String logoutSuccess() {
        return "logout-success";
    }
}
