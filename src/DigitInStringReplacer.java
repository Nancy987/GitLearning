import java.util.Scanner;

public class DigitInStringReplacer {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a string of digits:");
        String str = scn.next();
        StringBuilder string = new StringBuilder(str);
        if(str.length()==0){
            System.out.println("String can't be empty.");
        }else {
            for (int i = 0; i < str.length(); i++) {
                char c = string.charAt(i);
                int digit = c - '0';
                System.out.println(digit);
                if (digit < 5) {
                    string.setCharAt(i, '0');
                } else {
                    string.setCharAt(i, '1');
                }
            }
            System.out.println("Modified String = " + string);
        }
    }
}
