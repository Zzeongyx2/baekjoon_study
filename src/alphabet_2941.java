import java.util.Scanner;

public class alphabet_2941 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] croatia = {"c=","c-", "dz=", "d-","lj","nj","s=","z="};
        String word = scan.nextLine();

        for(int i=0;i<croatia.length;i++){
            word = word.replaceAll(croatia[i],"A");
        }
        System.out.println(word.length());
    }
}
