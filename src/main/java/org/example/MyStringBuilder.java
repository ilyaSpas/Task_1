package org.example;

public class MyStringBuilder {

    private char[] value;

    private int size;

    private History history = new History();

    public MyStringBuilder() {
        value = new char[4];
        size = 0;
    }

    public char[] getValue() {
        return value;
    }

    public void append(String string) {
        createSnapshot();
        increaseSize(size + string.length());
        string.getChars(0, string.length(), value, size);
        size += string.length();
    }

    private void increaseSize(int newSize) {
        char[] newValue = new char[newSize];
        System.arraycopy(value, 0, newValue, 0, size);
        value = newValue;
    }

    private void createSnapshot() {
        history.addSnapshot(new Snapshot(value));
    }

    public void undo() {
        this.value = history.getSnapshot().getValue();
    }
}
