package br.edu.fameg.ads.poo;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraDePosicaoSegura {

    public static String getPosicaoMaisSegura(String quantidadeDeParticipantes) {

        List<String> elementosDoCirculo = new ArrayList<>();

        for (int i = 1; i <= FormatadoraDeString.toInteger(quantidadeDeParticipantes); i++) {
            elementosDoCirculo.add(quantidadeDeParticipantes + " - " + Integer.toString(i));
        }

        boolean eliminaElemento = false;

        List<String> remover = new ArrayList<>();

        while (elementosDoCirculo.size()>1){

            for (String e : elementosDoCirculo) {
                if (eliminaElemento) {
                    remover.add(e);
                }
                eliminaElemento = !eliminaElemento;
            }
            elementosDoCirculo.removeAll(remover);
        }
        return elementosDoCirculo.get(0);
    }

}


