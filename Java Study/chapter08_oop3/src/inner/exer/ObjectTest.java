package inner.exer;

/**
 * ClassName: ObjectTest
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/16 14:12
 * @Version 1.0
 */
public class ObjectTest {
    public static void main(String[] args) {
//        SubObject subObject = new SubObject();
//        subObject.test();

        //提供一个继承于Object的匿名子类的对象
        new Object(){
            public void test(){
                System.out.println("尚硅谷");
            }
        }.test();

    }
}

class SubObject extends Object{
    public void test(){
        System.out.println("尚硅谷");
    }
}
