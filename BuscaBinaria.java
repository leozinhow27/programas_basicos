import java.util.Scanner;


class BuscaBinaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] seqnum = scanner.nextLine().split(" ");

        int n = scanner.nextInt();
        scanner.nextLine();

        int[] numseq = verificanum(seqnum);
        System.out.println(buscanum(numseq, n, 0, numseq.length - 1));

    }

    private static int[] verificanum(String[] seq) {
        int[] numseq = new int[seq.length];
        for(int i = 0; i < seq.length; i++) {
            numseq[i] = Integer.parseInt(seq[i]);
        }
        return numseq;
    }

    public static int buscanum(int[] seq, int n, int p, int q) {
        int r = (p + q) / 2;

        if(seq[r] == n) return r;
        System.out.println(r);

        if(n > seq[r] && r < q) {
            return buscanum(seq, n, r + 1, q);
        }
        if(n < seq[r] && r > p) {
            return buscanum(seq, n, p, r - 1);
        }
        return -1;
    }
}