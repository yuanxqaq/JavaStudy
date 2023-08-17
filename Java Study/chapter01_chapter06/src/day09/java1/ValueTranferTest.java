package day09.java1;

/**
 * @author ZhangJiaYuan
 * @create 2023-03-22-18:55
 */

/*
* 关于变量的赋值
*
* 如果变量是基本数据类型，此时赋值的是变量所保存的数据值。
* 如果变量是引用数据类型，此时赋值保存的是数据的地址值。
* */
public class ValueTranferTest {
    public static void main(String[] args) {

        System.out.println("************基本数据类型***************");

        int m = 10;
        int n = m;

        System.out.println("m = " + m + ", n = " + n);

        n = 20;

        System.out.println("m = " + m + ", n = " + n);

        System.out.println("*********引用数据类型*************");

        Order o1 = new Order();
        o1.orderId = 1001;

        Order o2 = o1;//赋值以后，两个地址值都相同，都指向了
        System.out.println("o1.orderId = "+o1.orderId+",o2.orderId = "+o2.orderId);

        o2.orderId = 1002;
        System.out.println("o1.orderId = "+o1.orderId+",o2.orderId = "+o2.orderId);


    }
}

class Order{
    int orderId;
}
