import java.util.Scanner;

public class Q13SumOfDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scn.nextInt();
        int sum = 0;
        while(n!=0){
            sum += n%10;
            n = n/10;
        }
        System.out.println("Sum of digits is "+sum);
    }
}
