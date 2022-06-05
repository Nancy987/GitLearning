import java.util.Scanner;

public class Q12PrimeRange {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the range");
        int from = scn.nextInt();
        int to = scn.nextInt();
        System.out.println("Prime numbers between "+from+" and "+to);
        for (int i=from; i<=to; i++){
            int cnt = 0;
            for(int j=2; j<i; j++){
                if(i%j == 0){
                    cnt++;
                    break;
                }
            }
            if(cnt==0){
                System.out.print(i + "  ");
            }
        }
    }
}
