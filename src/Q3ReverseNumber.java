import java.util.Scanner;

public class Q3ReverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();          // take 3 digit number
        int d1 = n/100;
        n = n%100;
        int d2 = n/10;
        n = n%10;
        int d3 = n;
        System.out.print(d3 + "" + d2 + "" + d1);
    }
}
