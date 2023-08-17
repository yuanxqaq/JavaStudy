package day10.exer;

/**
 * @author ZhangJiaYuan
 * @create 2023-03-23-11:54
 */
public class Person {

    private int age;
    private String name;

    public Person(){
        age = 18;
    }

    public Person(String n,int a){
        name = n;
        age = a;
    }

    public void setAge(int a) {
        if(a < 0 || a > 130){
            throw new RuntimeException("传入的数据非法");
        }else {
            age = a;
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String n){
        name = n;
    }
}
