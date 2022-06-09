import java.util.Scanner;

public class Q24XPowerY {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter X: ");
        int x = scn.nextInt();
        System.out.println("Enter Y: ");
        int y = scn.nextInt();
        int res = 1;
        for(int i=1;i<=y;i++){
            res *= x;
        }
        System.out.println("X Power Y = "+res);
    }
}
