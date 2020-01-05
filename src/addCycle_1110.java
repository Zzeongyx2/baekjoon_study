import java.util.Scanner;

public class addCycle_1110 {
    public static void main(String[] args) {
        int number;
        int[] cycle = new int[2];
        int sum;
        int cnt=0;
        int temp;

        Scanner scan = new Scanner(System.in);

        number = scan.nextInt();

        if(number<10){
            cycle[0] = 0;
            cycle[1] = number;
        }
        else{
            cycle[0] = number/10;
            cycle[0] = number%10;
        }

        while(true){
            sum = cycle[0]+cycle[1];
            temp = (cycle[1]*10)+(sum%10);
            cnt++;

            if(temp<10){
                cycle[0] = 0;
                cycle[1] = temp;
            }
            else{
                cycle[0] = temp/10;
                cycle[1] = temp%10;
            }

            if(temp==number){
                System.out.println(cnt);
                break;
            }
        }
    }
}
