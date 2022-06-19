import java.util.Scanner;

class FizzBuzz {
    private int n;

    FizzBuzz(int n) {
        this.n = n;
    }
    int i = 0;
    public void fizz(Runnable printFizz) {
        while (i <= n) {
            if (i % 3 == 0 && i % 5 != 0) {
                //printFizz.run();
                System.out.println("fizz");
                i++;
            } else {

            }
        }
    }

    public void buzz(Runnable printBuzz) {
        while (i <= n) {
            if (i % 3 != 0 && i % 5 == 0) {
                //printFizz.run();
                System.out.println("buzz");
                i++;
            } else {

            }
        }
    }

    public void fizzbuzz(Runnable printFizzBuzz) {
        while (i <= n) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
                i++;
            } else {

            }
        }
    }

    public void number(Runnable printNumber) {
        while (i <= n) {
            if (i % 3 != 0 && i % 5 != 0) {
                //printFizz.run();
                System.out.println(i);
                i++;
            } else {

            }
        }
    }
}

public class FizzBuzzMultithreading {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        FizzBuzz fb = new FizzBuzz(n);

        Thread A = new Thread((Runnable) fb);
        A.start();
        Thread B = new Thread((Runnable) fb);
        B.start();
        Thread C = new Thread((Runnable) fb);
        C.start();
        Thread D = new Thread((Runnable) fb);
        D.start();
    }
}
