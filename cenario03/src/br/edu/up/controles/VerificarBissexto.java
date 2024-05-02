package br.edu.up.controles;

public class VerificarBissexto {
    public static boolean executar(int ano){
        boolean bissexto = false;
        
        if(ano % 4 == 0 || ano % 400 == 0){
            bissexto = true;
        }else{
            bissexto = false;
        }
        return bissexto;
    }
}
