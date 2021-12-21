
import java.util.Scanner;

class DoisSomam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] sequencia = scanner.nextLine().split(" ");
        int somar = scanner.nextInt();
        scanner.hasNextLine();

        int[] seqnum = transformaint(sequencia);
        int[] resultado = somadois(seqnum, somar);

        if(resultado[0] == 0 && resultado[1] == 0) {
            System.out.println(-1);

        }else {
            System.out.printf("%d %d%s", resultado[0], resultado[1], System.lineSeparator());
        }
        scanner.close();
    }

    public static int[] somadois(int[] numsoma, int somar) {
        int[] indicie = new int[2];
        boolean tem = false;
        int i = 0;

        while(i < numsoma.length - 1 && !tem) {
            int j = i + 1;

            while(j < numsoma.length && !tem) {
                if(numsoma[i] + numsoma[j] == somar) {
                    indicie[0] = numsoma[i];
                    indicie[1] = numsoma[j];
                    tem = true;

                }else {
                    j++;
                }
            }
            i++;

        }
        return indicie;
    }

    private static int[] transformaint(String[] nums) {

        int[] seqnum = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            seqnum[i] = Integer.parseInt(nums[i]);
        }
        return seqnum;
    }
}