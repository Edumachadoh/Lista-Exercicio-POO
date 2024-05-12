package br.edu.up.controles;

public class DefinirMes {
    public static String executar(String mes){
        mes.toLowerCase();
        String nomeMes;
        
        if(mes.contains("jan") == true){
            nomeMes = "Janeiro";
        }else if(mes.contains("fev") == true){
            nomeMes = "Fevereiro";
        }else if(mes.contains("mar") == true){
            nomeMes = "Março";
        }else if(mes.contains("abr") == true){
            nomeMes = "Abril";
        }else if(mes.contains("mai") == true){
            nomeMes = "Maio";
        }else if(mes.contains("jun") == true){
            nomeMes = "Junho";
        }else if(mes.contains("jul") == true){
            nomeMes = "Julho";
        }else if(mes.contains("ag") == true){
            nomeMes = "Agosto";
        }else if(mes.contains("se") == true){
            nomeMes = "Setembro";
        }else if(mes.contains("ou") == true){
            nomeMes = "Outubro";
        }else if(mes.contains("no") == true){
            nomeMes = "Novembro";
        }else if(mes.contains("de") == true){
            nomeMes = "Dezembro";
        }else{
            nomeMes = "Null";
        };
        return nomeMes;
    }
}
