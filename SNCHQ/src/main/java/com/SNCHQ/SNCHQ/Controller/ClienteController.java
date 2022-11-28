package com.SNCHQ.SNCHQ.Controller;

import com.SNCHQ.SNCHQ.Modelo.ChequeModelo;
import com.SNCHQ.SNCHQ.Modelo.ClienteModelo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClienteController {
    List<ClienteModelo> clientes = new ArrayList<>();

    @GetMapping("/cliente/teste")
    public String Teste(){
        return "Cliente teste Aqui";
    }

    @GetMapping("/clientes")
    public List<ClienteModelo> getClientes(){
        return clientes;
    }

    @PostMapping("/cliente/novo")
    public String novoCliente (ClienteModelo clienteModelo) {
//        if (clienteModelo.getCpf().isEmpty()) {
//            return "CPF deve conter 11 números";}

        clientes.add(clienteModelo);
        return "Cliente cadastrado";
    }
}
