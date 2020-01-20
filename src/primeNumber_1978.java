import java.util.Scanner;

public class primeNumber_1978 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int prime=0;

        for(int i=0;i<n;i++){
            int a = scan.nextInt();
            int cnt=0;
            for(int j=1;j<=a;j++){
                if(a%j == 0){
                    cnt++;
                }
            }
            if(cnt==2){
                prime++;
            }
        }
        System.out.println(prime);
    }
}
