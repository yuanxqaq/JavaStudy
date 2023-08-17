package polymorphism.exer4;
/**
 * ClassName: Woman
 * Description:
 *      在Woman类中，包含
 *      ①重写上面的方法
 *      ②增加 public void makeup()：打印化妆
 * @Author ZhangJiaYuan
 * @Create 2023/4/8 19:30
 * @Version 1.0
 */
public class Woman extends Person {
    public void eat(){
        System.out.println("女人小口吃饭");
    }

    public void toilet(){
        System.out.println("女人上女厕所");
    }

    public void makeup(){
        System.out.println("女人厕后化妆");
    }
}
