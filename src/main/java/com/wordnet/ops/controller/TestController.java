package com.wordnet.ops.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping(value="/hi")
    @ResponseBody
    public String test(){
        return "test";
    }
}
