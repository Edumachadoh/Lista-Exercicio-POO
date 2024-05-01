package br.edu.up.controles;

import br.edu.up.modelos.Carro;
import br.edu.up.util.Prompt;

public class ControleEstacionamento {
    private Carro[] carros;
    private int controle;
    private int vagas;
    private int saidas;
    private int entradas;
    private String placaRetirar;
    

    public ControleEstacionamento() {  
        this.carros = new Carro[10];
        
    }


    public void setVagas(int vagas) {
       this.vagas = vagas;
    }

    

    public void setSaidas(int saidas) {
        this.saidas = saidas;
    }


    public void setEntradas(int entradas) {
        this.entradas = entradas;
    }


    public int getVagas() {
        return vagas;
    }


    public void setControle(int controle) {
        this.controle = controle;
    }

    public void setCarros(Carro[] carros) {
        this.carros = carros;
    }

    public void setPlacaRetirar(String placaRetirar) {
        this.placaRetirar = placaRetirar;
    }




    public void AdicionarRemoverCarro() {
            if (this.vagas == 0) {
                System.out.printf("---------------------------\n");
                System.out.printf("Estacionamento cheio!\n");
            } else if (this.vagas == 11) {
                this.vagas = 10;
            } else { 
                if (this.controle == 1) {

                Carro carro = new Carro();
                 
                System.out.printf("---------------------------\n");
                System.out.printf("Vagas %d\n", this.vagas);
                System.out.printf("Carro %d\n", 11 - this.vagas);
                System.out.printf("Modelo:");
                carro.setModelo(Prompt.lerLinha(""));
                System.out.printf("Placa:");
                carro.setPlaca(Prompt.lerLinha(""));
                System.out.printf("Cor:");
                carro.setCor(Prompt.lerLinha(""));

                // System.out.printf("Entradas: %d\n", this.entradas);
                
                this.carros[this.vagas - 1] = carro;
                
            } else if (this.controle == 2) {
                String placaRetirar;

                System.out.printf("---------------------------\n");
                System.out.printf("Vagas %d\n", this.vagas);
                System.out.printf("Processo de retirada iniciado...\n");
                System.out.printf("Placa do carro a ser removido:");
                placaRetirar = Prompt.lerLinha("");

                for (int i = 9; i >= 0; i--) {
                    if (this.carros[i] != null && placaRetirar.equals(this.carros[i].getPlaca())) {
                        System.out.printf("Carro retirado!\n" );
                        this.carros[i] = null; 
                    }
                }
                
                // System.out.printf("Saidas: %d\n", this.saidas);
                
            }

       
        }

    }

    public void emitirRelatorio(int entradas, int saidas) {
             double valorTotal = entradas * 5;
             System.out.printf("---------------------------\n");
             System.out.printf("Entradas no período: %d\n", entradas);
            System.out.printf("Saídas no período: %d\n", saidas);
            System.out.printf("Valor do período: R$ %.2f\n", valorTotal);
}
}
    
    

    


  
    
    

    
    


    



