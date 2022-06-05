import java.util.Scanner;

public class Q29AlternatePrimeNo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scn.nextInt();
        int flag = 1;
        int alt = 0;
        for(int i=2;i<=n;i++){
            int cnt = 0;
            for(int j=2; j<i;j++) {
                if (i % j == 0) {
                    cnt++;
                    break;
                }
            }
            if(cnt==0) {
                if(alt%2==0) {
                    System.out.println(i);
                }
                alt++;
            }
        }
    }
}
