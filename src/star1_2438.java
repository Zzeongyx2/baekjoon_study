import java.util.Scanner;

public class star1_2438 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
