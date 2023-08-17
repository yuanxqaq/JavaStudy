package block.exer;

/**
 * ClassName: UserTest
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/14 14:27
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.getInfo());

        User u2 = new User("Tom","654321");
        System.out.println(u2.getInfo());

        User1 u3 = new User1();
        System.out.println(u3.getInfo());
    }
}
