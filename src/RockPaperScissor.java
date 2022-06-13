import java.io.*;
import java.util.Scanner;

class InvalidPlayerName extends Exception{
    InvalidPlayerName(String error){
        super(error);
    }
}
public class RockPaperScissor {
    public static String setInputChoice(int choice){
        String Response = "";
        switch(choice){
            case 1:
                Response = "Rock";
                break;
            case 2:
                Response = "Paper";
                break;
            case 3:
                Response = "Scissor";
                break;
            case 4:
                Response = "Exit";
                break;
            default:
                System.out.println("Please enter valid choice.");
        }
        return Response;
    }
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_BLUE = "\u001B[34m";
    public static final String TEXT_GREEN = "\u001B[42m";

    public static void main(String[] args) throws IOException {
        System.out.println(TEXT_RED+"-----------------ROCK PAPER SCISSOR-----------------------"+TEXT_RESET);
        System.out.println("Let's Start The Game! Press Y to Start");
        Scanner scn = new Scanner(System.in);
        char choice = scn.next().charAt(0);
        if(choice=='Y' || choice=='y'){
            System.out.println("Enter Your name : ");
            String playerName = "";
            try{
                playerName = scn.next();
                int foundDigit = 0;
                for(int index = 0; index<playerName.length(); index++){
                    char character = playerName.charAt(index);
                    if(Character.isDigit(character)){
                        foundDigit = 1;
                        break;
                    }
                }
                if(foundDigit==1){
                    throw new InvalidPlayerName("Player Name should not contain any digit.");
                }
            }
            catch(InvalidPlayerName e){
                System.out.println(e.getMessage());
                return;
            }
            int highestScore = 0;
            int playerScore = 0;
            boolean isUserExist = false;
            String filePath = "D://Players_Record.txt";
            try {
                StringBuffer buffer = new StringBuffer();
                Scanner sc = new Scanner(new File(filePath));

                while (sc.hasNextLine()) {
                    String readRecord = sc.nextLine() + System.lineSeparator();

                    if(readRecord.contains(playerName)){
                        String[] res = readRecord.split("[=]", 0);
                        try{
                            highestScore = Integer.parseInt(res[1].replaceAll("\\s", ""));
                        }
                        catch(NumberFormatException e){
                            System.out.println("Invalid Number Format");
                        }
                        isUserExist = true;
                    }
                    buffer.append(readRecord);
                }
            }
            catch(FileNotFoundException e){
                System.out.println("File not found.");
            }
            System.out.println("Your Highest Score is "+highestScore);
            char choicetocontinue;
            do {
                System.out.println("Enter your choice:\n1. Rock\n2. Paper\n3. Scissor \n4. Exit");
                int userChoice = scn.nextInt();
                String userResponse = setInputChoice(userChoice);

                int minValue = 1;
                int maxValue = 3;
                int computerChoice = (int) (Math.random() * (maxValue - minValue + 1) + minValue);
                String computerResponse = setInputChoice(computerChoice);
                if(userChoice==4){
                    return;
                }
                System.out.println(TEXT_BLUE + "Your choice: " + TEXT_RESET + userResponse);
                System.out.println(TEXT_BLUE + "Computer choice: " + TEXT_RESET + computerResponse);
                String result = "";
                if (userChoice == 1) {
                    if (computerChoice == 3) {
                        result = "You win";
                        playerScore++;
                    } else if (computerChoice == 1) {
                        result = "It's a draw";
                    } else if (computerChoice == 2) {
                        result = "Computer win";
                    }
                } else if (userChoice == 2) {
                    if (computerChoice == 1) {
                        result = "You win";
                        playerScore++;
                    } else if (computerChoice == 2) {
                        result = "It's a draw";
                    } else if (computerChoice == 3) {
                        result = "Computer win";
                    }
                } else if (userChoice == 3) {
                    if (computerChoice == 2) {
                        result = "You win";
                        playerScore++;
                    } else if (computerChoice == 3) {
                        result = "It's a draw";
                    } else if (computerChoice == 1) {
                        result = "Computer win";
                    }
                }
                System.out.println(TEXT_GREEN + result + TEXT_RESET);
                System.out.println("Do you want to continue? Press Y/N");
                choicetocontinue = scn.next().charAt(0);
            }while(choicetocontinue=='Y' || choicetocontinue=='y');

            if(playerScore>=highestScore){
                Scanner sc = new Scanner(new File(filePath));
                StringBuffer buffer = new StringBuffer();
                while (sc.hasNextLine()) {
                    String updateRecord = sc.nextLine() + System.lineSeparator();
                    if(updateRecord.contains(playerName)){
                        updateRecord = playerName+"="+playerScore+"\n";
                    }
                    buffer.append(updateRecord);
                }
                String fileContents = buffer.toString();
                if(!isUserExist) {
                    fileContents += playerName + "=" + playerScore;
                }
                FileWriter writer = new FileWriter(filePath);
                writer.append(fileContents);
                writer.flush();
            }
        }else{
            System.out.println("Please press Y to start the game.");
        }
    }
}
