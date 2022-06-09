import java.util.Scanner;

public class Q36NthPrimeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter nth number");
        int n = scn.nextInt();      // eg print 4th prime number = 7
        int count = 0;
        int i=2;
        int result = 0;
        while(count<n){
            int cnt = 0;
            for(int j=2; j<i; j++){
                if(i%j == 0){
                    cnt++;
                    break;
                }
            }
            if(cnt==0){
                count++;
                result = i;
            }
            i++;
        }
        System.out.println(n+"th Prime Number = "+result);
    }
}
