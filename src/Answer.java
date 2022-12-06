public class Answer {
    private final String text;

    Answer(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return text;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Answer) {
            System.out.println("This an answer");
            String s = ((Answer) obj).getText();
            return this.text.equals(s);
        }
        return false;
    }
}
