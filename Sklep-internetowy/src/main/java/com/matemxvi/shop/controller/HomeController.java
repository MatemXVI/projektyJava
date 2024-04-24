package com.matemxvi.shop.controller;

import com.matemxvi.shop.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String home(Model model){
        model.addAttribute("item");
        return "home";
    }
}
