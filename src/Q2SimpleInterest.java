import java.util.Scanner;

public class Q2SimpleInterest {
    public static void main(String[] args) {
        int principal,time;
        float rate=7.5f;
        Scanner scn = new Scanner(System.in);
        principal = scn.nextInt();
        time = scn.nextInt();
        float SI = principal*rate*time*0.01f;
        float amount = principal + SI;
        System.out.println("Simple Interest is "+SI);
        System.out.println("Final amount paid to the bank is "+amount);
    }
}
