package br.edu.up.telas;

import br.edu.up.modelos.Competencia;
import br.edu.up.util.Prompt;

public class MenuCompetencias {
    public static Competencia[] criarCompetencias(){
        int escolha;

        Competencia[] competencias = new Competencia[0];

        //loop
        do{ 
            Competencia[] arrayTeste = new Competencia[competencias.length + 1];

            for (int i = 0; i < competencias.length; i++) {
                arrayTeste[i] = competencias[i];                
            }

            arrayTeste[arrayTeste.length - 1] = setCompetencia();

            competencias = new Competencia[arrayTeste.length];
            competencias = arrayTeste;
            
            escolha = Prompt.lerInteiro("Colocar mais uma competência?(0 para parar)");
        }while(escolha != 0);

        return competencias;
    }
    public static Competencia setCompetencia(){

        Competencia competencia = new Competencia();
        int tipo;
        do{
            tipo = Prompt.lerInteiro("Qual tipo de Competencia:\n(1- Necessária / 2- Complementar)");   

            switch (tipo) {
                case 1:   
                    //NECESSARIA
                    competencia.setTipo(Competencia.Tipo.NECESSARIA);    
                    break;
                case 2:
                    //COMPLEMENTAR
                    competencia.setTipo(Competencia.Tipo.COMPLEMENTAR);
                    break;
                default:
                    Prompt.imprimir("escolha inválida");
                    break;
            }
        }while(tipo < 0 || tipo > 2);

        return competencia;
    }
}
