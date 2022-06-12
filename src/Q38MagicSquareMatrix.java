import java.util.Scanner;

public class Q38MagicSquareMatrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number for rows & columns: ");
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter elements of an array: ");
        for(int i=0;i< n;i++){
            for(int j=0;j< n;j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int sumd1=0, sumd2=0;
        for(int i=0;i< n;i++){
            sumd1 += arr[i][i];
            sumd2 += arr[i][n-1-i];
        }
        int flag = 0;
        if(sumd1==sumd2){
            for(int i=0;i< n;i++){
                int sumr=0, sumc = 0;
                for(int j=0;j< n;j++){
                    sumr += arr[i][j];
                    sumc += arr[j][i];
                }
                if(sumr!=sumc || sumr!=sumd1){
                    flag = 1;
                    break;
                }
            }
        }else{
            flag = 1;
        }
        if(flag==1){
            System.out.println("Given matrix is not a Magic Square Matrix.");
        }else{
            System.out.println("Given matrix is a Magic Square Matrix.");
        }
    }
}
