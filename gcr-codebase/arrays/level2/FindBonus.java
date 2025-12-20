// Java program to find the bonus of 10 employees based on their years of serviceprogram to find the bonus of 10 employees based on their years of service.


import java.util.Scanner;

public class FindBonus {
    public static void main(String[] args) {

    	// Creating Scanner to take user input
        Scanner sc = new Scanner(System.in);

        // Arrays to store salary and years of service
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];

        // Arrays to store bonus and new salary
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Variables to store totals
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Input loop
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Salary: ");
            salary[i] = sc.nextDouble();

            System.out.print("Years of Service: ");
            yearsOfService[i] = sc.nextDouble();

            // Validation check
            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input! Please enter again.");
                i--; 
                continue;
            }

            totalOldSalary += salary[i];
        }

        // Calculation loop
        for (int i = 0; i < 10; i++) {

            // Bonus calculation
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        // Output results
        System.out.println("\n--- Zara Company Bonus Summary ---");
        System.out.println("Total Old Salary  : " + totalOldSalary);
        System.out.println("Total Bonus Paid  : " + totalBonus);
        System.out.println("Total New Salary  : " + totalNewSalary);

        sc.close();
    }
}
