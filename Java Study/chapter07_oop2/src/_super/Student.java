package _super;

/**
 * @author ZhangJiaYuan
 * @create 2023-03-24-21:02
 */
public class Student extends Person {
    String school;
    int id = 1002;//学号


    //测试super调用父类的构造器
    public Student() {
        super();
        System.out.println("Student()...");
    }

    public Student(String name,int age){
        super(name,age);
    }


    public void study() {
        System.out.println("学习");
    }

    public void eat() {
        System.out.println("学生多吃有营养的食物");
    }

    public void sleep() {
        System.out.println("学生保证每天不低于10小时的睡眠");
    }

    public void show(){
        eat();
        this.eat();

        super.eat();
    }

    public void show1(){
        doSport();
        this.doSport();
    }

    public void show2(){
        System.out.println(id); //就近
        System.out.println(this.id);

        System.out.println(super.id);
    }

    public void show3(){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }


}
