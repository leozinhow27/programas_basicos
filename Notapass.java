import java.util.Scanner;
public class Notapass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        float nota1 = scanner.nextFloat();
        float nota2 = scanner.nextFloat();
        float media = (nota1 + nota2) / 2;
        if (media >= 7) {
            System.out.println("pass: True!");
        } else {
            System.out.println("pass: False!");
        }
    }
}
