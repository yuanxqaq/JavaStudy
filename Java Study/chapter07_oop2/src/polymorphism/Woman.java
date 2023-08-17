package polymorphism;

/**
 * ClassName: Woman
 * Package: polymorphism
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/3/30 11:13
 * @Version 1.0
 */
public class Woman extends Person{
    boolean isBeauty;

    public void eat(){
        System.out.println("女人应该少吃，减肥");
    }

    public void walk(){
        System.out.println("女人应该窈窕的走路");
    }

    public void goShopping(){
        System.out.println("女人喜欢逛街...");
    }



}
