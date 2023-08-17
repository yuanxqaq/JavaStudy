package _interface.exer1;

/**
 * ClassName: EatableTest
 * Description:
 *      创建Eatable数组，存储各国人对象，并遍历数组，调用eat()方法
 * @Author ZhangJiaYuan
 * @Create 2023/4/15 14:57
 * @Version 1.0
 */
public class EatableTest {
    public static void main(String[] args) {
        Eatable[] eatables = new Eatable[3];
        eatables[0] = new Chinese();
        eatables[1] = new American();
        eatables[2] = new Indian();

        for (int i = 0; i < eatables.length; i++) {
            eatables[i].eat();
        }
    }
}
