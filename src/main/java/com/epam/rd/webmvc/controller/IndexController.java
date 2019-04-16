package com.epam.rd.webmvc.controller;

import com.epam.rd.webmvc.exception.DomainException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
class IndexController {

    @SuppressWarnings("SameReturnValue")
    @GetMapping
    public String showIndex(Model model) {
        model.addAttribute("user", "John");
        return "index";
    }

    @GetMapping("exception")
    public String exception() {
        throw new DomainException();
    }
}
