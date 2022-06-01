import java.util.Scanner;

public class Q7Insurance {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Marital Status (M/N)");
        char marital_status = scn.next().charAt(0);
        System.out.println("Enter Gender (M/F)");
        char gender = scn.next().charAt(0);
        System.out.println("Enter age");
        int age = scn.nextInt();

        if((marital_status=='M') || (marital_status=='N' && gender=='M' && age>30) || (marital_status=='N' && gender=='F' && age>25)){
            System.out.println("Driver is insured");
        }else{
            System.out.println("Driver is not insured");
        }
    }
}
