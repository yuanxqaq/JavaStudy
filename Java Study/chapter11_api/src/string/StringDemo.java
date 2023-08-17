package string;

import org.junit.Test;

/**
 * ClassName: StringDemo
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/23 14:06
 * @Version 1.0
 */
public class StringDemo {
    @Test
    public void test1(){
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);
    }

    /*
     * String的不可变性
     * ①当对字符串常量重新赋值时，需要重新指定一个字符串常量的位置进行赋值，不能在原有的位置修改
     *② 当对现有的字符串进行拼接操作时，需要新建一个字符空间，不能在原有的位置修改
     * ③当调用字符串的replace()替换现有的某个字符时，需要重新开辟空间保存修改以后的字符串，不能在原有的位置修改
     * */
    @Test
    public void test2(){
        String s1 = "hello";
        String s2 = "hello";

        s2 = "hi";
        System.out.println(s1);

    }

    @Test
    public void test3(){
        String s1 = "hello";
        String s2 = "hello";

        s2 += "world";
        System.out.println(s1);
        System.out.println(s2);
    }
    
    @Test
    public void test4(){
        String s1 = "hello";
        String s2 = "hello";

        String s3 = s2.replace('l', 'w');

        System.out.println(s1);//hello
        System.out.println(s2);//hello
        System.out.println(s3);//hewwo
    }
}