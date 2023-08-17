package _override.test2;

import _override.test1.Order;

/**
 * ClassName: OrderTest
 * Package: _override.test2
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/3/25 9:15
 * @Version 1.0
 */
public class OrderTest {
    public void method(){
        Order order = new Order();

        order.orderPublic =1;
        order.methodPublic();


        //不能访问
//        order.orderPrivate = 1;
//        order.orderDefault =1;
//        order.orderProtected = 1;
//
//        order.methodPrivate();
//        order.methodDefault();
//        order.methodProtected();


    }
}
