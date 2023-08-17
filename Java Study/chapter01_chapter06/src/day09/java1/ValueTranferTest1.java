package day09.java1;

/**
 * @author ZhangJiaYuan
 * @create 2023-03-22-19:09
 *
 *
 *  方法的形参的传递机制，值传递
 *
 *  2.值传递机制：
 *  如果参数是基本数据类型，此时实参赋给形参的是实参真实存储的数据值
 *  如果参数是引用数据类型，此时赋值保存的是数据的地址值。
 *
 */
public class ValueTranferTest1 {

    public static void main(String[] args) {
        //交换两个变量的值的操作

        int m = 10;
        int n = 20;

        System.out.println("m = " + m + ", n = " + n);

//        int temp = m;
//        m = n;
//        n = temp;

        ValueTranferTest1 test = new ValueTranferTest1();
        test.swap(m,n);

        System.out.println("m = " + m + ", n = " + n);

    }

    public void swap(int i,int j){
        int temp = i;
        i = j;
        j = temp;
    }
}
