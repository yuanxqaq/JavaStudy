package create.exer1;

/**
 * ClassName: PrintNumberTest
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/20 16:04
 * @Version 1.0
 */
class EvenNumberPrint extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + "-->" + i);
            }
        }
    }
}

class OddNumberPrint extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}
public class PrintNumberTest {
    public static void main(String[] args) {
        //方式1
//        EvenNumberPrint t1 = new EvenNumberPrint();
//        OddNumberPrint t2 = new OddNumberPrint();
//        t1.start();
//        t2.start();
        //方式2
//        new Thread(){
//            public void run() {
//                for (int i = 0; i <= 100; i++) {
//                    if (i % 2 != 0){
//                        System.out.println(Thread.currentThread().getName() + "-->" + i);
//                    }
//                }
//            }
//        }.start();
//
//        new Thread(){
//            public void run() {
//                for (int i = 0; i <= 100; i++) {
//                    if (i % 2 == 0){
//                        System.out.println(Thread.currentThread().getName() + ":" + i);
//                    }
//                }
//            }
//        }.start();

        //方式3:使用实现Runnable接口的方式：提供了Runnable接口匿名实现类的匿名对象
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    if (i % 2 == 0){
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    if (i % 2 != 0){
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }).start();
    }
}
