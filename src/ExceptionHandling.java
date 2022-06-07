import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        try{
            System.out.println("Enter value of x");
            int x = scn.nextInt();
            System.out.println("Enter value of y");
            int y = scn.nextInt();
            int res = x/y;
            System.out.println(res);
        }
        catch (InputMismatchException e){
            System.out.println("Please provide only 32 bit signed integer.");
        }
        catch(ArithmeticException e){
            System.out.println("Y can not be 0");
        }
    }
}
