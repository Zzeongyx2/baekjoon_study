import java.util.Scanner;

public class acmHotel_10250 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        for(int i=0;i<t;i++){
            int h = scan.nextInt();
            int w = scan.nextInt();
            int n = scan.nextInt();

            int floor= n%h;
            int num= (n/h)+1;
            if(n%h==0){
                num = n/h;
                floor = h;
            }

            System.out.println((floor*100)+num);

        }
    }
}
