package threadsafemore.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName: WindowTest1
 * Description:
 *      使用继承Thread的方式：实现卖票
 * @Author ZhangJiaYuan
 * @Create 2023/4/21 20:14
 * @Version 1.0
 */
class Window extends Thread{
    static int ticket = 100;
    //1.创建lock实例，需要确保多个线程共用同一个lock实例！需要将此对象声明为static final
    private static final ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            try {
                //2.执行lock方法，锁定对共享资源的调用
                lock.lock();
                if (ticket > 0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket);
                    ticket--;
                }else {
                    break;
                }
            } finally {
                //3.unlock的调用，释放对资源的锁定
                lock.unlock();
            }

        }
    }
}
public class LockTest {
    public static void main(String[] args) {
        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}
