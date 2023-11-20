import week01.Question1;
import week01.Question2;
import week01.Question3;

public class Main {
    public static void main(String[] args) {
        // question 1
        int A[] = {4, 1, 2, 3};
        int A1[] = {1, 2, 3, 3, 2, 1, 5};
        int A2[] = {1000000000, 1, 2, 2, 1000000000, 1, 1000000000};
        int A3[] = {4, 5, 6, 7, 3, 4, 1, 5};
        int A4[] = {8, 8, 8, 8};
        int A5[] = {1, 2, 3, 4, 5};
        int A6[] = {5, 4, 3, 2, 1};
        Question1 question1 = new Question1();
        System.out.println("\nResult of question 1: " + question1.solution(A3));

        // question 2
        String S = "babaa";
        String S1 = "bbbab";
        String S3 = "bbbaaabbb";
        String S4 = "abbbabbaa";
        Question2 question2 = new Question2();
        System.out.println("\nResult of question 2: " + question2.solution(S4));

        // question 3
        int B[] = {51, 71, 17, 42};
        int B1[] = {42, 33, 60};
        int B2[] = {51, 32, 43};
        Question3 question3 = new Question3();
        System.out.println("\nResult of question 3: " + question3.solution(B1, B1.length));

        //
    }

}