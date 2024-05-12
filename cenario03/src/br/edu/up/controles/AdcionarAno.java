package br.edu.up.controles;

import br.edu.up.metodos.Ano;

public class AdcionarAno {
    public static Ano[] executar(Ano[] ano) {
        
        Ano[] vet1 = new Ano[ano.length];

        for (int i = 0; i < vet1.length; i++){
            vet1[i] = ano[i];
        }

        Ano[] vet2 = new Ano[ano.length + 1];

        for (int i = 0; i < vet1.length; i++) {
            vet2[i] = vet1[i];
        }

    return vet2;
    }
}
