package object.equals;

import java.io.File;
import java.util.Objects;

/**
 * ClassName: UserTest
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/9 22:24
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User("tom",12);
        User u2 = new User("tom",12);

        System.out.println(u1.equals(u2)); //false

        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        File file1 = new File("d:\\abc.txt");
        File file2 = new File("d:\\abc.txt");
        System.out.println(file1.equals(file2)); //true


        //数组上使用equals()
        int[] arr = new int[10];
        System.out.println(arr.equals(new int[10]));
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

    //重写equals()

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj instanceof User){
//            User user = (User) obj;
//            return this.age == user.age && this.name.equals(user.name);
//        }
//
//        return false;
//    }

    //IDEA自动实现


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        return Objects.equals(name, user.name);
    }
}