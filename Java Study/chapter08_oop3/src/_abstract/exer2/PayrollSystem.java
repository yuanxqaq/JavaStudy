package _abstract.exer2;

import java.util.Scanner;

/**
 * ClassName: PayrollSystem
 * Description:
     *  定义PayrollSystem类，创建Employee变量数组并初始化，该数组存放各类雇员对象的引用。
     * 利用循环结构遍历数组元素，输出各个对象的类型,name,number,birthday,以及该对象生日。
     * 当键盘输入本月月份值时，如果本月是某个Employee对象的生日，还要输出增加工资信息。
 * @Author ZhangJiaYuan
 * @Create 2023/4/15 12:42
 * @Version 1.0
 */
public class PayrollSystem {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Employee[] emps = new Employee[2];
        emps[0] = new SalariedEmployee("小亮",1001,
                new MyDate(1992,12,21),18000);
        emps[1] = new HourlyEmployee("小鹏",1002,
                new MyDate(1993,11,4),100,240);


        System.out.println("请输入当前的月份:");
        int month = scan.nextInt();
        for (int i = 0; i < emps.length; i++) {
            System.out.println(emps[i].toString());
            System.out.println("工资为：" + emps[i].earnings());
            if (month == emps[i].getBirthday().getMonth()){
                System.out.println("生日快乐！加薪100");
            }
        }
        scan.close();

    }
}
