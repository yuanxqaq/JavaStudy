package main;

/**
 * ClassName: MainTest
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/11 23:03
 * @Version 1.0
 */
public class MainTest {
    public static void main(String[] args) {//程序的入口
        String arr[] = new String[]{"AA","BB","CC"};
        Main.main(arr);

    }
}

class Main{
    public static void main(String[] args) {//看作普通的方法
        System.out.println("Main的main()的调用");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
