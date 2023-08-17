package day09.java2;

/**
 * @author ZhangJiaYuan
 * @create 2023-03-22-23:48
 *
 * 递归方法的使用(了解)
 */
public class RecursionTest {

    public static void main(String[] args) {
        RecursionTest test = new RecursionTest();
        int sum = test.getSum(100);
        System.out.println(sum);
        int value = test.f(10);
        System.out.println(value);

    }

    public int getSum(int n){
        if (n==1){
            return 1;
        }else {
            return n + getSum(n - 1);
        }
    }

    //n的阶乘
    public int getSum1(int n){
        if (n==1){
            return 1;
        }else {
            return n * getSum1(n - 1);
        }
    }

    //已知一个数列f(0)=1,f(1)=4,f(n+2)=2*f(n+1)+f(n)
    public int f(int n){
        if (n==0){
            return 1;
        }else if (n==1){
            return 4;
        }else {
            return 2*f(n-1) + f(n -2);
        }
    }
}
