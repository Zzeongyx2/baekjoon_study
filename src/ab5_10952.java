import java.util.Scanner;

public class ab5_10952 {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int a;
            int b;

            while(true){
                a =scan.nextInt();
                b= scan.nextInt();
                if(a==0 && b==0){
                    break;
                }
                System.out.println(a+b);
            }
            scan.close();
        }
    }
