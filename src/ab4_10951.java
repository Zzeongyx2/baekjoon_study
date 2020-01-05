import java.util.Scanner;

public class ab4_10951 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;

        while(scan.hasNextInt()){
            a =scan.nextInt();
            b= scan.nextInt();
            System.out.println(a+b);
        }
    }
}
