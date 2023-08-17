package inner;

/**
 * ClassName: OuterClassTest
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/16 13:01
 * @Version 1.0
 */
public class OuterClassTest {
    public static void main(String[] args) {
        //1.创建Person的静态的成员内部类的实例
        Person.Dog dog = new Person.Dog();

        //2.创建Person的非静态的成员内部类的实例
        Person p1 = new Person();
        Person.Bird bird = p1.new Bird();
        bird.eat();
        bird.show("黄鹂");
        bird.show1();

    }
}

class Person{//外部类

    String name = "Tom";
    int age = 1;

    //静态的成员内部类
    static class Dog{
        public void eat(){
            System.out.println("狗吃骨头");
        }
    }
    //非静态的成员内部类
    class  Bird{
        String name = "啄木鸟";
        public void eat(){
            System.out.println("鸟觅食");
        }

        public void show(String name){
            System.out.println("age = " + age);//省略了Person.this
            System.out.println("name = " + name);
            System.out.println("name = "+ this.name);
            System.out.println("name = "+ Person.this.name);
        }
        public void show1(){
            eat();
            this.eat();
            Person.this.eat();
        }
    }

    public void eat(){
        System.out.println("人吃饭");
    }

    public void method(){
        //局部内部类
        class InnerClass1{

        }
    }
    public Person(){
        //局部内部类
        class InnerClass1{

        }
    }
}
