import java.util.Scanner;

public class ab8_11022 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();

        for(int i=1; i<=n; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int sum=a+b;
            System.out.println("Case #" + i + ": "+ a + " + " + b + " = " + sum);
        }
        scan.close();
    }
}
