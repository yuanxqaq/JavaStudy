package list.exer1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ClassName: StudentTest
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/5/1 13:34
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List list = new ArrayList();
        System.out.println("请录入学生的信息");
        while (true) {
            System.out.println("1：继续录入，0:结束录入");
            int selection = scanner.nextInt();
            if (selection == 0){
                break;
            }
            System.out.print("请输入学生姓名：");
            String name = scanner.next();
            System.out.print("请输入学生年龄：");
            int age = scanner.nextInt();

            Student s = new Student(name,age);
            list.add(s);
        }

        System.out.println("遍历学生信息：");
        for (Object obj : list){
            System.out.println(obj.toString());
        }
        scanner.close();

    }
}
