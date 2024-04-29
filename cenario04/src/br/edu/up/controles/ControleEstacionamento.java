package br.edu.up.controles;

import br.edu.up.modelos.Carro;
import br.edu.up.util.Prompt;

public class ControleEstacionamento {
    private Carro[] carros;
    private int controle;
    private int vagas;
    

    public ControleEstacionamento() {  
        this.carros = new Carro[10];
        
    }


    public void setVagas(int vagas) {
        if (vagas == 1) {
            this.vagas += 1;
        } else if (vagas == 2) {
            this.vagas -= 1;
        }
    }

    

    public int getVagas() {
        return vagas;
    }


    public void setControle(int controle) {
        this.controle = controle;
        if (this.controle == 1) {
            Carro carro = new Carro();

            

            // System.out.printf("Carro %d\n", this.vagas + 1);
            // System.out.printf("Modelo:");
            // carro.setModelo(Prompt.lerLinha(""));
            // System.out.printf("Placa:");
            // carro.setPlaca(Prompt.lerLinha(""));
            // System.out.printf("Cor:");
            // carro.setCor(Prompt.lerLinha(""));

            this.carros[0] = carro;
            
        } else if (this.controle == 2) {

        };
    }
    

    


  
    
    

    
    


    


}
