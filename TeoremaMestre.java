import java.util.Scanner;

class TeoremaMestre {

    public static void main(String[ ] args) {
        Scanner scanner =  new Scanner(System.in);
        String[] seq = scanner.nextLine().split(" ");

        int a = Integer.parseInt(seq[0]);
        int b = Integer.parseInt(seq[1]);
        int ord = Integer.parseInt(seq[2]);


        double log = (Math.log(a)/ Math.log(b));

        if (ord == log) {
            System.out.println("T(n) = theta(n**" + ord + " * log n)");

        }
        else if(ord > log) {
            System.out.println("T(n) = theta(n**" + ord + ")");

        }
        else if (ord < log) {
            System.out.println("T(n) = theta(n**" + ord + " * log n)");

        }
    }
}