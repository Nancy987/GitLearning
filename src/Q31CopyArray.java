import java.util.Scanner;

public class Q31CopyArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        System.out.println("Enter elements of an array: ");
        for(int i=0;i< arr.length;i++){
            arr[i] = scn.nextInt();
            arr2[i] = arr[i];
        }
        System.out.println("First array is: ");
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("Second array is: ");
        for(int i=0; i< arr2.length; i++){
            System.out.print(arr2[i]+ " ");
        }
    }
}
