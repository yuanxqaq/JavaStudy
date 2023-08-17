package _super.exer1;

/**
 * ClassName: ManKind
 * Package: _extends.exer1
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/3/24 23:06
 * @Version 1.0
 */
public class ManKind {
    private int sex;
    private int salary;

    public ManKind() {
    }

    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void manOrWoman(){
        if (sex == 1){
            System.out.println("Man");
        } else if (sex == 0) {
            System.out.println("Woman");
        }
    }

    public void employed(){
        if (salary == 0){
            System.out.println("no job!");
        } else if (salary != 0) {
            System.out.println("job!");
        }
    }
}
