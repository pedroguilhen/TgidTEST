package com.test.testTgid.model;
import java.util.ArrayList;
import java.util.List;

public class EmpresaModel {
	private int cnpj;
    private String nome;
    private double saldo;
    private List<ClienteModel> clientes;

    public EmpresaModel(int cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.saldo = 0;
        this.clientes = new ArrayList<>();
    }

    public int getCnpj() {
        return cnpj;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void adicionarCliente(ClienteModel cliente) {
        clientes.add(cliente);
    }

    public void realizarDeposito(double valor) {
        saldo += valor;
        enviarCallback("Depósito realizado: +" + valor);
    }

    public void realizarSaque(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            enviarCallback("Saque realizado: -" + valor);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    private void enviarCallback(String mensagem) {
        System.out.println("Enviando callback para " + nome + ": " + mensagem);
    }

    public void notificarCliente(ClienteModel cliente, String mensagem) {
        System.out.println("Notificando cliente " + cliente.getNome() + ": " + mensagem);
    }
}