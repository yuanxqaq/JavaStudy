package _super;

/**
 * ClassName: StudentTest
 * Package: _super
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/3/26 9:16
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.eat();
        s1.sleep();

        s1.show();
        s1.show1();
        s1.show2();
        System.out.println(s1.name);

        //*****************

        System.out.println();
        Student s2 = new Student();
        System.out.println("***********");

        Student s3 = new Student("Tom",12);


    }
}
