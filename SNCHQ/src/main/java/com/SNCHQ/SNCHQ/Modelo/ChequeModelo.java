package com.SNCHQ.SNCHQ.Modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.Date;
@Entity
public class ChequeModelo {
    @Id
    private String numeroCheque;
    private  Double valorCheque;
    private String numeroAgencia;
    private String numeroConta;



    public String getNumeroCheque() {
        return numeroCheque;
    }

    public void setNumeroCheque(String numeroCheque) {
        this.numeroCheque = numeroCheque;
    }

    public Double getValorCheque() {
        return valorCheque;
    }

    public void setValorCheque(Double valorCheque) {
        this.valorCheque = valorCheque;
    }



    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
}
