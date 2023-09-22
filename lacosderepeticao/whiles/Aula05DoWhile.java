package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula05DoWhile {
    public static void main(String[] args) {
        int desejaContinuar = 1;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("PLAYER 1 - Digite um número de 1 a 10: ");
            int primeiroNumero = teclado.nextInt();
            System.out.println("PLAYER 2 - Digite um número de 1 a 10: ");
            int segundoNumero = teclado.nextInt();

            System.out.println(" Numero igual ? " + (primeiroNumero == segundoNumero));
            System.out.println("-------------------------------------");
            System.out.println("Deseja continuar jogando ?");
            desejaContinuar = teclado.nextInt();

        } while (desejaContinuar == 1);
        {
            System.out.println(" Jogo finalizado");
        }

    }
}
