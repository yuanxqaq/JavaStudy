package _enum.exer1;

/**
 * ClassName: BnakTest1
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/16 15:35
 * @Version 1.0
 */
public class BnakTest1 {
    public static void main(String[] args) {
        System.out.println(GirlFriend.XIAOLI);
    }
}


//jdk5.0之前
class Bank1{
    private Bank1(){}
    public static final Bank1 instance = new Bank1();
}

enum Bank2{
    CPB;
}
//jdk5.0使用enum
enum GirlFriend{
    XIAOLI(18);

    private final int age;

    private GirlFriend(int age) {
        this.age = age;
    }
}
