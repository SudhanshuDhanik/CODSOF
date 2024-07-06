package Task_2;

import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double marks = 0.0;
        System.out.print("Enter your number of subjects:");
        int n = sc.nextInt();
        System.out.println("\nEnter marks obtained (range from 1 to 100) in each subject");
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks obtained in subject number " + i + " :");
            marks = sc.nextDouble();
            if (marks > 100 || marks < 0) {
                System.out.println("Invalid Marks");
                return;
            }
            sum += marks; // Count total marks of single student
        }
         System.out.println("\n ***********Result***********\n");
        // String.format("%.2f", value) is used to format the decimal value upto
        // specific digit.
        System.out.println("You got " + String.format("%.2f", sum) + " marks out of " + 100 * n);

        // sum/n will give average percentage
        System.out.println("You got " + String.format("%.2f", sum / n) + " percentage");

        if (sum / n > 90)
            System.out.println("Outstanding ! you got O grade.");

        // Since only one statement get execute so there is no need to write 2 condition
        // like: else if(sum/n>=85 && sum/n<90)
        // because if sum/n >90 then first if statement get executed and compiler don't
        // check for other statements.
        else if (sum / n >= 85)
            System.out.println("Excellent! you got A+ grade");
        else if (sum / n >= 80)
            System.out.println("Very Good! you got A grade.");
        else if (sum / n >= 70)
            System.out.println("Good! you got B+ grade.");
        else if (sum / n >= 60)
            System.out.println("Average! you got B grade");
        else if (sum / n >= 50)
            System.out.println("Can do better! you got C grade");
        else if (sum / n >= 33)
            System.out.println("Need to do better! you got D grade");
        else
            System.out.println("Need much Hard Work! You are fail");
    }
}
