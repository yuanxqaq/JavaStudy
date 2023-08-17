package create.thread;

/**
 * ClassName: EvenNumberTest
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/20 15:52
 * @Version 1.0
 */

//创建一个继承于Thread类的子类
class PrintNumber extends Thread{
    //重写 Thread类的run()

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" +i);
            }
        }
    }
}

public class EvenNumberTest {
    public static void main(String[] args) {
        //创建当前Thread的子类的对象
        PrintNumber t1 = new PrintNumber();
        PrintNumber t2 = new PrintNumber();
        //通过对象调用start()
        t1.start();
        /*
        * 问题1：能否使用t1.run()替换t1.start()的调用，实现分线程的创建和调用？不能！
        * */
        /*
        * 问题2：在提供一个分线程，用于100以内偶数的遍历
        *
        * 注意：不能让已经start的线程，再次执行start
        * */
        t2.start();

        //main()所在的线程执行的操作
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i + "********");
            }
        }
    }
}

