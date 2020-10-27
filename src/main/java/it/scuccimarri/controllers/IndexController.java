package it.scuccimarri.controllers;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jt on 6/1/17.
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){
        return "index";
    }
}
