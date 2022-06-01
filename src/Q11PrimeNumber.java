import java.util.Scanner;

public class Q11PrimeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int cnt = 0;
        for(int i=2; i<num; i++){
            if(num%i == 0){
                cnt++;
                break;
            }
        }
        if(cnt>0){
            System.out.println(num + " is not a Prime Number");
        }else{
            System.out.println(num + " is a Prime Number");
        }
    }
}
