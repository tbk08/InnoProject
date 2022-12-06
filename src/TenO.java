import java.util.ArrayList;
import java.util.Scanner;

public class TenO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //questions[1][0] = new Question("Question3", 2, answerQuestion3, answerQuestion3[0]);
        int i=52;
        int level=9;
        int level1=8;
        int j=0;
        while (j<3){
            System.out.println("questions["+level1+"]["+j+"] = new Question(\"Question"+i+"\", "+level+", answerQuestion"+i+", answerQuestion"+i+"[0]);");
            j++;
            i++;
        }
        /*Answer[] answerQuestion1 = new Answer[4];
        answerQuestion1[0] = new Answer("Answer 1");
        answerQuestion1[1] = new Answer("Answer 1");
        answerQuestion1[2] = new Answer("Answer 1");
        answerQuestion1[3] = new Answer("Answer 1");

        Question[] questions = new Question[1];
        questions[0] = new Question("Question1", 1, answerQuestion1, answerQuestion1[0]);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
        }
        String s = in.nextLine();
        Answer answer = new Answer(s);
        if(questions[0].getTrueAnswer().equals(answer)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        System.out.println(answerQuestion1[0].equals(answer));
        System.out.println(answerQuestion1[1].equals(answer));
        System.out.println(answerQuestion1[2].equals(answer));
        System.out.println(answerQuestion1[3].equals(answer));
        System.out.println(answerQuestion1[0].equals(questions[0]));
        for (int i = 0; i < answerQuestion1.length; i++) {
            System.out.println(answerQuestion1[i]);
        }*/

    }
}
