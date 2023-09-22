package academy.devdojo.lacosderepeticao.fors;

import java.util.Scanner;

public class Aula02Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual tabuada deseja saber ?");
        int tabuada = entrada.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println("Tabuada de " + tabuada + " = " + (tabuada * i));
        }
        System.out.println(" OLA _ TO FORA DO ESCOPO DO FOR"); // só pra ver mesmmo

    }

}
