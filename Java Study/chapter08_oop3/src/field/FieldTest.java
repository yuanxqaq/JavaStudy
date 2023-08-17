package field;

/**
 * ClassName: FieldTest
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/14 14:39
 * @Version 1.0
 */
public class FieldTest {
    public static void main(String[] args) {
        Order o1 = new Order();
        System.out.println(o1.orderId);

    }
}

class Order{

    {
        orderId = 2;
    }
    int orderId = 1;

    public Order(){
        orderId = 3;
    }
    public void eat(){
        sleep();
    }
    public void sleep(){

    }
}