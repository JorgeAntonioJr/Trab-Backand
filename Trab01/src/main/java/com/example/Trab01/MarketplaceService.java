package com.example.Trab01;

import org.springframework.stereotype.Service;

@Service
public class MarketplaceService {
    public String processarDados(String dados) {
        return "Dados processados com sucesso: " + dados;
    }
}
