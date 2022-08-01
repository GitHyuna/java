package Hyuna.study.java;

import java.util.Date;

public class _05_variable_type {
    public static void main(String[] args) {
        //변수 타입
        //자료형(data type)
        //기본형 : 변수는 실제 값(data)을 저장(연산 가능)
        //논리형(boolean), 문자형(char), 정수형(byte, short, int, long), 실수형(float, double)

        //참조형 : 어떤 값이 저장되어 있는 주소(memory address)를 저장(연산 불가)


        //참조변수(reference type) 선언 방법
        //클래스이름 변수이름;   //변수의 타입의 기본형이 아닌 것들은 모든 참조변수이다.

        Date today = new Date();    //Date 객체를 생성해서, 그 주소를 today에 저장

        //new : 객체를 생성하는 연산자
        //new의 결과는 생성된 객체의 주소이다.
    }
}
