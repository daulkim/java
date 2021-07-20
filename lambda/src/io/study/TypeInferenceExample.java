package io.study;

public class TypeInferenceExample {
    public static void main(String[] args) {
        // interface에 파라미터의 타입이 String으로 명시되어있으므로 생략 가능
        // 파라미터가 하나일 때 괄호 생략 가능
//        StringLengthLambda myLambda = s -> s.length();
//        System.out.print(myLambda.getLength("Hello Lambda"));
        printLambda(s -> s.length());

    }

    public static void printLambda(StringLengthLambda l){
        System.out.print(l.getLength("Hello Lambda"));
    }

    interface StringLengthLambda {
        int getLength(String s);
    }
}
