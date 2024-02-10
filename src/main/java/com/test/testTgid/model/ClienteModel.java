package com.test.testTgid.model;

public class ClienteModel {
	private String cpf;
    private String nome;
    private EmpresaModel empresa;

    public ClienteModel(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public EmpresaModel getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaModel empresa) {
        this.empresa = empresa;
        empresa.adicionarCliente(this);
    }
}

