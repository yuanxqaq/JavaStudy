package annotation;

import java.util.Date;

/**
 * ClassName: AnnotationTest
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/16 21:24
 * @Version 1.0
 */
public class AnnotationTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.walk();

        Date date = new Date();
        System.out.println(date);

        Person p2 = new Person();
        Person p3 = new Person("Tom");
        System.out.println(p3);

        @SuppressWarnings("unused") int num = 10;
    }
}

@MyAnnotation(value = "class")
class Person{
    String name;
    int age;

    @MyAnnotation
    public Person() {
    }



    @Deprecated
    public Person(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("人吃饭");
    }

    public void walk(){
        System.out.println("人走路");
    }
}

class Student extends Person{
    @Override
    public void eat() {
        System.out.println("学生吃饭");
    }

    @Override
    public void walk() {
        System.out.println("学生走路");
    }
}