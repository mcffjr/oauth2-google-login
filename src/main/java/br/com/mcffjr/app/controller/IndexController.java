package br.com.mcffjr.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String textoPublico(){
        return "Público!";
    }

    @GetMapping("restrito")
    public String textoRestrito(){
        return "Restrito!";
    }

}
