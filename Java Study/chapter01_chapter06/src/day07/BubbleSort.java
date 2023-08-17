package day07;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{32,13,23,54,76,12,56,-123,34,-43};

        //冒泡排序
        for (int i = 0; i < arr.length - 1;i++){
            for (int j = 0;j < arr.length - 1 - i;j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.print(arr[i]+"\t");
        }
        
    }
}
