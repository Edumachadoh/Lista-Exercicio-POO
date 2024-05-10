package br.edu.up.controles;

import br.edu.up.modelos.Carro;
import br.edu.up.modelos.Estacionamento;
import br.edu.up.telas.MensagensEstacionamento;


public class ControleEstacionamento {
    private Carro[] carros;
    private Estacionamento estacionamento;
    

    public ControleEstacionamento() {  
        
        this.carros = new Carro[10];
        this.estacionamento = new Estacionamento();
        
        for (int i = 0; i < carros.length; i++) {
            carros[i] = new Carro();
        }
    }

    public void AdicionarCarro(String placa, String cor, String modelo, int vagas, int entradas) {
        Carro carro = new Carro(modelo, placa, cor);  
     
        
        
        for (int i = 0; i < 9; i ++) {
            if (carros[i].getPlaca() != null) {
                if (carros[i].getPlaca().equals(placa)) {
                    estacionamento.setChecarAdicionarPlaca(true);
                    MensagensEstacionamento.placaExistente();
                
                 }
            }
        }

        if (estacionamento.getChecarAdicionarPlaca() == true) {
            estacionamento.setEntradas(entradas --);
            estacionamento.setVagas(vagas ++); 
        } else {
            estacionamento.setEntradas(entradas);
            estacionamento.setVagas(vagas);
        }


        if (estacionamento.getChecarCarroRetirado() == true) {
            this.carros[estacionamento.getCarroRetirado()] = carro;
            estacionamento.setChecarCarroRetirado(false);
            // System.out.printf("Carro colocado na vaga do recem tirado!\n");
        } else {
            this.carros[9 - vagas] = carro;
        }
        
        this.carros[9 - vagas] = carro;
        
    }

    public void RemoverCarro(String placaDigitada, int saidas, int vagas) {
        estacionamento.setSaidas(saidas);
        estacionamento.setVagas(vagas);
      
        estacionamento.setChecarCarroRetirado(false);
        
        String placaCompararBD = "";
        
       for (int i = 0; i < 9; i ++) {
            if (this.carros[i].getPlaca() != null) {

                placaCompararBD = this.carros[i].getPlaca();
                
                
                if (placaCompararBD.equals(placaDigitada)) {
                      System.out.printf("Carro '%s' retirado!!!!", placaCompararBD);
                      estacionamento.setChecarCarroRetirado(true);
                      estacionamento.setCarroRetirado(i);
                }
            }
       }
       if (estacionamento.getChecarCarroRetirado() == false) {
            MensagensEstacionamento.carroInexistente();
            estacionamento.setSaidas(saidas - 1);
             estacionamento.setVagas(vagas - 1);
       }
    }

    

   public int getEntradasEstacionamento() {
        return estacionamento.getEntradas();

   }

   public int getSaidasEstacionamento() {
        return estacionamento.getSaidas();
    
   }
   public int getVagasEstacionamento() {
        return estacionamento.getVagas();
    }


    public void setCarros(Carro[] carros) {
        this.carros = carros;
    }

 


    

    

    
    
}  

    


  
    
    

    
    


    



