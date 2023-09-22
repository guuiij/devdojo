package academy.devdojo.arrays.unidimensional;

import java.util.Scanner;

public class Aula02ArraysComFor {
    public static void main(String[] args) {

        double[] notas = new double[4];
        Scanner scanner = new Scanner(System.in);
        double media = 0;
        int contador = 0;

        for (int i = 0; i < notas.length; i++) {
            //System.out.println(notas[i]);

            System.out.println("Digite a " + (i + 1) + " nota:");
            notas[i] = scanner.nextDouble();
            media = media + notas[i];
        }

        for (int i = 0; i < notas.length; i++) {

            System.out.println("Nota "+i+": " + notas[i]);
        }
        media = media / 4;
        System.out.println("media : " + media);

    }
}

