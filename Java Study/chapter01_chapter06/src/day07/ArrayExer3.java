package day07;

public class ArrayExer3 {
    public static void main(String[] args) {
        int[] array1,array2;
        array1 = new int[]{2,3,5,7,11,13,17,19};
        for (int i = 0; i < array1.length;i++){
            System.out.print(array1[i] + "\t");
        }
        System.out.println();
        array2 = new int[array1.length];
        for (int i = 0; i < array2.length;i++){
            array2[i] = array1[i];
            if (i % 2 == 0){
                array2[i] = i;
            }
        }
        //打印出array1
        for (int i = 0; i < array1.length;i++){
            System.out.print(array1[i] + "\t");
        }
        System.out.println();
    }
}
