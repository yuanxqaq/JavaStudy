package polymorphism.exer3;

/**
 * ClassName: Person
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/8 19:02
 * @Version 1.0
 */
public class Person {
    protected String name="person";
    protected int age=50;
    public String getInfo() {
        return "Name: "+ name + "\n" +"age: "+ age;
    }
}
