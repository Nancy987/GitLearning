import java.util.Scanner;

public class Q14ReverseGivenNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scn.nextInt();
        int newNo = 0;
        int length = 0;
        int temp = n;
        while(temp!=0){
            length++;
            temp = temp/10;
        }
        while(n!=0){
            int digit = n%10;
            newNo += digit * Math.pow(10,length-1);
            length--;
            n = n/10;
        }
        System.out.println("Reverse Number is "+newNo);
    }
}
