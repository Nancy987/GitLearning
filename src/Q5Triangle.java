import java.util.Scanner;

public class Q5Triangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a1 = scn.nextInt();
        int a2 = scn.nextInt();
        int a3 = scn.nextInt();

        int sum = a1 + a2 + a3;

        if(sum==180 && a1!=0 && a2!=0 && a3!=0){
            System.out.println("Valid Triangle");
        }else{
            System.out.println("Invalid Triangle");
        }
    }
}
