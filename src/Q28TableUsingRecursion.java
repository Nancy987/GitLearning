import java.util.Scanner;

public class Q28TableUsingRecursion {
    static void Table(int n, int i){
        if(i>10){
            return;
        }
        System.out.println(n + "*" + i + "=" +n*i);
        Table(n,i+1);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scn.nextInt();
        Table(n,1);
    }
}
