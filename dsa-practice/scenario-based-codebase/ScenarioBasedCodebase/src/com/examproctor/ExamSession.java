package com.examproctor;

import java.util.HashMap;
import java.util.Stack;

public class ExamSession {

    // stack to track last visited questions
    private Stack<Integer> questionStack = new Stack<>();

    // questionId -> answer
    private HashMap<Integer, String> answers = new HashMap<>();

    // correct answers (for evaluation)
    private HashMap<Integer, String> correctAnswers = new HashMap<>();

    public ExamSession() {
        // sample correct answers
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");
        correctAnswers.put(4, "D");
    }

    // visit a question
    public void visitQuestion(int questionId) {
        questionStack.push(questionId);
        System.out.println("Visited Question " + questionId);
    }

    // answer a question
    public void answerQuestion(int questionId, String answer) {
        answers.put(questionId, answer.toUpperCase());
        System.out.println("Answer saved.");
    }

    // go back to last question
    public void goBack() {
        if (questionStack.isEmpty()) {
            System.out.println("No previous question.");
            return;
        }
        int last = questionStack.pop();
        System.out.println("Returned from Question " + last);
    }

    // calculate score
    public int calculateScore() {
        int score = 0;

        for (int qId : answers.keySet()) {
            if (correctAnswers.containsKey(qId) &&
                correctAnswers.get(qId).equalsIgnoreCase(answers.get(qId))) {
                score++;
            }
        }
        return score;
    }
}
