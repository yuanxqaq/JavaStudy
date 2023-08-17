package object.tostring.exer;

/**
 * ClassName: CircleTest
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/10 15:19
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.3);
        Circle c2 = new Circle("red",2.0,3.4);

        System.out.println("颜色是否相等？" + c1.getColor().equals(c2.getColor()));
        System.out.println("半径是否相等？" +c1.equals(c2));

        System.out.println(c1);
        System.out.println(c1.toString());


    }
}
