package _override.test2;

import _override.test1.Order;

/**
 * ClassName: SubOrder
 * Package: _override.test2
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/3/25 9:12
 * @Version 1.0
 */
public class SubOrder extends Order {
    public void method(){
        orderProtected = 1;
        orderPublic = 1;

        methodProtected();
        methodPublic();


        //不能访问
//        orderPrivate = 1;
//        orderDefault =1;

//        methodPrivate();
//        methodDefault();
    }
}
