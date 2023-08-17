package _override.test1;

/**
 * ClassName: Order
 * Package: _extends.test1
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/3/25 9:00
 * @Version 1.0
 */
public class Order {
    private int orderPrivate;
    int orderDefault;
    protected int orderProtected;
    public int orderPublic;

    private void methodPrivate(){}
    void methodDefault(){}
    protected void methodProtected(){}
    public void methodPublic(){}

    //类内部
    public void show(){
        orderPrivate = 1;
        orderDefault =1;
        orderProtected = 1;
        orderPublic = 1;

        methodPrivate();
        methodDefault();
        methodProtected();
        methodPublic();
    }
}
