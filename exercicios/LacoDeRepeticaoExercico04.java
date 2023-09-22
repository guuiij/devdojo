package academy.devdojo.exercicios;

public class LacoDeRepeticaoExercico04 {
    public static void main(String[] args) {
        int contagem = 0;
        System.out.println("Números pares 0 a 100 :");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                 contagem++;
                System.out.println(i);
            }
        }
        System.out.println("Quantidade de numeros pares : "+contagem);
    }
}
