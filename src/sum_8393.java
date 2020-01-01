import java.util.Scanner;

public class sum_8393 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n;
        int sum=0;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        scan.close();

        for(int i=1;i<=n;i++) {
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
