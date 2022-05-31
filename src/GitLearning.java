public class GitLearning {
    public static void main(String[] args) {
        int num = 371, originalNum, rem, result = 0;
        originalNum = num;

        while(originalNum!=0){
            rem = originalNum%10;
            result += Math.pow(rem,3);
            originalNum = originalNum/10;
        }
        if(result==num){
            System.out.println(num + " is an Armstrong number.");
        }else{
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
