package br.edu.up.controles;

public class DefinirDiasValidos {
    public static int executar(int numMes, boolean bissexto){
        int qtdDias = 0;

        if(numMes == 1 && bissexto == true){
            qtdDias = 29;
        }else if(numMes == 1 && bissexto == false){
            qtdDias = 28;
        } 
        else if(numMes == 0 || numMes == 2 || numMes == 4 || numMes == 6 || numMes == 7 || numMes == 9 || numMes == 11){
            qtdDias = 31;
        }
        else if(numMes == 3 || numMes == 5 || numMes == 8 || numMes == 10){
            qtdDias = 30;
        }
        
        return qtdDias;
    }
}
