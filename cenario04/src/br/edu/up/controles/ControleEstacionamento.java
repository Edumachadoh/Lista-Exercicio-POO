package br.edu.up.controles;

import br.edu.up.modelos.Carro;
import br.edu.up.modelos.Estacionamento;
import br.edu.up.telas.MensagensEstacionamento;
import br.edu.up.util.Prompt;

public class ControleEstacionamento {
    private Carro[] carros;
    private Estacionamento estacionamento;
    private int carroRetirado;
    private boolean checarCarroRetirado;
    

    public ControleEstacionamento() {  
        this.carros = new Carro[10];
        this.estacionamento = new Estacionamento();
        for (int i = 0; i < carros.length; i++) {
            carros[i] = new Carro();
        }
    }

    public void AdicionarCarro(String placa, String cor, String modelo, int vagas, int entradas) {
        Carro carro = new Carro();   
        

        carro.setModelo(modelo);
        carro.setPlaca(placa);
        carro.setCor(cor);

        
        estacionamento.setEntradas(entradas);
        estacionamento.setVagas(vagas);


        // System.out.printf("Carro retirado: %d\n", this.carroRetirado);
        // System.out.printf("Checar carro retirado: %b", this.checarCarroRetirado);
        
        if (estacionamento.getChecarCarroRetirado() == true) {
            this.carros[carroRetirado - 1] = carro;
            checarCarroRetirado = false;
            System.out.printf("Funcionou loop, carro retirado");
        } else {
            this.carros[9 - vagas] = carro;
           
        }
        
        
}

    public void RemoverCarro(String placaRetirar, int saidas, int vagas) {
        estacionamento.setSaidas(saidas);
        estacionamento.setVagas(vagas);
        
       
        
       
         for (int i = 9; i >= 0; i--) {
            String placaComparar = this.carros[i].getPlaca();

            for (int f = 0; f < placaComparar.length(); f ++) {
                char charplacaComparar = placaComparar.charAt(f); 
                char charplacaRetirar = placaRetirar.charAt(f);

                if (charplacaComparar == charplacaRetirar) {
                   estacionamento.setChecarCarroRetirado(true); 
                }
            }   
            
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

    


  
    
    

    
    


    



