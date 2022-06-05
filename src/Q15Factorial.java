import java.util.Scanner;

public class Q15Factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scn.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        System.out.println("Factorial of a given number is "+fact);
    }
}
