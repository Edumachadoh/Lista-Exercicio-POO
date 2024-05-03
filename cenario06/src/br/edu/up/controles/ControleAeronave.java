package br.edu.up.controles;

import br.edu.up.modelos.*;

public class ControleAeronave {
    private Passageiro[] passageiros;
    private Tripulacao[] tripulacoes;
    private Aeronave[] aeronaves;

    public ControleAeronave() {
        this.aeronaves = new Aeronave[10];
        this.tripulacoes = new Tripulacao[10];
        this.passageiros = new Passageiro[10];
    }



    public  void adicionarPassageiro(int idPassagem) {
        this.passageiros[0].setIdBagagem(10);
        this.passageiros[0].setNome("Edu");
        this.passageiros[0].setRg("ssd443");

        Passagem passagem = new Passagem();
        passagem.setIdPassagem(212);
        passagem.setNumAssento("53C");
        passagem.setClasseAssento("Executiva");

        Data data = new Data();
        data.setDia(1);
        data.setMes(5);
        data.setHora(12);
        data.setMinuto(56);

    }
    
    public  void adicionarTripulacao() {
        
        this.tripulacoes[0].setIdAeronautica(442);
        this.tripulacoes[0].setIdMatricula(1451);
        this.tripulacoes[0].setNome("Eloisa");
        this.tripulacoes[0].setRg("575457");
        
        this.tripulacoes[1].setIdAeronautica(524);
        this.tripulacoes[1].setIdMatricula(1321);
        this.tripulacoes[1].setNome("Eduardo");
        this.tripulacoes[1].setRg("232167");

        
       
        

    }
}
