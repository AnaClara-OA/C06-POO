package br.inatel.cdg.modelo.computador;

public class MemoriaUSB {

    //Membros da classe

    private String nome;
    private int capacidade;


    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public String getNome() {
        return nome;
    }
}
