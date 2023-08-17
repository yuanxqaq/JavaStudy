package _abstract;

/**
 * ClassName: Person
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/14 20:18
 * @Version 1.0
 */
public abstract class Person extends Creature{//抽象类
    String name;
    int age;

    public Person(){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract void eat();//抽象方法

    public abstract void sleep();

}
