package day09.java;

public class ArraysUtilTest {

    public static void main(String[] args) {

        ArraysUtil util = new ArraysUtil();
        int[] arr = new int[]{31,12,45,23,65,-12,-34,21,45};

        int max = util.getMax(arr);
        System.out.println("最大值为:" + max);

        System.out.println("排序前：");
        util.print(arr);

        System.out.println("排序后：");
        util.sort(arr);
        util.print(arr);

        System.out.println("查找：");
        int index = util.getIndex(arr,65);
        if (index >= 0){
            System.out.println("找到了，索引地址为：" + index);
        }else {
            System.out.println("没有找到哦");
        }

        //util.reverse(arr);
    }
}
