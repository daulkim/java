package io.study;

public class Greeter {

    public static void main(String[] args) {

        /*
         1. interface 만들기 or 이미 있다면 있는 interface 사용
         2. 람다와 같은 형태의 메서드 선언
         3. interface를 타입으로 쓰기
         => interface에는 단 하나의 메서드만 있어야한다. 여러개 있으면 컴파일시 에러
        */
        Greeting myLambdaFunction = () -> System.out.print("Hello World");
        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.print("Hello World");
            }
        };
    }
}


