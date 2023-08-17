package _interface.exer2;

/**
 * ClassName: InterfaceTest
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/15 15:00
 * @Version 1.0
 */
public class InterfaceTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(2.3);
        ComparableCircle c2 = new ComparableCircle(5.3);
        int compareValue = c1.compareTo(c2);
        if (compareValue > 0){
            System.out.println("C1对象大");
        }else if (compareValue < 0){
            System.out.println("C2对象大");
        }else if (compareValue == 0){
            System.out.println("一样大");
        }

    }
}
