package string;

import org.junit.Test;

/**
 * ClassName: StringDemo1
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/23 14:22
 * @Version 1.0
 */
public class StringDemo1 {
    @Test
    public void test1(){
        String s1 = "hello";
        String s2 = "hello";

        String s3 = new String("hello");
        String s4 = new String("hello");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s3 == s2);

        System.out.println(s1.equals(s2));
    }

    /*
    * String s = new String("hello");的内存解析?或
    *
    * String s = new String("hello");在内存中创建了几个对象？ 2个
    *
    * */
    @Test
    public void test2(){
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "Tom";
        p2.name = "Tom";

        p1.name = "Jerry";

        System.out.println(p2.name);
    }
    /*
    * 测试String的连接符 ： +
    * */
    @Test
    public void test3(){
        String s1 = "hello";

    }
}

class  Person{
    String name;
}
