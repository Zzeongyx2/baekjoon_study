import java.util.Scanner;

public class num_1065 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int cnt=0;

        if(N<100){
            System.out.println(N);
        }
        else{
            int x,y,z;
            while(N>99){
                x = N/100;
                y = (N%100)/10;
                z = N%10;
                if(x-y == y-z){
                    cnt++;
                }
                N = N-1;
            }
            System.out.println(cnt+99);
        }
    }
}
