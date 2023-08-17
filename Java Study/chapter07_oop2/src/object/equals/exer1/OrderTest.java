package object.equals.exer1;

/**
 * ClassName: OrderTest
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/10 14:15
 * @Version 1.0
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order1 = new Order(1001,"orderAA");
        Order order2 = new Order(1001,"orderAA");
        System.out.println(order1.equals(order2));

        Order order3 = new Order(1003,new String("orderBB"));
        Order order4 = new Order(1003,new String("orderBB"));
        System.out.println(order3.equals(order4));


        String str1 = "AA";
        String str2 = "AA";
        System.out.println(str1 == str2);//true

    }
}
