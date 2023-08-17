package object.equals.apply;

/**
 * ClassName: CustomerTest
 * Description:
 *    判断两个Customer对象是否equals()，除了Customer类需要
 *    重写equals()之外，其内部的类类型的属性所在的类，也需要重写
 *    equals()
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/10 11:00
 * @Version 1.0
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Tom",12,new Account(2000));
        Customer cust2 = new Customer("Tom",12,new Account(2000));

        System.out.println(cust1.equals(cust2));
    }
}
