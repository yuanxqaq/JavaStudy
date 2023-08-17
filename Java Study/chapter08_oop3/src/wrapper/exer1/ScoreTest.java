package wrapper.exer1;

import java.util.Scanner;
import java.util.Vector;

/**
 * ClassName: ScoreTest
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/16 23:07
 * @Version 1.0
 */
public class ScoreTest {
    public static void main(String[] args) {
        //1.创建Vector对象：Vector v =new Vector();
        Vector v = new Vector();
        Scanner scanner = new Scanner(System.in);

        int MAXSCORE = 0;


        //2.从键盘获取多个学生成绩，存放到v中(以负数代表输入结束)
        while (true){
            System.out.print("请输入学生成绩(以负数代表输入结束)：");
            int intScore = scanner.nextInt();
            if (intScore < 0){
                break;
            }

            //装箱
//            Integer score = Integer.valueOf(intScore);
//            v.addElement(score);

            //自动装箱
            v.addElement(intScore);

            //3.获取学生成绩的最大值
            if (MAXSCORE < intScore){
                MAXSCORE = intScore;
            }
        }
        System.out.println("最高分为：" + MAXSCORE);
        //4.依次获取V中的每个学生成绩，与最高分比较，获取学生等级，并输出
        for (int i = 0; i < v.size(); i++) {
            Object objScore = v.elementAt(i);
            int score = (Integer)objScore;
            char grade;
            if (MAXSCORE - score <= 10){
                grade = 'A';
            }else if (MAXSCORE - score <= 20){
                grade = 'B';
            }else if (MAXSCORE - score <= 30){
                grade = 'C';
            }else{
                grade = 'D';
            }

            System.out.println("Student " + i + "Score is " + score + "grade is " + grade);
        }
        scanner.close();
    }
}
