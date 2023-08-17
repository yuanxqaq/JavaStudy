package day07;
/*
* java.util.Arrays
* */

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {

        //boolean equals //判断两个数组是否相等
        int[] arr1 = new int[]{1,2,3,4};
        int[] arr2 = new int[]{1,3,2,4};
        boolean isEquals = Arrays.equals(arr1,arr2);
        System.out.println(isEquals);

        //String toString(int[] a):输出数组信息
        System.out.println(Arrays.toString(arr1));

        //void file:将指定的值填充到数组之中
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));

        //void sort：对数组进行排序
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        //int binarySearch :二分查找
        int[] arr3 = new int[]{-122,-23,0,2,11,23,87,121,231,342,432};
        int index = Arrays.binarySearch(arr3,121);
        if (index >= 0){
            System.out.println(index);
        }else {
            System.out.println("没有找到");
        }

    }

}
