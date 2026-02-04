package com.ms.corejava.genericprogramming;

public class GenericClass {
    public static void main(String[] args) {
        Pair<String> first = new Pair<String>("love", "you");
        Pair<Integer> second = new Pair<Integer>(56, 01);
        System.out.println("====first object====\n" + first);
        System.out.println("====second object====\n" + second);
    }
}

class Pair<T> {
    private T first;
    private T sec;

    public Pair() {
        first = null;
        sec = null;
    }

    public Pair(T f, T s) {
        first = f;
        sec = s;
    }

    @Override
    public String toString() {
        return ("first: " + first + "\nsecond: " + sec);
    }
}
