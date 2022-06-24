import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements:");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n);

        for(int i=1;i<=n;i++){
            System.out.println("Enter element "+i+": ");
            list.add(scn.nextInt());
        }

        ArrayList<Integer> newList = new ArrayList<>();

        for (Integer num : list) {
            if (!newList.contains(num)) {
                newList.add(num);
            }
        }
        System.out.println("New array list: \n"+newList);
    }
}
