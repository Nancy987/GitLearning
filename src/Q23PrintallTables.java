import java.util.Scanner;

public class Q23PrintallTables {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number upto which you want to print table: ");
        int num = scn.nextInt();
        for(int j=1;j<=num;j++) {
            System.out.println("Table of "+j);
            for (int i = 1; i <= 10; i++) {
                System.out.println(j + " * " + i + " = " + j * i);
            }
        }
    }
}
