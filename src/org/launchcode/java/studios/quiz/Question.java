package org.launchcode.java.studios.quiz;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Question{

    private int id;

    public Question(String question, List<Integer> correctAnswer, HashMap<Integer, String> possibleAnswers) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.possibleAnswers = possibleAnswers;

//        this.possibleAnswers = new HashMap<>();
//        this.possibleAnswers.put(Integer.parseInt("1"), "true");
    }

    private static int nextId = 1;
    private String question;
    private List<Integer> correctAnswer;
    private HashMap<Integer, String> possibleAnswers;
    private Scanner answer;


    public Question() {
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public boolean askQuestionGetAnswer() {
        answer = new Scanner(System.in);
        System.out.println(this.question);
        for (Map.Entry<Integer, String> entry : possibleAnswers.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        int answerInt = answer.nextInt();
        return this.correctAnswer.contains(answerInt);
    }


}
