import java.util.Scanner;

public class Q26FibonaciiSeries {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter total number for fibonacii series");
        int count = scn.nextInt();
        int a = 1;
        int b = 1;
        System.out.print(a+" "+b);
        for(int i=2;i<count;i++){
            int c = a+b;
            System.out.print(" "+c);
            a = b;
            b = c;
        }
    }
}
