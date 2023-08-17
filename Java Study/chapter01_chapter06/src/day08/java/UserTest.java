package day08.java;
/*
* 类中属性的使用
*
* 属性(成员变量) vs 局部变量
*
* 1.相同点
*   1.1定义变量的格式：数据类型 变量名= 变量值
*   1.2先声明后使用
*   1.3变量都有其对应的作用域
*
* 2.不同点
*
*   2.1在类中声明的位置不同
*   属性：直接定义在类的一对{}内
*   局部变量：声明在方法内，方法形参、代码块内、构造器形参、构造器内部的变量
*
*   2.2关于权限修饰符的不同
*   属性：可以在声明属性时，指明其权限，使用权限修饰符
*        常用权限修饰符：private、public、缺省、protected --->封装性
*   局部变量：不可以使用修饰符
*
*   2.3默认初始化值的问题
*   属性:类的属性，根据其类型，都有默认初始化值
*   局部变量：没有默认初始化值
*           意味着，在使用局部变量之前，一定要显性赋值
*           特别的，形参在调用的时候，进行赋值
*   2.4在内存中加载的位置
*       属性：加载到堆空间中(非static)
*       局部变量：加载到栈空间
*
* */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.name);
        System.out.println(u1.age);
        System.out.println(u1.isMale);
        u1.talk("日语");
        u1.eat();
    }
}

class User{
    //属性
    String name;
    int age;
    boolean isMale;

    //方法

    public void talk(String language){//language：形参，也是局部变量
        System.out.println("我们使用"+language+"进行交流");
    }
    public void eat(){
        String food = "烙饼";//局部变量
        System.out.println("北方人喜欢吃：" + food);
    }
}