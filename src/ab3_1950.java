import java.util.Scanner;

public class ab3_1950 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();

        for(int i=0; i<n; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(a+b);
        }
        scan.close();
    }

}
