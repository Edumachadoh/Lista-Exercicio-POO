package br.edu.up.controles;

import br.edu.up.modelos.Carro;
import br.edu.up.telas.MensagensEstacionamento;
import br.edu.up.util.Prompt;

public class ControleEstacionamento {
    private Carro[] carros;
    private int controle;
    private int vagas;
    private int saidas;
    private int entradas;
    private int carroRetirado;
    private boolean checarCarroRetirado;
    

    public ControleEstacionamento() {  
        this.carros = new Carro[10];
    }

    public void AdicionarCarro(String placa, String cor, String modelo, int vagas, int entradas) {
        Carro carro = new Carro();   
         
        carro.setModelo(modelo);
        carro.setPlaca(placa);
        carro.setCor(cor);

        this.entradas = entradas;
        this.vagas = vagas;

        // System.out.printf("Carro retirado: %d\n", this.carroRetirado);
        // System.out.printf("Checar carro retirado: %b", this.checarCarroRetirado);
        
        if (this.checarCarroRetirado == true) {
            this.carros[carroRetirado - 1] = carro;
            checarCarroRetirado = false;
            
        } else {
            this.carros[this.vagas - 1] = carro;
        }

        
}

    public void RemoverCarro(String placaRetirar, int saidas, int vagas) {
        this.vagas = vagas;
        this.saidas = saidas;

         for (int i = 9; i >= 0; i--) {
            
            if (this.carros[i] != null && placaRetirar.equals(this.carros[i].getPlaca())) {
               
                this.carros[i] = null; 
                this.carroRetirado = i;
                this.checarCarroRetirado = true;
            }   
            
        }
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

    public int getSaidas() {
        return saidas;
    }

    public int getEntradas() {
        return entradas;
    }


    public void setControle(int controle) {
        this.controle = controle;
    }

    public void setCarros(Carro[] carros) {
        this.carros = carros;
    }

   



    

    

    
    
}  

    


  
    
    

    
    


    



