package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(divider(1,2));
        System.out.println(divider(1, 0));
    }

    public static int divider(int a, int b) {

        if (a == 0 || b == 0) throw new ArithmeticException();
        return a / b;
    }

    public static int adder(int x, int y) {
        return x + y;
    }

    // Figure out how to do a todo
    // Todo
    // TODO: add the alt to img tags

}



