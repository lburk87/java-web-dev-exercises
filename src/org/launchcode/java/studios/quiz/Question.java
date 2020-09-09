package org.launchcode.java.studios.quiz;

import java.util.Scanner;

public class Question {

    private int id;
    private static int nextId = 1;
    private String question;
    private Scanner answer;
    private String correctAnswer;

    public Question() {
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public void askQuestionGetAnswer() {
        System.out.println(this.question);
        this.answer = new Scanner(System.in);
        System.out.println("Correct answer: "+this.correctAnswer);
        System.out.println("Your answer: "+answer);
    }
}
