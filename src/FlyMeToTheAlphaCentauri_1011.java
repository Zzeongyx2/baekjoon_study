import java.util.Scanner;

public class FlyMeToTheAlphaCentauri_1011 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=0;i<t;i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int dis = b - a;
            int cnt = 1;
            int move = 0;

            while (move < dis) {
                cnt++;
                move = move + cnt / 2;
            }
            System.out.println(cnt - 1);
        }
    }
}
