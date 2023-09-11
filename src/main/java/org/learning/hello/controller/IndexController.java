package org.learning.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//questa annotation identifica la classe come Controller
@RequestMapping("/")// indica la rotta a cui rispondono i metodi di questo controller

public class IndexController {

    @GetMapping// indica che risponde a richieste di tipo GET
    public String index(){

        // ritorna una stringa che è il nome del template che si trova in resources/templates
        return "homepage";
    }


    @GetMapping("/about")
    public String aboutUs(){
        // ritorna il nome del template about.html che si trova in resources/templates
        return "about";
    }
    @GetMapping("/termsandconditions")
    public String termsAndConditions(){
        return "termsAndConditions";
    }
}
