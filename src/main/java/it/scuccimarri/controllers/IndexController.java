package it.scuccimarri.controllers;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index"})
    public String getIndexPage() {
        System.out.println("Recipe Application - 123");
        return "index";
    }
}
