package threadsafe.threadsafe;

/**
 * ClassName: WindowTest1
 * Description:
 *      使用继承Thread的方式：实现卖票
 *      使用同步代码块解决卖票问题
 * @Author ZhangJiaYuan
 * @Create 2023/4/21 20:14
 * @Version 1.0
 */
class Window extends Thread{
    static int ticket = 100;
    static Object obj = new Object();
    @Override
    public void run() {
        while (true){
//            synchronized (this) {//this: 此时代表w1,w2,w3
//            synchronized (obj) {//obj:使用static修饰后，就能保证其唯一性
            synchronized (Window.class) {//结构： Class clz = Window.class
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
            }
        }
    }
}
public class WindowTest {
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
