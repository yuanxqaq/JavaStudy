package polymorphism.exer4;

/**
 * ClassName: Man
 * Description:
 *      在Man类中，包含
 *      ①重写上面的方法
 *      ②增加  public void smoke()：打印抽烟
 * @Author ZhangJiaYuan
 * @Create 2023/4/8 19:30
 * @Version 1.0
 */


public class Man extends Person {
    public void eat(){
        System.out.println("男人大口的吃饭");
    }

    public void toilet(){
        System.out.println("男人去男厕所");
    }
    public void smoke(){
        System.out.println("男人厕后去抽烟");
    }
}
