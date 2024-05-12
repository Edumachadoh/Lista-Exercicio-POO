package br.edu.up.modelos;

public class Evento {
    private String nome;
    private String data;
    private String local;
    private int qtdIngressosVendidos;
    private double precoIngresso;
    private int lotacaoMax;
    private Reserva[] reservas;
    private int numReservasFeitas = 0;
    
    public Evento(String nome, String data, String local, double precoIngresso, int lotacaoMax) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.precoIngresso = precoIngresso;
        this.lotacaoMax = lotacaoMax;
        this.reservas = new Reserva[lotacaoMax];

        for (Reserva reserva : reservas) {
            if(reserva != null){
                reserva.setData(data);
            }
        }
    }
    public void adicionarReserva(Reserva reserva, int numReserva){
        this.reservas[numReserva - 1] = reserva; 
        setQtdIngressos();
        calcularValorTotalVendas();
        this.numReservasFeitas++;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public int getLotacaoMax() {
        return lotacaoMax;
    }
    public void setLotacaoMax(int lotacaoMax) {
        this.lotacaoMax = lotacaoMax;
    }
    public int getQtdIngressos() {
        return qtdIngressosVendidos;
    }
    public void setQtdIngressos() {
        int valorTotal = 0;

        for (Reserva reserva : reservas) {
            if(reserva != null){
                valorTotal += reserva.getQtdPessoas();
            }
        }
        this.qtdIngressosVendidos = valorTotal;
    }
    public double getPrecoIngresso() {
        return precoIngresso;
    }
    public void setPrecoIngresso(double precoIngresso) {
        this.precoIngresso = precoIngresso;
    }
    public int getNumReservasFeitas(){
        return numReservasFeitas;
    }
    public double calcularValorTotalVendas(){
        return precoIngresso * qtdIngressosVendidos;
    }
    public String listarReservas(){
        String listaReserva = new String();
        int i = 1;

        for (Reserva reserva : reservas) {

            listaReserva += "Reserva " + i + reserva.toString() + "\n";
            i++;

        }
        return listaReserva;
    }

    public boolean excluirReserva(String nomeResponsavel, int qtdPessoas){
        boolean deuCerto = false;
        
        for (int i = 0; i < this.reservas.length; i++) {

            if(this.reservas[i].getNomeResponsavel() == nomeResponsavel && this.reservas[i].getQtdPessoas() == qtdPessoas){
                this.reservas[i] = null;
                return deuCerto = true;
            }
        }

        return deuCerto;
    }

    public Reserva[] getReservas(){
        return reservas;
    }
    
    @Override
    public String toString() {
        return "[Nome= " + nome + ", Data= " + data + ", Local= " + local + ", Quantidade de Ingressos Vendidos= "
                + qtdIngressosVendidos + ", Preço do Ingresso= " + precoIngresso + ", Lotação Máxima= " + lotacaoMax + "]";
    }
    
}
