package com.SNCHQ.SNCHQ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Sistema de Notificação de Cheques;
//Assim que o cheque entrar em compensação, sistema enviará uma notificação ao cliente;
//Cadastrar cliente:
//	Nome;
//	Banco;
//	Agência;
//	Conta;
//	e-mail;
//	celular;
//Cadastrar cheque:
//	numero;
//	valor;
//	data de depósito/notificação;
//Notificação:
//	ENUM (EMAIL, CELULAR);
//	Mensagem: Prezado cliente, cheque número ... emitido pela (ag e conta), entrou em compensação
//				e será descontado nesta data;
@SpringBootApplication
public class SnchqApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnchqApplication.class, args);
	}

}
