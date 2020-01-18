import java.util.Scanner;

public class FlyMeToTheAlphaCentauri_1011 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=0;i<t;i++) {
            long a = scan.nextInt();
            long b = scan.nextInt();
            long dis = b - a;
            long cnt = 1;
            long move = 0;

            while (move < dis) {
                cnt++;
                move = move + cnt / 2;
            }
            System.out.println(cnt - 1);
        }
    }
}
