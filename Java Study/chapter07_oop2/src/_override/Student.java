package _override;

/**
 * @author ZhangJiaYuan
 * @create 2023-03-24-21:02
 */
public class Student extends Person {

    String major;

    public Student() {
    }

    public Student(String name, int age, String major) {
        this.name = name;
//        this.age = age;
        setAge(age);
        this.major = major;
    }


    public void study(){
        System.out.println("学习");
    }

    public void eat(){
        System.out.println("学生应该多吃有营养的食物");
    }


}
