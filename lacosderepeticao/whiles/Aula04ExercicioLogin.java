package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula04ExercicioLogin {
    public static void main(String[] args) {
        final String name = "Luffy";           // final é usado para que nenhuma variavel com o mesmo nome
        final String password = "P@RRaLOucA";  // sobreponha essa
        boolean exibirTelaLogin = true;

        Scanner input = new Scanner(System.in);

        while (exibirTelaLogin) {
            System.out.println("*******************");
            System.out.println("ONE PIECE");
            System.out.println("Favor inserir login:");
            String login = input.next();
            System.out.println("Favor inserir Senha:");
            String senha = input.next();

            if (login.equalsIgnoreCase(name) && senha.equalsIgnoreCase(password)) {
                System.out.println("Bem Vindo Rei dos Mares " + name);
                System.out.println("\n ⎛⎝( ` ᢍ ´ )⎠⎞\n");
                break;
            }
                System.out.println("ACESSO NEGADO.");
        }
        System.out.println("Sistema finalizado.");
    }
}
