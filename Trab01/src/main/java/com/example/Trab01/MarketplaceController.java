package com.example.Trab01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MarketplaceController {
    @Autowired
    private MarketplaceService marketplaceService;
    @GetMapping("/consulta")
    public String consultar() {
        return marketplaceService.processarDados("Consulta");
    }
    @PostMapping("/avaliar")
    public String avaliar(@RequestBody String dados) {
        return marketplaceService.processarDados(dados);
    }
    @GetMapping("/ajuda")
    public String obterAjuda() {
        return "estudante: Jorge Antônio" + "projeto: Consulta de MarketPlace";
    }
}