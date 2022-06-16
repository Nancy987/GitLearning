import java.util.Scanner;

public class NumberSystemConvertor {

    public static boolean isValidFormat(long num, int choice){
        boolean status = false;
        int base;
        if(choice==1){
            base = 2;
        }
        else if(choice==2){
            base = 10;
        }
        else if(choice==3){
            base = 8;
        }
        else if(choice==4){
            base = 16;
        }
        else{
            return false;
        }
        while (num != 0) {
            int digit = (int) (num % 10);
            if (digit < base && digit >= 0) {
                status = true;
            } else {
                status = false;
                break;
            }
            num = num/10;
        }
        return status;
    }
    public static boolean isHexDecimal(String num){
        boolean status = false;
        for(int index=0;index<num.length();index++){
            char character = num.charAt(index);
            if ((character >= '0' && character <= '9') || (character >= 'A' && character <= 'F')) {
                    status = true;
            } else {
                status = false;
                break;
            }
        }
        return status;
    }

    public static int binaryToDecimal(long binary){
        int decimalNumber = 0, power = 0;

        while (binary > 0) {
            int digit = (int) (binary % 10);
            decimalNumber += Math.pow(2, power++) * digit;
            binary /= 10;
        }
        return decimalNumber;
    }

    public static long decimalToBinary(int decimalNumber){
        String binaryString = Integer.toBinaryString(decimalNumber);
        int binaryNumber = Integer.parseInt(binaryString);
        return binaryNumber;
    }

    public static int decimalToOctal(int decimalNumber)
    {
        String octalString = Integer.toOctalString(decimalNumber);
        int octalNumber = Integer.parseInt(octalString);

        return octalNumber;
    }

    public static String decimalToHex(int decimalNumber){
        String hexNumber = Integer.toHexString(decimalNumber);
        hexNumber = hexNumber.toUpperCase();

        return hexNumber;
    }
    public static String binaryToHex(long binary)
    {
        int decimalNumber = binaryToDecimal(binary);
        String hexNumber = decimalToHex(decimalNumber);
        return hexNumber;
    }

    public static int binaryToOctal(long binary){
        int decimalNumber = binaryToDecimal(binary);
        int octalNumber = decimalToOctal(decimalNumber);
        return octalNumber;
    }

    public static long octalToBinary(int octal){
        String binaryValue = Integer.toBinaryString(octal);
        long binaryNumber = Integer.parseInt(binaryValue);
        return binaryNumber;
    }
    public static int octalToDecimal(int octal){
        String binaryValue = Integer.toBinaryString(octal);
        int binaryNumber = Integer.parseInt(binaryValue);
        int DecimalNumber = binaryToDecimal(binaryNumber);
        return DecimalNumber;
    }
    public static String octalToHex(int octal){
        String binaryValue = Integer.toBinaryString(octal);
        int binaryNumber = Integer.parseInt(binaryValue);
        String hexNumber = binaryToHex(binaryNumber);
        return hexNumber;
    }

    public static long hexToBinary(String hex){
        int decimalNumber = Integer.parseInt(hex, 16);
        long binaryNumber = decimalToBinary(decimalNumber);
        return binaryNumber;
    }
    public static long hexToDecimal(String hex){
        int decimalNumber = Integer.parseInt(hex, 16);
        return decimalNumber;
    }
    public static long hexToOctal(String hex){
        long binaryNumber = hexToBinary(hex);
        int octalNumber = binaryToOctal(binaryNumber);
        return octalNumber;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the choice for selecting the number system format:");
        System.out.println("1. Binary\n2. Decimal\n3. Octal\n4. Hexadecimal");
        int choice1 = scn.nextInt();
        System.out.println("Enter a number: ");

        boolean result;
        long numFormatFrom = 0;
        String strFormatFrom = "";
        if(choice1==4){
            strFormatFrom = scn.next();
            result = isHexDecimal(strFormatFrom);
        }else if(choice1>=1 && choice1<=3){
            numFormatFrom = scn.nextInt();
            result = isValidFormat(numFormatFrom, choice1);
        }else{
            return;
        }
        if(!result){
            System.out.println("Please provide a valid number according to the format.");
        }else{
            System.out.println("Enter the choice in which you want to convert number system format:");
            String str = "";
            if (choice1 == 1) {
                str = "2. Decimal\n3. Octal\n4. Hexadecimal";
            } else if (choice1 == 2) {
                str = "1. Binary\n3. Octal\n4. Hexadecimal";
            } else if (choice1 == 3) {
                str = "1. Binary\n2. Decimal\n4. Hexadecimal";
            } else if (choice1 == 4) {
                str = "1. Binary\n2. Decimal\n3. Octal";
            }
            System.out.println(str);
            int choice2 = scn.nextInt();

            if(choice2 != choice1) {
                // converting code
                long toNumFormat = 0;
                String toStrFormat = "";
                if(choice1==1){
                    if(choice2==2){
                        toNumFormat = binaryToDecimal(numFormatFrom);
                    }
                    else if(choice2==3){
                        toNumFormat = binaryToOctal(numFormatFrom);
                    }
                    else if(choice2==4){
                        toStrFormat = binaryToHex(numFormatFrom);
                    }
                }
                else if(choice1==2){
                    if(choice2==1){
                        toNumFormat = decimalToBinary((int)numFormatFrom);
                    }
                    else if(choice2==3){
                        toNumFormat = decimalToOctal((int)numFormatFrom);
                    }
                    else if(choice2==4){
                        toStrFormat = decimalToHex((int)numFormatFrom);
                    }
                }
                else if(choice1==3){
                    if(choice2==1){
                        toNumFormat = octalToBinary((int)numFormatFrom);
                    }
                    else if(choice2==2){
                        toNumFormat = octalToDecimal((int)numFormatFrom);
                    }
                    else if(choice2==4){
                        toStrFormat = octalToHex((int) numFormatFrom);
                    }
                }
                else if(choice1==4){
                    if(choice2==1){
                        toNumFormat = hexToBinary(strFormatFrom);
                    }
                    else if(choice2==2){
                        toNumFormat = hexToDecimal(strFormatFrom);
                    }
                    else if(choice2==3){
                        toNumFormat = hexToOctal(strFormatFrom);
                    }
                }
                if(choice2==4){
                    System.out.println("Answer = " + toStrFormat);
                }else {
                    System.out.println("Answer = " + toNumFormat);
                }
            }else{
                System.out.println("You ara converting it into same number format. Please enter a different one!");
            }
        }
    }
}
