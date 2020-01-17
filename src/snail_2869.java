import java.util.Scanner;

public class snail_2869 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int v = scan.nextInt();

        int cnt = (v-b)/(a-b);
        if((v-b) % (a-b) != 0){
            cnt++;
        }
        System.out.println(cnt);
    }
}
