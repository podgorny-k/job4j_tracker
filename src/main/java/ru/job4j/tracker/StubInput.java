package ru.job4j.tracker;

public class StubInput implements Input {
    private String[] answers;
    private int position;

    public StubInput(String[] answers) {
        this.answers = answers;
    }

    @Override
    public String askStr(String queston) {
        return answers[position++];
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }
}