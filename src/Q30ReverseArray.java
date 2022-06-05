import java.util.Scanner;

public class Q30ReverseArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of an array: ");
        for(int i=0;i< arr.length;i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("Reversed array is: ");
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+ " ");
        }
    }
}
