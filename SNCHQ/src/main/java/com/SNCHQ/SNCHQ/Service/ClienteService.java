package com.SNCHQ.SNCHQ.Service;

import com.SNCHQ.SNCHQ.Modelo.ClienteModelo;
//import com.SNCHQ.SNCHQ.Repository.ClienteRepository;
import com.SNCHQ.SNCHQ.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public void novoCliente(ClienteModelo cliente){
        clienteRepository.save(cliente);
    }
}
