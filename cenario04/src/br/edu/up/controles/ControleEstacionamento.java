package br.edu.up.controles;

import br.edu.up.modelos.Carro;
import br.edu.up.modelos.Estacionamento;


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
     
        estacionamento.setEntradas(entradas);
        estacionamento.setVagas(vagas);
        
        if (estacionamento.getChecarCarroRetirado() == true) {
            this.carros[estacionamento.getCarroRetirado()] = carro;
            estacionamento.setChecarCarroRetirado(false);
            System.out.printf("Funcionou loop, carro retirado\n");
        } else {
            this.carros[9 - vagas] = carro;
        }
        
        this.carros[9 - vagas] = carro;
        
        System.out.printf("Placa: %s\n", this.carros[9 - vagas].getPlaca());
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
                      System.out.printf("Carro retirado 1 !!!!");
                      estacionamento.setChecarCarroRetirado(true);
                      estacionamento.setCarroRetirado(i);
                      this.carros[i] = null;
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

   
    public void imprimirCarros() {
        System.out.printf("Placa: %s\n", this.carros[0].getPlaca());
        System.out.printf("Modelo: %s\n", this.carros[0].getModelo());
        System.out.printf("Cor: %s\n", this.carros[0].getCor());
        System.out.printf("Placa: %s\n", this.carros[1].getPlaca());
        System.out.printf("Modelo: %s\n", this.carros[1].getModelo());
        System.out.printf("Cor: %s\n", this.carros[1].getCor());
        System.out.printf("Placa: %s\n", this.carros[2].getPlaca());
        System.out.printf("Modelo: %s\n", this.carros[2].getModelo());
        System.out.printf("Cor: %s\n", this.carros[2].getCor());
        System.out.printf("Placa: %s\n", this.carros[3].getPlaca());
        System.out.printf("Modelo: %s\n", this.carros[3].getModelo());
        System.out.printf("Cor: %s\n", this.carros[3].getCor());
        System.out.printf("Placa: %s\n", this.carros[4].getPlaca());
        System.out.printf("Modelo: %s\n", this.carros[4].getModelo());
        System.out.printf("Cor: %s\n", this.carros[4].getCor());
        System.out.printf("Placa: %s\n", this.carros[5].getPlaca());
        System.out.printf("Modelo: %s\n", this.carros[5].getModelo());
        System.out.printf("Cor: %s\n", this.carros[5].getCor());
    }


    

    

    
    
}  

    


  
    
    

    
    


    



