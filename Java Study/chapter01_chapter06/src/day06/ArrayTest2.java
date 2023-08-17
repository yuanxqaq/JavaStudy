package day06;

public class ArrayTest2 {
    public static void main(String[] args) {
        //二维数组的声明和初始化
        int[][] arr = new int[][]{{1,2,3},{2,3,4}};//静态初始化
        //动态初始化
        String[][] arr1 = new String[3][2];
        String[][] arr2 = new String[2][];

        int[][] arr3 = {{1,2},{2,3,3}}; // 类型推断

        //2.如何调用数组的指定位置的元素
        System.out.println(arr[0][1]); //2
        System.out.println(arr1[1][1]); //null

        arr2[1] = new String[4]; //外层一个[]，内层两个[]
        System.out.println(arr2[1][0]);

        //3.获取数组的长度
        System.out.println(arr3.length);
        System.out.println(arr3[0].length);
        System.out.println(arr3[1].length);

        //4.如何遍历二维数组
        for (int i = 0;i < arr3.length;i++){
            for (int j = 0;j < arr3[i].length;j ++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
