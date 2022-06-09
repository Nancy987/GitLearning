import java.util.Scanner;

public class Q25FibonaciiTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r = scn.nextInt();
        int a = 1;
        int b = 1;
        //System.out.print(a+" "+b);

        for(int i=1;i<=r;i++){
            if(i==1){
                System.out.print(1);
            }
            else if(i==2){
                System.out.print(1+" "+2);
                b = 2;
            }
            else{
                for(int j=1;j<=i;j++){
                    int c = a+b;
                    System.out.print(c+" ");
                    a = b;
                    b = c;
                }
            }
            System.out.println();
        }
    }
}
