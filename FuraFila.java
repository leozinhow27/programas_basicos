import java.util.Arrays;
import java.util.Scanner;

class FuraFila {


    public static void main(String[] args) {
        FuraFila f = new FuraFila();
        Scanner scanner = new Scanner(System.in);

        String[] fila = scanner.nextLine().split(" ");
        int indicie = scanner.nextInt();

        int[] x = new int[fila.length];
        for (int i = 0; i < fila.length; i++) {
            x[i] = Integer.parseInt(fila[i]);
        }

        f.ajustafila(x, indicie);
    }


    public void ajustafila(int[] fila, int indicie) {
        int troca = indicie;
        for (int i = indicie; i < fila.length; i++) {
            for (int j = i; j > i - troca; j--) {
                trocapessoa(fila, j, j - 1);
            }
            System.out.println(Arrays.toString(fila));
        }

    }
    private void trocapessoa(int[] x, int i, int p) {
        int troca = x[i];
        x[i] = x[p];
        x[p] = troca;
    }
}