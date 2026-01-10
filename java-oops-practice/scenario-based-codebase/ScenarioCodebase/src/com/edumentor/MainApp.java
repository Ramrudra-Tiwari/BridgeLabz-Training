package com.edumentor;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("   📘 Welcome to EduMentor AI   ");
        System.out.println("=================================");

        System.out.print("Enter learner name: ");
        String name = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        System.out.print("Is Full-Time Course? (true/false): ");
        boolean fullTime = sc.nextBoolean();

        Learner learner = new Learner(name, email, 101, fullTime);

        String[] questions = {
            "Java is platform independent?",
            "OOP supports inheritance?"
        };

        String[] answers = { "yes", "yes" };

        Quiz quiz = new Quiz(questions, answers, 2);

        sc.nextLine(); // buffer clear
        String[] userAnswers = new String[2];

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            userAnswers[i] = sc.nextLine();
        }

        quiz.submitQuiz(userAnswers);
        quiz.showResult();

        learner.generateCertificate();

        sc.close();
    }
}
