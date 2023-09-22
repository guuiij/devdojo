package academy.devdojo.estruturascondicionais.switchcase;
/* Como gerente eu gostaria que meus usuários puidessem
Digitar o tipo da conta e o sistema imprima qual a porcentagem de juros que
aquela conta irá oferecer. Com o intuito de agilizar  o aceso as informações
Os tipos das contas são
CONTA_POUPANCA 0.05%
CONTA_CORRENTE 0.02%
CONTA_INVESTIMENTO 0.1% */

import java.util.Scanner;

public class Aula02TipoDeConta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tipo de conta");
        System.out.println("(1) - Conta Poupança");
        System.out.println("(2) - Conta Corrente");
        System.out.println("(3) - Conta Investimento");
        int conta = input.nextInt();

        switch (conta) {
            case 1:
                System.out.println("CONTA_POUPANCA 0.05%");
                break;
            case 2:
                System.out.println("CONTA_CORRENTE 0.02%");
                break;
            case 3:
                System.out.println("CONTA_INVESTIMENTO 0.1%");
                break;
            default:
                System.out.println("Conta inválida.");
                break;
        }
    }
}