import java.util.Scanner;

public class Q34SecondLargestInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of an array: ");
        for(int i=0;i< arr.length;i++){
            arr[i] = scn.nextInt();
        }
        for(int i=0;i< arr.length;i++){
            for(int j = i+1; j<arr.length;j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int max = arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]<max){
                max = arr[i];
                break;
            }
        }
        System.out.println("Second Largest Element is "+max);
    }
}
