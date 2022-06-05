import java.util.Scanner;

public class Q19PerfectNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scn.nextInt();
        int sum = 1;
        for(int i=2; i<n; i++){
            if(n%i == 0){
                sum += i;
                System.out.println(sum);
            }
        }
        if(sum==n && n!=1){
            System.out.println(n+" is a perfect number.");
        }else{
            System.out.println(n+" is not a perfect number.");
        }
    }
}
