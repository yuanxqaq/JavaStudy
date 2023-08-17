package _interface.jdk8;

/**
 * ClassName: SubClass
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/15 23:00
 * @Version 1.0
 */
public class SubClass extends SupClass implements CompareA,CompareB{
    @Override
    public void method2() {
        System.out.println("Subclass:上海");
    }
    public void method3(){
        System.out.println("Subclass:广州");
    }
    public void method4(){
        System.out.println("Subclass:深圳");
    }
    public void method(){
        method4();//调用自己类中的方法
        super.method4();//调用父类中的方法

        method3();//调用自己类中的方法
        CompareA.super.method3();//调用接口CompareA中的默认方法
        CompareB.super.method3();//调用接口CompareB中的默认方法

    }
}
