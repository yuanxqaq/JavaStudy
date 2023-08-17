package day06;

/*数组元素的默认初始化值
     >数组元素是整型：0
     >数组元素是浮点型：0.0
     >数组元素是char型：0或'\u0000',而非'0'
     >数组元素是boolean型：false

     >数组元素是引用数据类型:null
*/
public class ArrayTest1 {

    public static void main(String[] args) {
        int[] arr = new int[4];
        for (int i = 0; i < arr.length;i ++){
            System.out.println(arr[i]);
        }
        short[] arr1 = new short[4];
        for (int i = 0; i < arr1.length;i ++){
            System.out.println(arr1[i]);
        }
        float[] arr2 = new float[4];
        for (int i = 0; i < arr2.length;i ++){
            System.out.println(arr2[i]);
        }
        char[] arr3 = new char[4];
        for (int i = 0; i < arr3.length;i ++){
            System.out.println(arr3[i]);
        }
        boolean[] arr4 = new boolean[4];
        for (int i = 0; i < arr4.length;i ++){
            System.out.println(arr4[i]);
        }
        String[] arr5 = new String[4];
        for (int i = 0; i < arr5.length;i ++){
            System.out.println(arr5[i]);
        }
    }

}
