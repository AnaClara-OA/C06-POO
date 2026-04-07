package br.inatel.cdg.modelo.computador;
import br.inatel.cdg.modelo.computador.HardwareBasico;
import br.inatel.cdg.modelo.computador.MemoriaUSB;

public class Computador {

    //Membros da Classe
    private String marca;
    private float preco;

    private HardwareBasico[] hardwares = new HardwareBasico[3];
    private SistemaOperacional so;
    private MemoriaUSB musb;

    public Computador(String marca, float preco){
        this.marca = marca;
        this.preco = preco;
    }

    public Computador() {}

    public void addHardware(HardwareBasico hw, int pos){
        hardwares[pos] = hw;
    }

    public void setSistemaOperacional(SistemaOperacional so){
        this.so = so;
    }

    public void addMemoriaUSB(MemoriaUSB musb){
        this.musb = musb;
    }

    public void mostraPCConfigs(){

        //Informações de hardware
        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);

        for(int j = 0; j < hardwares.length; j++) {
            if (hardwares[j] != null) {
                System.out.println(hardwares[j].getNome() + ": " + hardwares[j].getCapacidade());
            }
        }

        //Informações do Sistema operacional
        if(so != null){
            System.out.println("Sistema Operacional: " + so.getNome());
            System.out.println("Tipo: " + so.getTipo() + " bits");
        }

        if(musb != null){
            System.out.println("Acompanha: " + musb.getNome());
            System.out.println("Tipo: " + musb.getCapacidade() + " Gb");
        }
    }

    //Getters e setters
    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }

    public float getPreco(){
        return preco;
    }

    public void setMemoriaUSB(MemoriaUSB musb1) {

    }
}
