import java.util.Scanner;

public class Q8GreatestTernary {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();

        int max = (n1>n2 && n1>n3) ? n1 : (n2>n1 && n2>n3) ? n2 : n3;
        System.out.println("Greatest Number is "+max);
    }
}
