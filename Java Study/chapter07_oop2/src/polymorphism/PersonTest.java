package polymorphism;

/**
 * ClassName: PersonTest
 * Package: polymorphism
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/3/30 11:15
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {

        //多态性之前的场景
        Person p1 = new Person();
        Man m1 = new Man();

        //多态性：
        Person p2 = new Man();

        /*
        多态性的应用：虚拟方法调用

        在多态的场景下，调用方法时。
            编译时，认为是左边声明的父类的类型的方法(即被重写的方法)
            执行时，实际执行的时子类重写父类的方法。
        简称为：编译看左边，运行看右边
         */
        p2.eat();
        p2.walk();

        //测试属性是否满足多态性？ 不满足
        System.out.println(p2.id);





    }
}
