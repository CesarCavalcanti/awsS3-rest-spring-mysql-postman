package br.edu.infnet.produtoscotacoes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AcessoController {

    @GetMapping (value = "/")
    public String telaIndex (){
        return "index.jsp";
    }

}
