import java.util.Scanner;


public class scale_2920 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] input = new int[8];
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        int as = 0;
        int ds = 0;

        for (int i = 0; i < 8; i++) {
            input[i] = scan.nextInt();
        }
        for (int i = 0; i < 8; i++) {
            if (input[i] == a[i]) {
                as++;
            } else if (input[i] == a[7 - i]) {
                ds++;
            }
        }
        if (as == 8) {
            System.out.println("ascending");
        } else if (ds == 8) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}

