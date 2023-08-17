package project.team.domain;

/**
 * ClassName: Architect
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/18 11:38
 * @Version 1.0
 */
public class Architect extends Designer {
    private int stock;//股票数量

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String toString() {
        return getDetails() + "\t架构师\t" + getStatus() + "\t" + getBonus() +
                "\t" + getStock() + "\t" + getEquipment().getDescription();
    }
}
