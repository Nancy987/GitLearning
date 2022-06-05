import java.util.Scanner;

public class Q21ArmstrongRange {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a Range: ");
        int from = scn.nextInt();
        int to = scn.nextInt();

        for(int i=from;i<=to;i++) {
            int originalNum, rem, result = 0;
            originalNum = i;
            while (originalNum != 0) {
                rem = originalNum % 10;
                result += Math.pow(rem, 3);
                originalNum = originalNum / 10;
            }
            if (result == i) {
                System.out.println(i + " is an Armstrong number.");
            } else {
                System.out.println(i + " is not an Armstrong number.");
            }
        }
    }
}
