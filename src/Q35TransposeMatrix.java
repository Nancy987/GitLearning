import java.util.Scanner;

public class Q35TransposeMatrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number of rows: ");
        int n = scn.nextInt();
        System.out.println("Enter a number of columns: ");
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        int[][] newArr = new int[m][n];
        System.out.println("Enter elements of an array: ");
        for(int i=0;i< n;i++){
            for(int j=0;j< m;j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        for(int i=0;i< n;i++) {
            for (int j = 0; j < m; j++) {
                newArr[j][i] = arr[i][j];
            }
        }
        System.out.println("Transpose of matrix is :");
        for(int i=0;i< newArr.length;i++) {
            for (int j = 0; j < newArr[0].length; j++) {
                System.out.print(newArr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
