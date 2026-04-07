package br.inatel.cdg.modelo.computador;

public class SistemaOperacional {

    //Membros da classe
    private String nome;
    private int tipo;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTipo(int tipo){
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }
}
