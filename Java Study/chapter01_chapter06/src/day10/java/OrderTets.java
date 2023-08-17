package day10.java;

/**
 * @author ZhangJiaYuan
 * @create 2023-03-23-11:45
 */
public class OrderTets {
    public static void main(String[] args) {
        Order order = new Order();
        order.orderDefault = 1;
        order.orderPublic = 2;
//        order.orderPrivate = 3;
        //'orderPrivate' has private access in 'day10.java.Order'


        order.methodDefault();
        order.methodPublic();
    }
}
