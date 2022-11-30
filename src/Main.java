public class Main {
    public static void main(String[] args) {
        Answer answer = new Answer("Answer 1");
        Answer answer1 = new Answer("Answer 2");
        Answer[] answers = new Answer[4];
        answers[0] = answer;
        answers[1] = answer1;
        answers[2] = new Answer("Answer3");
        Question question = new Question("Question 1", 1, answers, answer1);
        System.out.println(question);
        System.out.println(answer);
    }
}
