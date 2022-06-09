import java.util.ArrayList;
import java.util.Scanner;

public class LikeSystem {
    public static String likeSystem(String[] users){
        String str = "";
        if(users.length==0){
            str = "no one likes this";
        }
        else if(users.length==1){
            str = users[0]+" likes this";
        }
        else if(users.length==2){
            str = users[0]+" and "+users[1]+" likes this";
        }
        else if(users.length==3){
            str = users[0]+", "+users[1]+" and "+users[2]+" likes this";
        }else{
            str = users[0]+", "+users[1]+" and ";
            str += users.length-2;
            str += " others like this";
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter no of users:");
        int len = scn.nextInt();

        String[] users = new String[len];
        for(int i=0;i<users.length;i++){
            System.out.println("Enter user: "+i+1);
            users[i] = scn.next();
        }
        String str = likeSystem(users);
        System.out.println(str);
    }
}
