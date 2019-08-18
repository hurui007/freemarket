package com.hurui.freemarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String welcome(Map<String, Object> model, HttpServletRequest request){
        return "index";
    }
}
