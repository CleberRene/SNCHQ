package com.SNCHQ.SNCHQ.Controller;

import com.SNCHQ.SNCHQ.Modelo.ChequeModelo;
import com.SNCHQ.SNCHQ.Service.ChequeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ChequeController {

    List<ChequeModelo> cheques = new ArrayList<>();

    @GetMapping("/cheque/teste")
    public String Teste(){
        return "Cheque teste aqui";
    }

    @GetMapping("/cheques")
    public List<ChequeModelo> getCheques(){
        return cheques;
    }

    @PostMapping("/cheque/novo")
    public String novoCheque (@RequestBody ChequeModelo chequeModelo){
        cheques.add(chequeModelo);
        return "Cheque emitido";
    }



}
