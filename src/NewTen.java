import java.util.ArrayList;
import java.util.Scanner;

public class NewTen {
    public static void main(String[] args) {
        int level = 10;// кол-во уровней сложности
        int x = 5;// средний уровень сложности

        Scanner scanner = new Scanner(System.in);
        ArrayList<String>[] questions = new ArrayList[level];
        for (int i = 0; i < questions.length; i++) {
            questions[i] = new ArrayList<>();
        }
        ArrayList<String>[] answers = new ArrayList[level];
        for (int i = 0; i < answers.length; i++) {
            answers[i] = new ArrayList<>();
        }

        questions[0].add("Question 1 level 1");
        questions[0].add("Question 2 level 1");
        questions[1].add("Question 1 level 2");
        questions[1].add("Question 2 level 2");
        questions[1].add("Question 3 level 2");
        questions[1].add("Question 4 level 2");
        questions[2].add("Question 1 level 3");
        questions[2].add("Question 2 level 3");
        questions[2].add("Question 3 level 3");
        questions[2].add("Question 4 level 3");
        questions[2].add("Question 5 level 3");
        questions[2].add("Question 6 level 3");
        questions[3].add("Question 1 level 4");
        questions[3].add("Question 2 level 4");
        questions[3].add("Question 3 level 4");
        questions[3].add("Question 4 level 4");
        questions[3].add("Question 5 level 4");
        questions[3].add("Question 6 level 4");
        questions[3].add("Question 7 level 4");
        questions[3].add("Question 8 level 4");
        questions[4].add("Question 1 level 5");
        questions[4].add("Question 2 level 5");
        questions[4].add("Question 3 level 5");
        questions[4].add("Question 4 level 5");
        questions[4].add("Question 5 level 5");
        questions[4].add("Question 6 level 5");
        questions[4].add("Question 7 level 5");
        questions[4].add("Question 8 level 5");
        questions[4].add("Question 9 level 5");
        questions[4].add("Question 10 level 5");
        questions[5].add("Question 1 level 6");
        questions[5].add("Question 2 level 6");
        questions[5].add("Question 3 level 6");
        questions[5].add("Question 4 level 6");
        questions[5].add("Question 5 level 6");
        questions[5].add("Question 6 level 6");
        questions[5].add("Question 7 level 6");
        questions[5].add("Question 8 level 6");
        questions[5].add("Question 9 level 6");
        questions[6].add("Question 1 level 7");
        questions[6].add("Question 2 level 7");
        questions[6].add("Question 3 level 7");
        questions[6].add("Question 4 level 7");
        questions[6].add("Question 5 level 7");
        questions[6].add("Question 6 level 7");
        questions[6].add("Question 7 level 7");
        questions[7].add("Question 1 level 8");
        questions[7].add("Question 2 level 8");
        questions[7].add("Question 3 level 8");
        questions[7].add("Question 4 level 8");
        questions[7].add("Question 5 level 8");
        questions[8].add("Question 1 level 9");
        questions[8].add("Question 2 level 9");
        questions[8].add("Question 3 level 9");
        questions[9].add("Question 1 level 10");

        answers[0].add("Answer");
        answers[0].add("Answer");
        answers[1].add("Answer");
        answers[1].add("Answer");
        answers[1].add("Answer");
        answers[1].add("Answer");
        answers[2].add("Answer");
        answers[2].add("Answer");
        answers[2].add("Answer");
        answers[2].add("Answer");
        answers[2].add("Answer");
        answers[2].add("Answer");
        answers[3].add("Answer");
        answers[3].add("Answer");
        answers[3].add("Answer");
        answers[3].add("Answer");
        answers[3].add("Answer");
        answers[3].add("Answer");
        answers[3].add("Answer");
        answers[3].add("Answer");
        answers[4].add("Answer");
        answers[4].add("Answer");
        answers[4].add("Answer");
        answers[4].add("Answer");
        answers[4].add("Answer");
        answers[4].add("Answer");
        answers[4].add("Answer");
        answers[4].add("Answer");
        answers[4].add("Answer");
        answers[4].add("Answer");
        answers[5].add("Answer");
        answers[5].add("Answer");
        answers[5].add("Answer");
        answers[5].add("Answer");
        answers[5].add("Answer");
        answers[5].add("Answer");
        answers[5].add("Answer");
        answers[5].add("Answer");
        answers[5].add("Answer");
        answers[6].add("Answer");
        answers[6].add("Answer");
        answers[6].add("Answer");
        answers[6].add("Answer");
        answers[6].add("Answer");
        answers[6].add("Answer");
        answers[6].add("Answer");
        answers[7].add("Answer");
        answers[7].add("Answer");
        answers[7].add("Answer");
        answers[7].add("Answer");
        answers[7].add("Answer");
        answers[8].add("Answer");
        answers[8].add("Answer");
        answers[8].add("Answer");
        answers[9].add("Answer");


        ArrayList<String> sorted = new ArrayList();

        int breaking = 0;
        String check = "";
        int temp = 1;
        int iForQuestion = 0;
        int iForLevel = x - 1;
        int stop = 0;
        while (breaking != level) {
            if (!sorted.contains(questions[iForLevel].get(iForQuestion))) {
                sorted.add(questions[iForLevel].get(iForQuestion));
                System.out.println(questions[iForLevel].get(iForQuestion));
                check = scanner.next();
                if (check.equals(answers[iForLevel].get(iForQuestion))) {
                    if (iForLevel == 4 && stop == 0) {
                        temp = 1;
                        iForLevel++;
                        iForQuestion = 0;
                        stop = 1;
                    }
                    else if (temp == 1 && stop == 1) {
                        iForQuestion++;
                        temp++;
                    } else if (temp == 2 && stop == 1) {
                        iForLevel++;
                        iForQuestion = 0;
                        temp = 1;
                    }
                    breaking++;
                } else {
                    if (temp == 1 && iForLevel > 4) {
                        iForLevel--;
                        iForQuestion = 0;
                    } else if (temp == 2 && iForLevel > 4) {
                        iForQuestion++;
                        temp = 1;
                    } else if (temp == 1 && iForLevel <= 4) {
                        temp++;
                        iForQuestion++;
                    } else if (temp == 2 && iForLevel <= 4) {
                        temp = 1;
                        iForLevel--;
                        iForQuestion = 0;
                    }
                    breaking++;
                }
            } else {
                iForQuestion++;
            }
        }




/*
        // вывод вопросов и ответов
        for (int i = 0; i < questions.length; i++) {
            for (int j = 0; j < questions[i].size(); j++) {
                System.out.print(questions[i].get(j) + "\t");
            }
            System.out.println();
        }
  /*      System.out.println();
        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < answers[i].size(); j++) {
                System.out.print(answers[i].get(j) + "\t");
            }
            System.out.println();
        }
    */


    }
}
