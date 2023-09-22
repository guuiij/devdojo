package academy.devdojo.lacosderepeticao.fors;

public class Aula01IntroducaoFor {
    public static void main(String[] args) {
        int conta = 0;
        for (int contador = 0; contador <= 10; contador++){
            if (contador % 2 != 0){
                conta++;
                System.out.println("Contador " + contador);
            }

        }
        System.out.println(conta);
    }
}
