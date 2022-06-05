import java.util.Scanner;

class demo{
    demo(int num){
        for(int i=1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

public class Q27FactorsCostructor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        demo obj = new demo(num);
    }
}
