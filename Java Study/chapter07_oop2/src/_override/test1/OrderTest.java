package _override.test1;

/**
 * ClassName: OrderTest
 * Package: _override.test1
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/3/25 9:07
 * @Version 1.0
 */
public class OrderTest {
    public void method1(){
        Order order = new Order();

        //通过对象调用Order类中声明的属性、方法
        order.orderDefault = 1;
        order.orderProtected = 1;
        order.orderPublic = 1;

        order.methodDefault();
        order.methodProtected();
        order.methodPublic();


        //受封装性的影响，不能调用
//        order.methodPrivate();
//        order.orderPrivate =1 ;

    }
}
