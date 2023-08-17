package day10.java2;

/**
 * @author ZhangJiaYuan
 * @create 2023-03-23-15:15
 *
 * this关键字的作用
 *  1。this可以用来修饰：属性、方法、构造器
 *  2.this修饰属性和方法
 *      this理解为：当前对象
 *
 *      2.1在类的方法中，我们可以使用"this.属性"或"this.方法"的方式，调用当前
 *      对象属性或方法。但是通常情况下，我们都选择忽略”this.“。特殊情况下，如果方法
 *      的形参和属性同名时，我们一定要加上this.
 *  3.this调用构造器
 *      3.1我们在类的构造器中，可以显式的使用”this(形参列表)“方式，调用本类中指定的其他构造器
 *      3.2构造器中不能通过”this(形参列表)“方式调用自己
 *      3.3如果一个类中有n个构造器，则最多有n-1构造器使用了”this(形参列表)“
 *      3.4规定：”this(形参列表)“必须声明在当前构造器的首行
 *      3.5构造器内部：最多只能声明一个”this(形参列表)“，用来调用其他构造器
 *
 *
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(1);
        System.out.println(p1.getAge());

        Person p2 = new Person("Jerry",20);
    }

}

class Person{

    private String name;
    private int age;

    public Person(){
        //this.eat();
        String info = "Person初始化时，需要考虑如下的1，2，3，4...";
        System.out.println(info);
    }

    public Person(String name){
        this();
        this.name = name;
    }

    public Person(int age){
        this();
        this.age = age;
    }

    public Person(String name,int age){
        this(age);
        this.name = name;
        //this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void eat(){
        System.out.println("人吃饭");
    }
    public void study(){
        System.out.println("人学习");
    }
}
