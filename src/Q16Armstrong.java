import java.util.Scanner;

public class Q16Armstrong {
    public static void main(String[] args) {
        int originalNum, rem, result = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scn.nextInt();
        originalNum = num;

        while(originalNum!=0){
            rem = originalNum%10;
            result += Math.pow(rem,3);
            originalNum = originalNum/10;
        }
        if(result==num){
            System.out.println(num + " is an Armstrong number.");
        }else{
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
