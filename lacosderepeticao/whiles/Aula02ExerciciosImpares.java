package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula02ExerciciosImpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe valor da contagem");
        int valorDigitado = input.nextInt();
        int i = 0;
        int conta = 0;
        // i = iteração, muito utilizado em todas as linguagens para ser contador -> 1++

        System.out.println("Numeros ímpares de 0 a " + valorDigitado);
        while (i <= valorDigitado) {
            if (i % 2 != 0) {
                System.out.println(i);
                conta++; // usei só pra contar quantos numeros impares tem.
            }
            i++;
        }
        System.out.println("conta total de numeros impares \n " + conta);
    }
}
