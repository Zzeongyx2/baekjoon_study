import java.util.Scanner;

public class president_2775 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[15][15];
        for(int i = 0 ; i < 15 ; i++) {
            arr[i][0] = 1;
            arr[0][i] = i + 1;
        }

        for(int i = 1 ; i < 15 ; i++) {
            for(int j = 1 ; j < 15 ; j++) {
                arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
        }

        int t = in.nextInt();
        for(int i = 0 ; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt() - 1;
            System.out.println(arr[a][b]);
        }
    }
}
