import java.util.Scanner;

public class sugar_2839 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int weight = scan.nextInt();
        int cnt = 0;

        while(weight%5!=0 && weight>=0){
            weight = weight -3;
            cnt++;
        }
        if(weight<0){
            System.out.println("-1");
        }
        else{
            cnt = cnt + weight/5;
            System.out.println(cnt);
        }
    }
}
