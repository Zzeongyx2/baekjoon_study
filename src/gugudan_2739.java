import java.util.Scanner;

public class gugudan_2739 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int num;

        Scanner scan = new Scanner(System.in);

        num = scan.nextInt();

        scan.close();

        for(int i=1; i<=9; i++) {
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
}
