package object.tostring;

import java.io.File;
import java.util.Date;

/**
 * ClassName: ToStringTest
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/10 14:29
 * @Version 1.0
 */
public class ToStringTest {
    public static void main(String[] args) {
        User u1 = new User("Tom",12);
        System.out.println(u1.toString()); //object.tostring.User@4eec7777
        System.out.println(u1);//object.tostring.User@4eec7777

        String s1 = new String("hello");
        System.out.println(s1.toString());

        File file = new File("d:\\abc.txt");
        System.out.println(file.toString());

        Date date = new Date();
        System.out.println(date.toString());

    }
}

class User{
    String name;
    int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //手动实现
//    @Override
//    public String toString() {
//        return "User{ name = "+ name + ", age = " + age+ "}";
//
//    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}