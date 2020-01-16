import java.util.Scanner;

public class bee_2292 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int cnt = 1;
        int range = 1;

        while(true){
            if(range >= num){
                break;
            }
            range = range + 6*(cnt++);
        }
        System.out.println(cnt);
    }
}
