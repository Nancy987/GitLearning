import java.util.Scanner;

public class Q37ProbableTopperNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a registration number");
        int registration_num = scn.nextInt();
        int even_sum = 0, odd_sum = 0;
        while(registration_num!=0){
            int digit = registration_num%10;
            if(digit%2==0){
                even_sum += digit;
            }else{
                odd_sum += digit;
            }
            registration_num = registration_num/10;
        }
        if(even_sum == odd_sum){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
