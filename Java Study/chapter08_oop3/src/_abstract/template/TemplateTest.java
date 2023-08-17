package _abstract.template;

/**
 * ClassName: TemplateTest
 * Description:
 *  抽象应用案例：模板方法的设计模式
 * @Author ZhangJiaYuan
 * @Create 2023/4/15 12:25
 * @Version 1.0
 */
public class TemplateTest {
    public static void main(String[] args) {
        PrintPrimeNumber p = new PrintPrimeNumber();
        p.spendTime();
    }
}

abstract class Template{
    public void spendTime(){
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为：" + (end - start));
    }

    public abstract void code();
}

class PrintPrimeNumber extends Template{

    @Override
    public void code() {
        boolean isFlag = true;
        for (int i = 2; i <= 100000; i++) {
            for (int j = 2;j<= Math.sqrt(i);j++){
                if (i % j == 0){
                    isFlag = false;
                    break;
                }
            }
            if (isFlag){
                System.out.println(i);
            }
        }
    }
}
