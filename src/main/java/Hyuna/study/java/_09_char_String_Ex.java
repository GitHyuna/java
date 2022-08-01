package Hyuna.study.java;


public class _09_char_String_Ex {
    public static void main(String[] args) {
        //문자 리터럴과 문자열 리터럴
        String name = "Ja"+"va";
        String str = name + 8.0;

        System.out.println(name);
        System.out.println(str);

        System.out.println(7 + " ");
        System.out.println(" " + 7);
        System.out.println(7 + ""); // 기본형 타입(int)의 값을 문자열로 변환할 때 빈 문자열("")을 더해주면 된다.
        System.out.println("" + 7);
        System.out.println("" + "");

        //덧셈 연산자는 순서대로 수행된다.
        System.out.println(7 + 7 + ""); //14
        System.out.println("" + 7 + 7); //77


    }
}
