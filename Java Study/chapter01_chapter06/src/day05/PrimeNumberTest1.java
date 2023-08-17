package day05;

//质数：素数，只能被1和它本身整除的自然数 -->从2开始，到这个数-1结束为止，都不能被这个数整除
//最小的质数是：2
//对质数输出问题的优化

public class PrimeNumberTest1 {

    public static void main(String[] args) {

        boolean isFlag = true; //标识i是否被j除尽

        long start = System.currentTimeMillis();

        for (int i = 2;i <= 100000;i++){ //遍历100以内的自然数

            for (int j = 2;j < i;j++){ //j：被i去除

                if (i % j == 0){ //i被j除尽
                    isFlag = false;
                    break; //优化1：只对本身非质数的自然数是有效的
                }
            }
            if (isFlag == true){
                System.out.println(i);
            }
            //重置isFlag
            isFlag = true;
        }
        long end = System.currentTimeMillis();
        System.out.println("所花费的时间为:"+ (end - start));
        //15707  优化1：1960
    }
}
