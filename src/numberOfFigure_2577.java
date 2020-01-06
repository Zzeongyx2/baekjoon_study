import java.util.Scanner;


public class numberOfFigure_2577 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int cnt=0;
        int result = a*b*c;
        String value = String.valueOf(result);

        for(int i=0;i<10;i++){
            for(int j=0;j<value.length();j++){
                if(i == Integer.parseInt(value.substring(j, j+1))){
                    cnt++;
                }
            }
            System.out.println(cnt);
            cnt=0;
        }
    }
}
