import java.util.Scanner;

public class Q20LeapYear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scn.nextInt();
        boolean is_leap_year = false;

        if (year % 4 == 0) {
            is_leap_year = true;
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    is_leap_year = true;
                else
                    is_leap_year = false;
            }
        }
        else
            is_leap_year = false;

        if (!is_leap_year)
            System.out.println(year + " is Non Leap-year");
        else
            System.out.println(year + " is Leap-year");
    }
}
