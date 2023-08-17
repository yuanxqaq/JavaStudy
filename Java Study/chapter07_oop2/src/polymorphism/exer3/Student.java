package polymorphism.exer3;

/**
 * ClassName: Student
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/8 19:04
 * @Version 1.0
 */
public class Student extends Person {
    protected String school="pku";
    public String getInfo() {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school;
    }
}