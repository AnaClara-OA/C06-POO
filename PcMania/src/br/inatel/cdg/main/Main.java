package br.inatel.cdg.main;
import java.util.Scanner;

//Importando as outras classes
import br.inatel.cdg.modelo.computador.HardwareBasico;
import br.inatel.cdg.modelo.computador.MemoriaUSB;
import br.inatel.cdg.modelo.computador.SistemaOperacional;
import br.inatel.cdg.modelo.computador.Computador;
import br.inatel.cdg.modelo.ProcessarPedido;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Computador[] computadores = new Computador[10];
        int i = 0;

        System.out.println("Seja bem-vindo(a) ao PCMania!");
        System.out.println("Digite a promoção que você gostaria de comprar:");

        int codigo = entrada.nextInt();

        while(codigo != 0){

            switch(codigo){

                case 1:

                    //Cria computador 1
                    Computador c1 = new Computador();
                    c1.setMarca("Apple");
                    c1.setPreco(587);

                    //Cria 1 parte do hardware - Processadir
                    HardwareBasico h1 = new HardwareBasico();
                    h1.setNome("Processador Core i3");
                    h1.setCapacidade(2200);

                    //Cria 2 parte do hardware - RAM
                    HardwareBasico h2 = new HardwareBasico();
                    h2.setNome("RAM");
                    h2.setCapacidade(8);

                    //Cria 3 parte do hardware - HD
                    HardwareBasico h3 = new HardwareBasico();
                    h3.setNome("HD");
                    h3.setCapacidade(500);

                    c1.addHardware(h1,0);
                    c1.addHardware(h2,1);
                    c1.addHardware(h3,2);

                    SistemaOperacional so1 = new SistemaOperacional();
                    so1.setNome("macOS Sequoia");
                    so1.setTipo(64);
                    c1.setSistemaOperacional(so1);

                    MemoriaUSB m1 = new MemoriaUSB();
                    m1.setNome("Pen-drive");
                    m1.setCapacidade(16);
                    c1.addMemoriaUSB(m1);

                    computadores[i++] = c1;
                    break;

                case 2:
                    Computador c2 = new Computador();
                    c2.setMarca("Samsung");
                    c2.setPreco(1821);

                    HardwareBasico h4 = new HardwareBasico();
                    h4.setNome("Processador Core i5");
                    h4.setCapacidade(3370);

                    HardwareBasico h5 = new HardwareBasico();
                    h5.setNome("RAM");
                    h5.setCapacidade(16);

                    HardwareBasico h6 = new HardwareBasico();
                    h6.setNome("HD");
                    h6.setCapacidade(1000);

                    c2.addHardware(h4,0);
                    c2.addHardware(h5,1);
                    c2.addHardware(h6,2);

                    SistemaOperacional so2 = new SistemaOperacional();
                    so2.setNome("Windows 8");
                    so2.setTipo(64);
                    c2.setSistemaOperacional(so2);

                    MemoriaUSB m2 = new MemoriaUSB();
                    m2.setNome("Pen-drive");
                    m2.setCapacidade(32);
                    c2.addMemoriaUSB(m2);

                    computadores[i++] = c2;
                    break;

                case 3:
                    Computador c3 = new Computador();
                    c3.setMarca("Dell");
                    c3.setPreco(6265);

                    HardwareBasico h7 = new HardwareBasico();
                    h7.setNome("Processador Core i7");
                    h7.setCapacidade(4500);

                    HardwareBasico h8 = new HardwareBasico();
                    h8.setNome("RAM");
                    h8.setCapacidade(32);

                    HardwareBasico h9 = new HardwareBasico();
                    h9.setNome("HD");
                    h9.setCapacidade(2000);

                    c3.addHardware(h7,0);
                    c3.addHardware(h8,1);
                    c3.addHardware(h9,2);

                    SistemaOperacional so3 = new SistemaOperacional();
                    so3.setNome("Windows 10");
                    so3.setTipo(64);
                    c3.setSistemaOperacional(so3);

                    MemoriaUSB m3 = new MemoriaUSB();
                    m3.setNome("HD Externo");
                    m3.setCapacidade(1000);
                    c3.addMemoriaUSB(m3);

                    computadores[i++] = c3;
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

            System.out.println("Digite outro código, 0 para sair:");
            codigo = entrada.nextInt();
        }

        float total = 0;

        System.out.println(" ");
        System.out.println("Carrinho:");

        for(int j = 0; j < i; j++){
            computadores[j].mostraPCConfigs();
            total += computadores[j].getPreco();
            System.out.println();
        }

        System.out.println("Total da compra: " + total);

        ProcessarPedido.processar(computadores);

        //Fechar a entrada de dados
        entrada.close();
    }
}