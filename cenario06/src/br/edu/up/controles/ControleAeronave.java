package br.edu.up.controles;

import java.util.Arrays;

import br.edu.up.modelos.*;

public class ControleAeronave {
    // private Passageiro[] passageiros;
    // private Tripulante[] tripulantes;
    private Aeronave aeronave;
    private Pessoa[] pessoas;


    public Comandante buscarComandante() {
 

        for (Pessoa pessoa : pessoas) {

            if(pessoa instanceof Comandante){
                Comandante c = (Comandante) pessoa;
                return c;
            }
            
        }

        return null;
       
    }

    public ControleAeronave() {
      
        this.pessoas = new Pessoa[10];
        // this.passageiros = new Passageiro[10];

        // for (int i = 0; i < passageiros.length; i++) {
        //     passageiros[i] = new Passageiro(null, null, null, i);
        // }
        
        // this.tripulantes = new Tripulante[10];
        // this.tripulantes[0] = new Comandante(null, null, 0, 0, 0);
        // this.tripulantes[1] = new Comissario(null, null, 0, 0, null);
       

    }

    public void adicionarAeronave(Aeronave aeronave) {
       
        this.aeronave = aeronave;


    }


    public void adicionarPassageiro(Passageiro passageiro) {
       
        

        this.pessoas[0] = passageiro;

        // this.aeronaves[numAeronave].setPessoa(pessoa);
        

    }

    
    
    public void adicionarComandante( Comandante comandante ) {
        this.pessoas[1] = comandante; 
        // comandante.setIdAeronautica(idAeronautica);
        // comandante.setIdMatricula(idMatricula);
        // comandante.setNome(nome);
        // comandante.setRg(rg);
        // comandante.setTotalHorasVoo(totalHorasVoo);       
    }

    public void adicionarComissario(Comissario comissario) {
        this.pessoas[2] = comissario;
        // comissario.setIdAeronautica(idAeronautica);
        // comissario.setIdMatricula(idMatricula);
        // comissario.setNome(nome);
        // comissario.setRg(rg);
        // comissario.setIdioma(idiomas);
        
        


        // String resultado = "";
        // if (tripulantes[1] instanceof Comissario) {
        //     Comissario comissario1 = (Comissario) tripulantes[1]; // Downcast para Comissario
        //     resultado += "Nome do Comissário: " + comissario.getNome() + "\n";
        //     resultado += "Idiomas: " + comissario.getIdioma() + "\n";
        //     // Continue adicionando outros atributos do comissário, se necessário
        // } 
        // System.out.println(resultado);
        
    }

  

    

}
