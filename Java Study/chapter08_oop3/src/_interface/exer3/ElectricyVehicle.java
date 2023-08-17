package _interface.exer3;

/**
 * ClassName: ElectricyVehicle
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/15 15:20
 * @Version 1.0
 */
public class ElectricyVehicle extends Vehicle implements IPower{
    public ElectricyVehicle() {
    }

    public ElectricyVehicle(String brand, String color) {
        super(brand, color);
    }


    @Override
    public void run() {
        System.out.println("电动车通过电机驱动行驶");
    }

    @Override
    public void power() {
        System.out.println("电动车使用电力提供动力");
    }
}
