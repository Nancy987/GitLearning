import java.util.Scanner;

public class ValidCredentials {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        try{
            System.out.println("Enter Username:");
            String username = scn.nextLine();
            if(username.length()<6 || username.length()>15){
                throw new Exception("Username must be of length 6-15 characters.");
            }
            else if(!Character.isUpperCase(username.charAt(0))){
                throw new Exception("Username must start with an uppercase English alphabet A to Z.");
            }
            else if(username.contains(" ") || username.contains("(") || username.contains(")")){
                throw new Exception("Parentheses or whitespaces is not allowed in a valid username.");
            }

            try{
                System.out.println("Enter Password:");
                String password = scn.nextLine();
                if(password.length()<8 || password.length()>256) {
                    throw new Exception("Password must not be shorter than 8 characters and must not exceed 256.");
                }
                else if(password.contains(" ") || password.contains("(") || password.contains(")")) {
                    throw new Exception("Parentheses or whitespaces is not allowed in a valid password");
                }
                else if(password.toLowerCase().contains(username.toLowerCase())){
                    throw new Exception("Password cannot contain or be the same as its associated username");
                }
                else {
                    System.out.println("Valid username and password");
                }
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

//class InvalidUsername extends Exception{
//    InvalidUsername(String error){
//        super(error);
//    }
//}
