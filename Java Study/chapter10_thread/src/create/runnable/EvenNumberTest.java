package create.runnable;

/**
 * ClassName: EvenNumberTest
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/21 18:26
 * @Version 1.0
 */
//创建一个实现Runnable接口的类
class EvenNumberPrint implements Runnable{
    //实现接口中的run()

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i + "********");
            }
        }
    }
}
public class EvenNumberTest {
    public static void main(String[] args) {
        EvenNumberPrint p = new EvenNumberPrint();
        Thread t1 = new Thread(p);
        t1.start();

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i + "********");
            }
        }
    }
}
