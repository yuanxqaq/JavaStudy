package day08.exer;

public class Person {
    String name;
    int age;
    int sex;
    //1为男，0为女

    public void study(){
        System.out.println("studying");
    }

    public void showAge(){
        System.out.println("age:"+age);
    }

    public int addAge(int i){
        age += i;
        return age;
    }
}
