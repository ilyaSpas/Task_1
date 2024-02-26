package org.example;

public class Main {
    public static void main(String[] args) {
        MyStringBuilder myStringBuilder = new MyStringBuilder();

        myStringBuilder.append("Hello");
        System.out.println(myStringBuilder.getValue());

        myStringBuilder.append(" ");
        System.out.println(myStringBuilder.getValue());

        myStringBuilder.append("world");
        System.out.println(myStringBuilder.getValue());

        myStringBuilder.append("!");
        System.out.println(myStringBuilder.getValue());

        myStringBuilder.append("54325");
        System.out.println(myStringBuilder.getValue());

        myStringBuilder.undo();
        System.out.println(myStringBuilder.getValue());

        myStringBuilder.undo();
        System.out.println(myStringBuilder.getValue());

        myStringBuilder.undo();
        System.out.println(myStringBuilder.getValue());

        myStringBuilder.undo();
        System.out.println(myStringBuilder.getValue());
    }
}