package com.edumentor;

public class Quiz {

    private String[] questions;   // private → internal question bank
    private String[] answers;     // encapsulated (cannot be changed)
    private int score;
    private int difficulty;

    // Constructor with difficulty
    public Quiz(String[] questions, String[] answers, int difficulty) {
        this.questions = questions;
        this.answers = answers;
        this.difficulty = difficulty;
        this.score = 0;
    }

    // Answers modify nahi ho sakte (no setter)
    public void submitQuiz(String[] userAnswers) {

        for (int i = 0; i < answers.length; i++) {
            if (answers[i].equalsIgnoreCase(userAnswers[i])) {
                score++; // operator usage
            }
        }
    }

    public void showResult() {
        int total = questions.length;
        double percentage = (score * 100.0) / total; // operator

        System.out.println("Quiz Difficulty Level: " + difficulty);
        System.out.println("Score: " + score + "/" + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}
