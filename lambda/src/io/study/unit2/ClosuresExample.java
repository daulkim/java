package io.study.unit2;

public class ClosuresExample {
    public static void main(String[] args) {
        int a = 10;
        // java 8 부터 final 생략 가능 바뀌면 안됨!
        int b = 20;
        doProcess(a, i -> System.out.println(i + b));
    }

    public static void doProcess(int i, Process p) {
        p.process(i);
    }
}

interface Process{
    void process(int i);
}
