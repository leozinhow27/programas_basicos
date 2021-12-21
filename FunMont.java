import java.util.Scanner;
public class FunMont {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        if (num1 < num2 && num2 < num3 && num3 < num4) {
            System.out.println("POSSIVELMENTE ESTRITAMENTE CRESCENTE");
        }
            else if (num1 > num2 && num2 > num3 && num3 > num4) {
                System.out.println("POSSIVELMENTE ESTRITAMENTE DECRESCENTE");
        } else {
            System.out.println("FUNCAO NAO ESTRITAMENTE CRES/DECR");
        }
    }
}