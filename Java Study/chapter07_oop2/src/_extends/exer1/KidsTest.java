package _extends.exer1;

/**
 * ClassName: KidsTest
 * Package: _extends.exer1
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/3/24 23:21
 * @Version 1.0
 */
public class KidsTest {

    public static void main(String[] args) {
        Kids kid = new Kids();
        kid.setSex(1);
        kid.setSalary(100);
        kid.setYearsOld(12);

        //来自父类中声明的方法
        kid.employed();
        kid.manOrWoman();

        //Kids类自己声明的方法
        kid.printAge();


    }
}
