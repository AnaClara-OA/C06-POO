package br.inatel.cdg.modelo.computador;
public class HardwareBasico {

    private String nome;
    private float capacidade;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCapacidade(float capacidade){
        this.capacidade = capacidade;
    }

    public String getNome(){
        return nome;
    }

    public float getCapacidade(){
        return capacidade;
    }
}