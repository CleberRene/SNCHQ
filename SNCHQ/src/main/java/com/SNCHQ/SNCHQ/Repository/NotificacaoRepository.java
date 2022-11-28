package com.SNCHQ.SNCHQ.Repository;

import com.SNCHQ.SNCHQ.Modelo.NotificacaoModelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificacaoRepository extends JpaRepository<NotificacaoModelo, Integer> {
    NotificacaoModelo findByid (Integer Id);
}
