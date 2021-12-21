import java.util.Scanner;
import java.util.Arrays;

class MoveTres {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n = sc.nextLine().split(" ");
        insertionSort(n);
    }

    public static void insertionSort(String[] n) {
        for (int i = 1; i < n.length; i++) {
            int j = i;
            int maior = Integer.parseInt(n[j]);
            int menor = Integer.parseInt(n[j - 1]);
            while (j > 0 && maior < menor) {
                String aux = n[j];
                n[j] = n[j - 1];
                n[j - 1] = aux;
                j -= 1;
                System.out.println(Arrays.toString(n));
            }
        }
    }

}