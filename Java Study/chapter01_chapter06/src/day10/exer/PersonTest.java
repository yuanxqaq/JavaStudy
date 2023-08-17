package day10.exer;

/**
 * @author ZhangJiaYuan
 * @create 2023-03-23-11:54
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
//        p1.setAge(12);
        System.out.println("年龄为：" + p1.getAge());

        Person p2 = new Person("Tom",21);
        System.out.println("姓名为：" + p2.getName() + ",年龄为：" + p2.getAge());
    }
}
