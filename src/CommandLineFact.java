public class CommandLineFact {
    public static void main(String[] args) {

        for(int i=0; i<args.length; i++){
            int fact = 1;
            for(int j=1;j<=Integer.parseInt(args[i]);j++){
                fact *= j;
            }
            System.out.println("Factorial of "+args[i]+" is "+fact);
        }
    }
}
