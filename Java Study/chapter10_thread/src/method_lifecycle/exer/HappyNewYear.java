package method_lifecycle.exer;

/**
 * ClassName: HappyNewYear
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/22 13:57
 * @Version 1.0
 */
public class HappyNewYear {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i > 0){
                System.out.println(i);
            }else {
                System.out.println("Happy New Year!");
            }
        }
    }
}
