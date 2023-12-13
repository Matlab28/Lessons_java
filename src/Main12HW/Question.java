package Main12HW;

import java.util.Arrays;

public class Question {
    private int level;
    public String text;
    public String[] answers;
    public int indexOfCorrectAnswer;


    public Question(String text, String[] answers, int indexOfCorrectAnswer) {
        this.text = text;
        this.answers = answers;
        this.indexOfCorrectAnswer = indexOfCorrectAnswer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "text='" + text + '\'' +
                ", answers=" + Arrays.toString(answers) +
                ", indexOfCorrectAnswer=" + indexOfCorrectAnswer +
                '}';
    }
}
