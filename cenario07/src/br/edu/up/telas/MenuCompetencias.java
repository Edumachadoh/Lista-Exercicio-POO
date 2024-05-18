package br.edu.up.telas;

import br.edu.up.modelos.Competencia;
import br.edu.up.util.Prompt;

public class MenuCompetencias {
    public static Competencia[] lerCompetencias(){
        int escolha, tipo;

        Competencia[] competencias = new Competencia[0];
        do{
            Competencia competencia = new Competencia();

            do{
            tipo = Prompt.lerInteiro("Qual tipo de Competencia:\n(1- Nescessária / 2- Complementar)");   

            switch (tipo) {
                case 1:   
                    competencia.setTipo(Competencia.Tipo.NECESSARIA);    
                    //competencia.setTipo(Competencia.Tipo.NECESSARIA);
                    break;
                case 2:
                    competencia.setTipo(Competencia.Tipo.COMPLEMENTAR);
                    //competencia.setTipo(Competencia.Tipo.COMPLEMENTAR);
                    break;
                default:
                    Prompt.imprimir("escolha inválida");
                    break;
            }
            }while(tipo < 0 || tipo > 2);

            Competencia[] arrayTeste = new Competencia[competencias.length + 1];

            for (int i = 0; i < competencias.length; i++) {
                arrayTeste[i] = competencias[i];                
            }

            arrayTeste[arrayTeste.length - 1] = competencia;
            competencias = arrayTeste;
            escolha = Prompt.lerInteiro("Colocar mais uma competência?(0 para parar)");
        }while(escolha != 0);

        return competencias;
    }
}
