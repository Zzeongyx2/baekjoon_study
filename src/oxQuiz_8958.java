import java.util.Scanner;

public class oxQuiz_8958 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum;
        int cnt;
        String[] arr = new String[n];

        for(int i=0;i<n; i++){
            arr[i] = scan.next();
        }
        for(String OX : arr){
            cnt=0;
            sum=0;
            for(int i=0;i<OX.length();i++){
                if(OX.charAt(i) =='O'){
                    cnt++;
                    sum = sum + cnt;
                }
                else{
                    cnt=0;
                }
            }
            System.out.println(sum);
        }
    }
}
