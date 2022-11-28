package com.SNCHQ.SNCHQ.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificacaoController {
    @GetMapping("/notificacao/teste")
    public String Teste(){
        return "Notificação teste aqui";
    }
}
