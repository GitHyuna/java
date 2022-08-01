package Hyuna.hellospring.java;


public class _08_char_String {
    public static void main(String[] args) {
        //문자 리터럴과 문자열 리터럴
        //문자 리터럴 : 문자 하나를 작은 따옴표('')로 감싼 것, char타입을 사용
        //문자열 리터럴 : 여러 문자(문자열)를 큰 따옴표("")로 감싼 것, String타입을 사용
        
        String str = "";    // 내용 없는 빈 문자열 허용
//        char ch1 = '';  // 내용 없는 빈 문자 불허 - error
        char ch2 = ' ';     // 공백 문자(blank)로 변수 ch2 초기화 가능

        //문자열 리터럴은 덧셈 연산자를 이용하여 결합할 수 있다.
        String name = "Ja" + "va";
        String programming = name + 8.0;
        System.out.println("name : " + name);
        System.out.println("programming : " + programming);
    }
}
