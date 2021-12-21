
import java.util.Scanner;
public class DoubleTriple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int dobro = (num * 2);
        int triplo = (num * 3);

        System.out.println("dobro: " + dobro + ", " + "triplo: " + triplo);
    }
}