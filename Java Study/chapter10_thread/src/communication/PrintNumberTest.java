package communication;

/**
 * ClassName: PrintNumberTest
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/22 18:55
 * @Version 1.0
 */

class PrintNumber implements Runnable{
    private int number = 1;
    Object obj = new Object();

    @Override
    public void run() {
        while (true){
//            synchronized (this) {
            synchronized (obj) {
                if (number <= 100){
                    obj.notify();//一旦执行此方法，就会唤醒被wait()的线程中优先级最高的那一个线程。
                            //如果被wait()的多个线程的优先级相同，随机唤醒一个）。被唤醒的线程从被wait的位置继续执行
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;

                    try {
                        obj.wait();//线程一旦执行此方法，就进入等待状态，同时，会释放对同步监视器的调用
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    break;
                }
            }
        }
    }
}
public class PrintNumberTest {
    public static void main(String[] args) {
        PrintNumber p = new PrintNumber();
        Thread t1 = new Thread(p,"线程1");
        Thread t2 = new Thread(p,"线程2");

        t1.start();
        t2.start();

    }
}
