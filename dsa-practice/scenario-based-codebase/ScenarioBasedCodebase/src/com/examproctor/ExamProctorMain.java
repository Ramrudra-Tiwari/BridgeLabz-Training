package com.examproctor;

import java.util.Scanner;

public class ExamProctorMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExamSession session = new ExamSession();
        int choice;

        do {
            System.out.println("\n=== Exam Proctor System ===");
            System.out.println("1. Visit Question");
            System.out.println("2. Answer Question");
            System.out.println("3. Go Back");
            System.out.println("4. Submit Exam");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Question ID: ");
                    int qId = sc.nextInt();
                    session.visitQuestion(qId);
                    break;

                case 2:
                    System.out.print("Enter Question ID: ");
                    qId = sc.nextInt();
                    System.out.print("Enter Answer (A/B/C/D): ");
                    String ans = sc.next();
                    session.answerQuestion(qId, ans);
                    break;

                case 3:
                    session.goBack();
                    break;

                case 4:
                    int score = session.calculateScore();
                    System.out.println("Exam submitted.");
                    System.out.println("Your Score: " + score);
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
