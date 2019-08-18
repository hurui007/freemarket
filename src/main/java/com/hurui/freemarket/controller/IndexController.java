package com.hurui.freemarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String welcome(Map<String, Object> model, HttpServletRequest request){
        return "index";
    }

    @RequestMapping("/cpone")
    public String cpOne(HttpServletRequest request, HttpServletResponse response){
        request.setAttribute("intVar", "100");
        return "cpone";
    }
}
