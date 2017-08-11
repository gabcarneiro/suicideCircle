package br.edu.fameg.ads.poo;

import java.util.regex.Pattern;

public class FormatadoraDeString {


    public static int toInteger(String valorString){

        String[] t = valorString.split(Pattern.quote("e"));

        int quantidadeDeZeros = Integer.parseInt(t[1]);
        int i = quantidadeDeZeros;

        while (i > 0){
            t[1] += "0";
            i --;
        }

        String substituir = (Integer.toString(quantidadeDeZeros));

        t[1] = t[1].replaceAll(substituir,"");

        String numFinal = (t[0]+t[1]);

        return Integer.parseInt(numFinal);

    }


}
