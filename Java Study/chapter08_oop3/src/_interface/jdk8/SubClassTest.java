package _interface.jdk8;

/**
 * ClassName: SubClassTest
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/15 23:01
 * @Version 1.0
 */
public class SubClassTest {
    public static void main(String[] args) {
        //知识点1：接口中声明的静态方法只能被接口来调用，不能使用其实现类进行调用

        CompareA.method1();

        //知识点2：接口中声明的默认方法可以被实现类继承，实现类在没有重写此方法的情况下，
        //默认调用接口中声明的默认方法。如果实现类重写了此方法，则调用的是自己重写的
        SubClass s1 = new SubClass();
        s1.method2();

        //知识点3：类实现了两个接口，而两个接口中定义了同名同参数的默认方法，则实现类在没有
        //重写此两个接口默认方法的情况下，会报错。 --》接口冲突

        //要求，
        s1.method3();

        //知识点3：子类继承了父类并实现了接口，父类和接口声明了同名同参数的方法。默认情况下，子类（或实现类
        //在没有重写此方法的情况下，调用的是父类中的方法 -->类优先原则
        s1.method4();
//        SubClass.method1();
    }
}
