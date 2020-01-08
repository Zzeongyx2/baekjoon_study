import java.util.Scanner;

public class sum_11720 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int sum=0;

        String number = scan.next();

        for(int i=0;i<n;i++){
            sum = sum + number.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
