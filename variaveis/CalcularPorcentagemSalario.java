package academy.devdojo.variaveis;

public class CalcularPorcentagemSalario {
    public static void main(String[] args) {
        double wage = 2500.00;
        double discountAmount = 20;
        double discountCalculation = (wage * discountAmount)/100;

        System.out.println("A porcentagem de " + discountAmount +"% do salário R$"+wage );
        System.out.println("Valor calculado " + discountCalculation);
        System.out.println("Valor com desconto " + (wage - discountCalculation));
    }

}
