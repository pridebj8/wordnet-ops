package com.wordnet.ops.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping(value="/hi")
    public String test(){
        return "test";
    }
}
