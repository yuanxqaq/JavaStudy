package day10.java1;

/**
 * @author ZhangJiaYuan
 * @create 2023-03-23-14:00
 *
 * 总结：属性赋值的先后顺序
 *  1.默认初始化
 *  2.显式初始化
 *  3.构造器中初始化
 *
 *  4.通过”对象.方法“或者”对象.属性“的方式赋值
 *
 *  以上操作的先后顺序：1 -> 2 -> 3 -> 4
 */
public class UserTest {

    public static void main(String[] args) {
        User u = new User();
        System.out.println(u.age);

        User u1 = new User(2);

        u1.setAge(3);
        System.out.println(u1.age);
    }
}

class User{
    String  name;
    int age = 1;

    public User(){

    }

    public User(int a){
        age = a;
    }

    public void setAge(int a){
        age = a;
    }

}