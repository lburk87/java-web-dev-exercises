package org.launchcode.java.studios.quiz;
import java.util.ArrayList;
import java.util.Scanner;

public class QuizRunner {

    private Question[] questions;


    public static void main(String[] args) {


        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            questions[i].askQuestionGetAnswer();
            if (questions[i].getAnswer().toString() == questions[i].getCorrectAnswer().toString());
            score++;
            }
            System.out.println("Score: "+score+"/"+questions.length);
        }

}


