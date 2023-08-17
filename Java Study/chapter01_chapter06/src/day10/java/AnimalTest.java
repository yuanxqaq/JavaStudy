package day10.java;

/**
 * @author ZhangJiaYuan
 * @create 2023-03-23-11:17
 *
 * 面向对象的特征一：封装与隐藏
 * 一、问题的引入
 * 二、封装性的体现
 *  我们将类的属性私有化(private)，同时，
 *  提供公共(public)的方法来获取(getxxx)和设置(setxxx)
 *  此属性的值
 * 三、封装性的体现，需要权限修饰符来配合
 * 1.Java的四种权限
 * 2.四种权限可以用来修饰类及类的内部结构、属性、方法、构造器、内部类
 *              修饰类的话，只能使用：缺省、public
 *
 * 总结封装性：Java提供了四种修饰符来四u是类的内部结构，体现类的内部结构
 *          在被调用时的可见性的方法
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "大黄";
//        a.age = 1;
//        a.legs = 4;

        a.show();
//        a.setLegs(-6);
        a.setLegs(6);
        a.show();
    }

}


class Animal{
    String name;
    private int age;
    private int legs;

    public void setLegs(int l){
        if(l >=0 && l%2==0){
            legs = l;
        }else {
            legs = 0;
            //抛出一个异常
        }
    }

    //对属性的获取
    public int getLegs(){
        return legs;
    }


    public int getAge(){
        return age;
    }

    public void setAge(){

    }

    public void eat(){
        System.out.println("动物进食");
    }
    public void show(){
        System.out.println("name = "  + name + ",age = " +
                age + ",legs = " + legs);
    }
}
