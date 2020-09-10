package org.launchcode.java.studios.quiz;
import java.util.*;

public class QuizRunner {

    public static void main(String[] args) {

//        Question 1
        HashMap<Integer, String> possible1 = new HashMap<>();
        possible1.put(1, "Ethel");
        possible1.put(2, "Gretta");
        possible1.put(3, "Dorothy");
        possible1.put(4, "Mabel");
        ArrayList<Integer> correct1 = new ArrayList<>();
        correct1.add(4);
        CheckBox question1 = new CheckBox("What is my dog's name?", correct1, possible1);

//        Question 2
        HashMap<Integer, String> possible2 = new HashMap<>();
        possible2.put(1, "wee");
        possible2.put(2, "ugly");
        possible2.put(3, "precious");
        possible2.put(4, "average");
        ArrayList<Integer> correct2 = new ArrayList<>();
        correct2.add(1);
        correct2.add(3);
        MultipleChoice question2 = new MultipleChoice("What words describe Mabel?", correct2, possible2);

//        Question 3
        HashMap<Integer, String> possible3 = new HashMap<>();
        possible3.put(1, "true");
        possible3.put(2, "false");
        ArrayList<Integer> correct3 = new ArrayList<>();
        correct3.add(2);
        TrueFalse question3 = new TrueFalse("Mabel is not the best dog in the world.", correct3, possible3);

//        Question list
        ArrayList<Question> questions = new ArrayList<>();
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);

//         Quiz
        int score = 0;
        for (int i = 0; i < questions.size(); i++)  {
            boolean questionUnanswered = true;
                while(questionUnanswered) {
                    try {
                        if (questions.get(i).askQuestionGetAnswer()) {
                            System.out.println("Correct!");
                            score++;
                        } else {
                            System.out.println("Nope. Correct answer(s): " + questions.get(i).getCorrectAnswer());
                        }
                        questionUnanswered = false;
                    } catch(Exception e) {
                        System.out.println("Enter a number.");
                    }
                }

            } System.out.println("\nScore: "+(score/(questions.size())*100+"%"));

        }

    }

