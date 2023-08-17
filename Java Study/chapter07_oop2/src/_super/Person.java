package _super;

/**
 * @author ZhangJiaYuan
 * @create 2023-03-24-21:01
 */
public class Person {
    String name;
    private int age;
    int id = 1001;//身份证号

    public Person() {
        System.out.println("Person() ...");
    }



    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  void doSport(){
        System.out.println("人运动");
    }
}
