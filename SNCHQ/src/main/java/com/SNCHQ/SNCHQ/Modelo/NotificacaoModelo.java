package com.SNCHQ.SNCHQ.Modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class NotificacaoModelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nomecanal;
    private String mensagem;
    private String status;

    public String getNomecanal() {
        return nomecanal;
    }

    public void setNomecanal(String nomecanal) {
        this.nomecanal = nomecanal;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
