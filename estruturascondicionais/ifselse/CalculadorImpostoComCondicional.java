package academy.devdojo.estruturascondicionais.ifselse;//Dado  um determinado salario
//se o salário for maior que 4500 imprima 30% do valor
//Se não imprioma 15% do valorz
//--------------------------------------
//Desafio: Utilize apenas uma variável para
//guardar o resultado e imprimir no final
//--------------------------------------
//Desafio: Diga na impressão se é 1%% ou 30%

public class CalculadorImpostoComCondicional {
    public static void main(String[] args) {

        double wage = 4500.00;
        double discountAmount = 0;

        if (wage > 4500.00) {
            discountAmount = wage * 0.3;
            System.out.println("Salário maior que 30% ");
        } else {
            discountAmount = wage * 0.15;
            System.out.println("Salário menor que 15%");
        }
        System.out.println("Valor do desconto é : R$ " + discountAmount);


    }
}
