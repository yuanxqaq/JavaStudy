package _enum.apply;

/**
 * ClassName: EmployeeTest
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/16 15:33
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Tom",21,Status.BUSY);
        System.out.println(employee);
    }
}
