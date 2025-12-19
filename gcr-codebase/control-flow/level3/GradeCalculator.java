// Program to calculate percentage, grade, and remarks based on marks
import java.util.Scanner;

public class CalculateGrade
{
    public static void main(String[] args)
    {
        //Creating scanner to take input
        Scanner Sc = new Scanner(System.in);

        // Input marks for three subjects
        System.out.print("Enter marks for Physics: ");
        double physics = Sc.nextDouble();

        System.out.print("Enter marks for Chemistry: ");
        double chemistry = Sc.nextDouble();

        System.out.print("Enter marks for Maths: ");
        double maths = Sc.nextDouble();

        // Calculate total and percentage
        double total = physics + chemistry + maths;
        double percentage = total / 3;

        System.out.println("\nTotal Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

    
        // Determine grade and remarks based on percentage
        if (percentage >= 80)
        {
            System.out.println("Grade A");
            System.out.println("Level 4, above agency-normalized standards");
        }
        else if (percentage >= 70)
        {
            System.out.println("Grade B");
            System.out.println("Level 3, at agency-normalized standards");
        }
        else if (percentage >= 60)
        {
            System.out.println("Grade C");
            System.out.println("Level 2, below, but approaching agency-normalized standards");
        }
        else if (percentage >= 50)
        {
            System.out.println("Grade D");
            System.out.println("Level 1, well below agency-normalized standards");
        }
        else if (percentage >= 40)
        {
            System.out.println("Grade E");
            System.out.println("Level 1-, too below agency-normalized standards");
        }
        else
        {
            System.out.println("Grade R");
            System.out.println("Remedial standards");
        }

        

        Sc.close();
    }
}