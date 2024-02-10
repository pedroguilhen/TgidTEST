package com.test.testTgid.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

import com.test.testTgid.model.ClienteModel;
import com.test.testTgid.model.EmpresaModel;
import com.test.testTgid.view.SistemaView;

@Controller
@RequestMapping("/")
@ResponseBody
public class SistemaController {
	private final EmpresaModel empresa;
	private final SistemaView sistemaView;
	
	@Autowired
	public SistemaController(EmpresaModel empresa, SistemaView sistemaView) {
	    this.empresa = empresa;
	    this.sistemaView = sistemaView;
	}
	
	public void realizarDeposito(double valor) {
	    empresa.realizarDeposito(valor);
	    sistemaView.exibirMensagem("Depósito realizado com sucesso.");
	}
	
	public void realizarSaque(double valor) {
	    empresa.realizarSaque(valor);
	    sistemaView.exibirMensagem("Saque realizado com sucesso.");
	}
	
	public void notificarCliente(ClienteModel cliente, String mensagem) {
	    empresa.notificarCliente(cliente, mensagem);
	    sistemaView.exibirMensagem("Notificação enviada para o cliente.");
	}
}
