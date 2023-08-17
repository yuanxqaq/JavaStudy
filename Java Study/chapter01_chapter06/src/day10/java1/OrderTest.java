package day10.java1;

import day10.java.Order;
//Cannot be accessed from outside package

/**
 * @author ZhangJiaYuan
 * @create 2023-03-23-11:49
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        //order.orderDefault = 1;
        order.orderPublic = 2;
//        order.orderPrivate = 3;
        //'orderPrivate' has private access in 'day10.java.Order'


        //除了order所属的包，default就不行了
        //order.methodDefault();
        order.methodPublic();
    }
}
