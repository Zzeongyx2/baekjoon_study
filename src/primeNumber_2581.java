import java.util.Scanner;

public class primeNumber_2581 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int m = scan.nextInt();
        int n = scan.nextInt();
        int sum = 0;
        int min = 10001;
        int cnt = 0;

        for (int i = m; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }

            if (cnt == 0 && i != 1) {
                sum = sum + i;
                if (min > i) {
                    min = i;
                }
            }
            cnt = 0;
        }
        if(min == 10001){
            System.out.println("-1");
        }else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}