package day10.java;

/**
 * @author ZhangJiaYuan
 * @create 2023-03-23-11:45
 */
public class Order {

    private int orderPrivate;
    int orderDefault;
    public int orderPublic;

    private void methodPrivate(){
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }

    void methodDefault(){
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }

    public void methodPublic(){
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }
}
