package com.SNCHQ.SNCHQ.Repository;

import com.SNCHQ.SNCHQ.Modelo.ClienteModelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModelo, String> {
    @Override
    List<ClienteModelo> findAll();
}
