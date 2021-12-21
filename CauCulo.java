

import java.util.Scanner;
public class CauCulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sinal = scanner.nextLine();

        if (sinal.equals("-")) {
            double num1 = scanner.nextFloat();
            double num2 = scanner.nextFloat();
            double subitrair = (num1 - num2);

            System.out.println("RESULTADO:" + subitrair);


        } else if (sinal.equals("+")) {
            double num1 = scanner.nextFloat();
            double num2 = scanner.nextFloat();

            double somar = (num1 + num2);

            System.out.println("RESULTADO:" + somar);


        } else if (sinal.equals("*")) {
            double num1 = scanner.nextFloat();
            double num2 = scanner.nextFloat();

            double produto = (num1 * num2);

            System.out.println( "RESULTADO:" + produto);


        } else if (sinal.equals("/")) {
            double num1 = scanner.nextFloat();
            double num2 = scanner.nextFloat();


            if (num2 == 0) {
                System.out.println("ERRO");

            } else {
                double divisao = (num1 / num2);
                System.out.println("RESULTADO:" + divisao);
            }
        }else{
            System.out.println("ENTRADA INVALIDA");
        }
    }
}