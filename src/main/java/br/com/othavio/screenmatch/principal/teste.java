package br.com.othavio.screenmatch.principal;

import java.util.function.IntPredicate;

interface Valores{
    int calcular(int a, int b);  
}

interface EhPrimo {
    boolean testar(int n);
}

interface ConvertendoString{
    String Manipular (String str);
}


public class teste {
    public static void main(String[] args) {
        Valores multiplicao = (a, b) -> a * b;

        System.out.println(multiplicao.calcular(2, 3));

        //Verificando se o numero é primo

        IntPredicate ehPrimo = n -> {
            if (n <= 1) return false;

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };

        int c = 7;
        System.out.println(ehPrimo.test(c));

        // Convertendo String

        ConvertendoString manipula = str -> str.toUpperCase();
        System.out.println("Manipulação de String: " + manipula.Manipular("Othavio"));        
    }
    }

