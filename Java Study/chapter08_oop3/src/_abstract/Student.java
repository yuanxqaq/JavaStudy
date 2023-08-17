package _abstract;

/**
 * ClassName: Student
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/14 20:23
 * @Version 1.0
 */
public class Student extends Person {
    String school;

    public Student() {
    }

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public void eat(){
        System.out.println("学生多吃有营养的食物");
    }

    public void sleep(){
        System.out.println("学生要保持充足的睡眠");
    }

    @Override
    public void breath() {
        System.out.println("学生应该多呼吸新鲜空气");
    }
}
