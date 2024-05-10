package br.edu.up.controles;

import br.edu.up.modelos.*;

public class ControleAeronave {
    private Passageiro[] passageiros;
    private Tripulante[] tripulantes;
    // private Aeronave[] aeronaves;
    private Aeronave aeronave;
    // private Comissario[] comissarios;
    private int contPassageiro;
    private int contComissario;
    private int contComandante;

    public ControleAeronave() {
        // this.aeronaves = new Aeronave[10];
        // for (int i = 0; i < aeronaves.length; i++) {
        //     aeronaves[i] = new Aeronave();
        // }

        aeronave = new Aeronave();

        this.passageiros = new Passageiro[10];
        for (int i = 0; i < passageiros.length; i++) {
            passageiros[i] = new Passageiro();
        }
        
        this.tripulantes = new Tripulante[3];
        this.tripulantes[0] = new Comandante();
        this.tripulantes[1] = new Comissario();
        this.tripulantes[2] = new Comissario();
       
    }

    public void adicionarAeronave(int contAeronave, int idCodigo, String tipo, int qtdAssentos) {
       
        this.aeronave.setIdCodigo(idCodigo);
        this.aeronave.setQtdAssentos(qtdAssentos);
        this.aeronave.setTipo(tipo);


    }


    public void adicionarPassageiro(int numPassageiro, int numAeronave, String nome, String rg, int idPassagem, String numAssento, String classeAssento, int dia, int mes, int hora, int minuto, int idBagagem) {
       
        Data data = new Data();
        data.setDia(dia);
        data.setMes(mes);
        data.setHora(hora);
        data.setMinuto(minuto);

        Passagem passagem = new Passagem();
        passagem.setIdPassagem(idPassagem);
        passagem.setNumAssento(numAssento);
        passagem.setClasseAssento(classeAssento);
        passagem.setData(data);

        Passageiro passageiro = new Passageiro();
        passageiro.setPassagem(passagem);
        passageiro.setIdBagagem(idBagagem);
        passageiro.setNome(nome);
        passageiro.setRg(rg);

        this.passageiros[numPassageiro] = passageiro;

        // this.aeronaves[numAeronave].setPessoa(pessoa);
        

    }
    
    public void adicionarComandante(String nome, String rg ,int tripulacao, int idAeronautica, int idMatricula, int totalHorasVoo ) {
        Comandante comandante = new Comandante();
        comandante.setIdAeronautica(idAeronautica);
        comandante.setIdMatricula(idMatricula);
        comandante.setNome(nome);
        comandante.setRg(rg);
        comandante.setTotalHorasVoo(totalHorasVoo);

        this.tripulantes[0] = comandante;
               
    }
    public void adicionarComissario(String nome, String rg ,int tripulacao, int idAeronautica, int idMatricula, String idiomas) {
        Comissario comissario = new Comissario();
        comissario.setIdAeronautica(idAeronautica);
        comissario.setIdMatricula(idMatricula);
        comissario.setNome(nome);
        comissario.setRg(rg);
        comissario.setIdioma(idiomas);
        
        this.tripulantes[1] = comissario;
    }


    @Override
    public String toString() {
        return "Nome: " + passageiros[0].getNome() + 
        "\nRg: " + passageiros[0].getRg()+ 
        "\nIdentificacao bagagem: " + passageiros[0].getIdBagagem() + 
         "\nIdentificacao passagem: " + passageiros[0].getPassagem().getIdPassagem() + 
        "\nNumero de assento: " +passageiros[0].getPassagem().getNumAssento() +
        "\nClasse assento: " + passageiros[0].getPassagem().getClasseAssento()+ 
        "\nDia: " + passageiros[0].getPassagem().getData().getDia()+ 
        "\nMes: " + passageiros[0].getPassagem().getData().getMes() +
         "\nHora: " + passageiros[0].getPassagem().getData().getHora()+ 
         "\nMinuto: " + passageiros[0].getPassagem().getData().getMinuto();
    }

    

}
