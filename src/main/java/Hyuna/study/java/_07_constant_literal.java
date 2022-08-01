package Hyuna.study.java;


public class _07_constant_literal {
    public static void main(String[] args) {
        //상수와 리터럴

        //상수 : 한 번 값을 저장하면 다른 값으로 변경할 수 없다.(값을 저장할 수 있는 공간)
        //      변수의 타입 앞에 키워드 final을 붙여주면 된다.

        final int MAX_SPEED = 10;   //상수 MAX_SPEED를 선언 & 초기화
        //상수는 반드시 선언과 동시에 초기화 해야한다.


        //리터럴 : 그 자체로 값을 의미하는 것

        //리터럴의 타입과 접미사
        //리터럴에 접미사가 붙는 타입은 3가지 뿐이다(long, float, double)
        //double은 생략 가능
        //변수의 타입은 저장될 '값의 타입'에 의해 결정되므로 리터럴에 타입이 없다면 변수의 타입도 필요없을 것이다.

        //정수형와 실수형에는 여러 타입이 존재하므로 리터럴에 접미사를 붙여서 타입을 구분한다.
//        Long a = 12344897260984;    // 리터럴(12344897260984)에 따로 타입을 주지 않아서 error
        Long a = 12344897260984L;   //리터럴(12344897260984)에 Long 타입의 접미사 L(l)을 붙여주면 error가 나지 않는다.

//        float pi1 = 3.14;   // 리터럴(3.14)에 따로 타입을 주지 않아서 error
        float pi2 = 3.14f;
        double rate1 = 1.618d;
        double rate2 = 1.618;   // double이 기본형이라 d를 붙이지 않아도 error가 나지는 않는다.

        System.out.println("rate1 : "+rate1);
        System.out.println("rate2 : "+rate2);


        //타입의 불일치
        //타입이 달라도 저장범위가 넓은 타입에 좁은 타입의 값을 저장하는 것은 허용된다.
        int i = 'A';    // 문자 'A'의 유니코드인 65가 변수 i에 저장된다.
        System.out.println("i : " + i);     // i : 65
        long l = 123;   //허용
        double d = 3.14F;   //허용
    }
}
