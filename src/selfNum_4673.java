public class selfNum_4673 {
    public static void main(String[] args) {
        int [] arr = new int[10001];
        for(int i=1; i<=arr.length;i++){
            int result = d(i);
            if(result<=10000){
                arr[result]=1;
            }
        }

        for(int i=1;i<arr.length;i++){
            if(arr[i] != 1){
                System.out.println(i);
            }
        }
    }
    public static int d(int n){
        int sum = n;
        while(n!=0){
            sum = sum + n%10;
            n = n/10;
        }
        return sum;
    }

}
