package day02;
/*
基本数据类型之间的运算规则(不包括boolean)
1.自动类型提升
  当容量小的数据类型与容量大的数据类型的变量做运算时，结果自动提升为容量大的数据类型
  byte、char、short --> int --> long --> float --> double

  特别的:当byte、char、short三种类型的变量做运算时，结果为int型

2.强制类型转换
  见VariableTest3.java

*/
public class VariableTest2 {
    public static void main(String[] args) {
        byte b1 = 2;
        int i1 = 129;
        //编译不通过
        //byte b2 = b1 + i1
        int i2 = b1 + i1;
        long l1 = b1 + i1;
        System.out.println(i2);

        float f = b1 + i1;
        System.out.println(f);

        short s1 = 123;
        double d1 = s1;
        System.out.println(d1); //123.0

        //*************************
        char c1 = 'a';
        int i3 = 10;
        int i4 = c1 + i3;
        System.out.println(i4);

        short s2 = 10;
        //char c2 = c1 + s2;

        byte b2 = 10;
        //char c2 = c1 + s2;

    }
}
