package communication;

/**
 * ClassName: ProducerConsumerTest
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/22 19:12
 * @Version 1.0
 */

class Clerk{
    private int prodectNum = 0;
    public synchronized void addProduct(){
        if (prodectNum > 20){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {

            prodectNum++;
            System.out.println(Thread.currentThread().getName() + "生产了第" + prodectNum + "个产品");
            //唤醒
            notifyAll();
        }

    }
    public synchronized void minusProduct(){
        if (prodectNum <= 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {

            System.out.println(Thread.currentThread().getName() + "消费了第" + prodectNum + "个产品");
            prodectNum--;
            //唤醒
            notifyAll();
        }

    }

}
class Producer extends Thread{
    private Clerk clerk;

    public Producer(Clerk clerk){
        this.clerk = clerk;
    }
    @Override
    public void run() {
        while (true){
            System.out.println("生产者开始生产产品...");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.addProduct();
        }
    }
}
class Consumer extends Thread{
    private Clerk clerk;

    public Consumer(Clerk clerk){
        this.clerk = clerk;
    }
    @Override
    public void run() {
        while (true){
            System.out.println("消费者开始消费产品...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.minusProduct();
        }
    }
}
public class ProducerConsumerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer pro1 = new Producer(clerk);
        Consumer con1 = new Consumer(clerk);
        Consumer con2 = new Consumer(clerk);
        pro1.setName("生产者1");
        con1.setName("消费者1");
        con2.setName("消费者2");
        pro1.start();
        con1.start();
        con2.start();
    }

}
