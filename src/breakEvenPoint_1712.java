import java.util.Scanner;

public class breakEvenPoint_1712 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fixed = scan.nextInt();
        int variable = scan.nextInt();
        int price = scan.nextInt();
        int result;

        if(price<=variable){
            result = -1;
        }else {
            result = fixed / (price - variable) + 1;
        }
        System.out.println(result);
    }
}
