package day03;

public class SetValueTest {
    public static void main(String[] args) {
        //赋值符号： =
        int i1 = 10;
        int j1 = 10;

        int i2,j2;
        //连续赋值
        i2 = j2 = 10;

        int i3 = 10,j3 = 20;

        //*******************

        int num1 = 10;
        num1 += 2; // num1 = num1 + 2
        System.out.println(num1);

        int num2 = 12;
        num2 %= 5;//num2 = num2 % 5;
        System.out.println(num2);

        short s1 = 10;
        s1 += 2;//不会改变变量本身的数据类型
        System.out.println(s1);


    }
}
