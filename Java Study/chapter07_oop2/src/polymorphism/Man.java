package polymorphism;

/**
 * ClassName: Man
 * Package: polymorphism
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/3/30 11:11
 * @Version 1.0
 */
public class Man extends Person{
    boolean isSmoking;
    int id = 1002;

    public void eat(){
        System.out.println("男人多吃肉，长肌肉");
    }

    public void walk(){
        System.out.println("男人笔挺的走路");
    }

    public void earnMoney(){
        System.out.println("男人挣钱养家");
    }
}
