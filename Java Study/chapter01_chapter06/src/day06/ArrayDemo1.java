package day06;

import java.util.Scanner;

public class ArrayDemo1 {

    public static void main(String[] args) {
        //1.使用scanner读取学生个数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生人数：");
        int number = scanner.nextInt();
        //2.创建数组，存储学生成绩，动态初始化
        int[] scores = new int[number];
        //3.给数组中的元素赋值
        System.out.println("请输入"+ number+"个学生成绩");
        int maxScore = 0;
        for (int i = 0;i < scores.length;i++){
            scores[i] = scanner.nextInt();
            if (maxScore < scores[i]){
                maxScore = scores[i];
            }
        }
        //4.获取数组中的元素的最大值：最高分
        //int maxScore = 0;
//        for (int i = 0;i < scores.length;i++){
//            if (maxScore < scores[i]){
//                maxScore = scores[i];
//            }
//        }
        //5.根据每个学生成绩与最高分的差值，得到每个学生的登记，并输出登记和成绩
        char level;
        for (int i = 0;i < scores.length;i++){
            if (maxScore - scores[i] <= 10){
                level = 'A';
            }else if (maxScore - scores[i] <= 20){
                level = 'B';
            }else if(maxScore - scores[i] <= 30){
                level = 'C';
            }else{
                level = 'D';
            }

            System.out.println("student "+ i + " score is "+scores[i] +
                    ",grade is "+ level);
        }
    }
}
