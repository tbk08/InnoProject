public class Answer {
    private final String text;
    Answer(String text){
        this.text = text;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "text='" + text + '\'' +
                '}';
    }
}
