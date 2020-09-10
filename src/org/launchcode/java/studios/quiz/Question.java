package org.launchcode.java.studios.quiz;
import java.util.*;

public abstract class Question{

    public Question(String question, ArrayList correctAnswer, HashMap<Integer, String> possibleAnswers) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.possibleAnswers = possibleAnswers;
    }

    private String question;
    private List<Integer> correctAnswer;
    private HashMap<Integer, String> possibleAnswers;
    private Scanner answer;

    public boolean askQuestionGetAnswer() {

        System.out.println("\n"+this.question+"");
        for (Map.Entry<Integer, String> entry : possibleAnswers.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        List<Integer> answers = new ArrayList<>();
        for (int i =0; i < this.correctAnswer.size(); i++) {
            System.out.println("Answer "+(i+1)+" >>  ");
            answer = new Scanner(System.in);
                answers.add(answer.nextInt());
        }

        for (Integer submittedAnswer : answers) {
            if (!correctAnswer.contains(submittedAnswer)) {
                return false;
            }
        }
        for (Integer correctAnswer : correctAnswer) {
            if (!answers.contains(correctAnswer)) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> getCorrectAnswer() {
        return correctAnswer;
    }
}
