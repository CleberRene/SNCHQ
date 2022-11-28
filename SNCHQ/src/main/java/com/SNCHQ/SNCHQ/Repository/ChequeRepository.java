package com.SNCHQ.SNCHQ.Repository;

import com.SNCHQ.SNCHQ.Modelo.ChequeModelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ChequeRepository extends JpaRepository<ChequeModelo, String>{
    ChequeModelo findBynumeroCheque(String numeroCheque);
    List<ChequeModelo> findByvalorCheque(String valorCheque);



}
