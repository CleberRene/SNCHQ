package com.SNCHQ.SNCHQ.Service;

import com.SNCHQ.SNCHQ.Modelo.ChequeModelo;
import com.SNCHQ.SNCHQ.Repository.ChequeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChequeService {
    @Autowired
    private ChequeRepository chequeRepository;

    public void novoCheque(ChequeModelo chequeModelo){
        chequeRepository.save(chequeModelo);
    }

    public ChequeModelo buscarNumeroCheque (String numeroCheque) {
        return chequeRepository.findBynumeroCheque(numeroCheque);
    }

}
