package com.example.kinosamochodowe.controller;

import com.example.kinosamochodowe.model.Film;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("film", new Film("John Wick 4 / napisy",
                "Chad Stahelski",
                "Keanu Reeves, Donnie Yen, Bill Skarsgård, SkarsIan McShane",
                "Shay Hatten, Michael Finch",
                "Thriller, Akcja",
                169,
                "USA",
                2023,
                "John Wick odkrywa sposób na pokonanie Gildii Zabójców. Zanim jednak odzyska wolność, będzie musiał stawić czoła nowemu wrogowi i jego sojusznikom, z którymi stoczy walki na kilku kontynentach.",
                "john_wick.jpg"));
        return "index";
    }
}
