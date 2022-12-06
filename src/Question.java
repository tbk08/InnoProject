import java.util.Arrays;

public class Question {
    private final String text;
    private final int level;

    private final Answer[] answer;

    private final Answer trueAnswer;

    public String getText() {
        return text;
    }

    public int getLevel() {
        return level;
    }

    public Answer[] getAnswer() {
        return answer;
    }

    public Answer getTrueAnswer() {
        return trueAnswer;
    }

    Question(String text, int level, Answer[] answer, Answer trueAnswer) {
        this.text = text;
        this.level = level;
        this.answer = answer;
        this.trueAnswer = trueAnswer;
    }

    @Override
    public String toString() {
        return text;
    }


}
