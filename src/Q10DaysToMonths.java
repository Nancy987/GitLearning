import java.util.Scanner;

public class Q10DaysToMonths {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Total Days: ");
        int days = scn.nextInt();
        int months = days/30;
        int remaining = days%30;
        System.out.println("Months = "+months);
        System.out.println("Remaining Days = " + remaining);
    }
}
