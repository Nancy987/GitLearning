import java.util.Scanner;

public class Q4DigitSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();          // take 4 digit number
        int df = n/1000;
        n = n%1000;
        n = n%100;
        n = n%10;
        int dl = n;
        int sum = df + dl;
        System.out.print("Sum of first and last digit is " + sum);
    }
}
