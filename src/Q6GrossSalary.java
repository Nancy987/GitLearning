import java.util.Scanner;

public class Q6GrossSalary {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float basic_sal = scn.nextFloat();
        float TA = basic_sal * 10 * 0.01f;
        float DA = basic_sal * 15 * 0.01f;
        float HRA = basic_sal * 20 * 0.01f;
        float PF = basic_sal * 12 * 0.01f;
        float bonus = 0;
        if(basic_sal >= 20.000){
            bonus += 10 * basic_sal * 0.01;
        }else{
            bonus += 20 * basic_sal * 0.01;
        }
        float gross_sal = basic_sal + DA + TA + HRA + bonus - PF;
        System.out.println("TA = "+TA);
        System.out.println("DA = "+DA);
        System.out.println("HRA = "+HRA);
        System.out.println("PF = "+PF);
        System.out.println("Bonus = "+bonus);
        System.out.println("Gross Salary is "+gross_sal);
    }
}
