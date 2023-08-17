package _super.exer1;

/**
 * ClassName: Kids
 * Package: _extends.exer1
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/3/24 23:18
 * @Version 1.0
 */
public class Kids extends ManKind {
    private int yearsOld;

    public Kids() {

    }

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public Kids(int sex, int salary, int yearsOld) {
        setSex(sex);
        setSalary(salary);
        this.yearsOld = yearsOld;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge() {
        System.out.println("I am " + yearsOld + "years old");
    }

    public void employed() {
        super.employed();
        System.out.println("Kids should study and no job");

    }
}
