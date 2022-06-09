import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighestScoringWord {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a string containing words");
        String str = scn.nextLine();
        String maxWord = "";
        int max = 0;

        for (String word : str.split(" ")){
            int sum = 0;
            for(int i=0; i<word.length(); i++) {
                char c = word.charAt(i);
                if (c != ' ') {
                    sum += c - 'a' + 1;
                }
            }
            if(max<sum){
                max = sum;
                maxWord = word;
            }
        }
        System.out.println(maxWord);
    }
}
