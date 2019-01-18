package com.company;

public class Main {

    public static void main(String[] args) {
        String question = "If you were given a PhD degree, but had no more knowledge of the subject of the degree besides what you have now, what degree would you want to be given to you? If you were given a PhD degree, but had no more knowledge of the subject of the degree besides what you have now, what degree would you want to be given to you?If you were given a PhD degree, but had no more knowledge of the subject of the degree besides what you have now, what degree would you want to be given to you?If you were given a PhD degree, but had no more knowledge of the subject of the degree besides what you have now, what degree would you want to be given to you?";


        if (question.length() == 0) {
            System.out.println("Please ask a question");
        }
          else if (question.length() < 200) {
            System.out.println("Ask a better question!");
        } else if (question.length() > 500) {
            System.out.println("Simplify your question!");
        } else {
            System.out.println("Thank you for thinking this through, I will begin processing your answer when I get a chance!");
        }
    }
}
