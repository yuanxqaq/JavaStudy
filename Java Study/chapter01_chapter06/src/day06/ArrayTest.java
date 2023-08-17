package day06;

public class ArrayTest {

    public static void main(String[] args) {

        //1.一维数组的声明和初始化
        //1.1静态初始化
        int[] ids = new int[]{1001,1002,1003,1004};
        //1.2动态初始化
        String[] names = new String[4];

        //数组一旦初始化完成，其长度就确定了

        //2.如何调用数组的指定位置的元素：通过角标的方式调用
        names[0] = "张三";
        names[1] = "李四";
        names[2] = "王五";
        names[3] = "赵六";

        //3.如何获取数组长度
        System.out.println(names.length);
        System.out.println(ids.length);

        //4.如何遍历数组
        for (int i = 0; i < names.length;i++){
            System.out.println(names[i]);
        }
    }
}
