import java.util.Scanner;

public class num_2908 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();

        int rvs_x = ((x%10)*100)+(((x%100)/10)*10)+(x/100);
        int rvs_y = ((y%10)*100)+(((y%100)/10)*10)+(y/100);

        if(rvs_x > rvs_y){
            System.out.println(rvs_x);
        }else{
            System.out.println(rvs_y);
        }
    }
}
