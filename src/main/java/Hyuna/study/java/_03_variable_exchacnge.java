package Hyuna.study.java;

public class _03_variable_exchacnge {
    public static void main(String[] args) {
        //두 변수의 값 교환하기
        int x = 20;
        int y = 200;


        int temp = x; // temp = 20
        x = y;
        y = temp;

        System.out.println("x = "+ x);
        System.out.println("y = "+ y);
    }
}
