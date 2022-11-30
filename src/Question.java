import java.util.Arrays;

public class Question {
    private final String text;
    private final int level;

    private final Answer[] answer;

    private final Answer trueAnswer;

    Question(String text, int level, Answer[] answer, Answer trueAnswer){
        this.text = text;
        this.level = level;
        this.answer = answer;
        this.trueAnswer = trueAnswer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "text='" + text + '\'' +
                ", level=" + level +
                ", answer=" + Arrays.toString(answer) +
                ", trueAnswer=" + "someAnswer" +
                '}';
    }
}
