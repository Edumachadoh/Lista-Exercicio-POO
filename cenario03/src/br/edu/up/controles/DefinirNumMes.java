package br.edu.up.controles;

public class DefinirNumMes{
    public static int executar(String nomeMes){
        int numMes = 0;
        
        switch (nomeMes) {

            case "Janeiro": numMes = 0; break;
            case "Fevereiro": numMes = 1; break;
            case "Março": numMes = 2; break;
            case "Abril": numMes = 3; break;
            case "Maio": numMes = 4; break;
            case "Junho": numMes = 5; break;
            case "Julho": numMes = 6; break;
            case "Agosto": numMes = 7; break;
            case "Setembro": numMes = 8; break;
            case "Outubro": numMes = 9; break;
            case "Novembro": numMes = 10; break;
            case "Dezembro": numMes = 11; break;
        }

        return numMes;
    }
}
