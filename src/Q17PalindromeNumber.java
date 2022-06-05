import java.util.Scanner;

public class Q17PalindromeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scn.nextInt();
        int originalNo = n;
        int revNo = 0;
        int length = 0;
        int temp = n;
        while(temp!=0){
            length++;
            temp = temp/10;
        }
        // Reverse Number
        while(n!=0){
            int digit = n%10;
            revNo += digit * Math.pow(10,length-1);
            length--;
            n = n/10;
        }
        if(originalNo==revNo){
            System.out.println("Number is Palindrome");
        }else{
            System.out.println("Number is not Palindrome");
        }
    }
}
