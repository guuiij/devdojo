package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula03Menu {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);

        while (true) {
            System.out.println("*******************");
            System.out.println("1. Calcular imposto");
            System.out.println("2. Depositar salário");
            System.out.println("3. Sair");
            int teclado = menu.nextInt();

            if (teclado == 3) {
                System.out.println("Sistema finalizado");
                break;
            } else if (teclado == 1) {
                System.out.println("Calcular imposto");
            } else if (teclado == 2) {
                System.out.println("Depositar salário");
            } else {
                System.out.println("OPÇÃO INVÁLIDA");
            }
        }
    }
}
