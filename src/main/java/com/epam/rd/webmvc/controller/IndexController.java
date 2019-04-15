package com.epam.rd.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/")
class IndexController {

    @SuppressWarnings("SameReturnValue")
    @GetMapping
    public String showIndex(Model model) {
        model.addAttribute("user", "John");
        return "index";
    }

}
