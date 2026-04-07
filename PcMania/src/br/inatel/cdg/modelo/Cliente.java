package br.inatel.cdg.modelo;

public class Cliente {

    //Membros da Classe
    private String nome;
    private String cpf;

    //Não está sendo usado no código mas foi pedido no diagrama, por isso mantive

    //Getters e Setters
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getNome(){
        return this.nome;
    }

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }


}
