package com.one.expertproject.common;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class control {

    @RequestMapping(value = "goto.do")
    public String sys(){
        return "index";
    }
}
