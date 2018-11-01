package com.task.testing.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@Controller
public class WelcomeController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome(ModelMap modelMap) {
        modelMap.addAttribute("time", new Date());
        modelMap.addAttribute("message", "hello world");
        return "welcome";
    }
}
