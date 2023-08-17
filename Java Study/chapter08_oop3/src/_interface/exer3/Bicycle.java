package _interface.exer3;

/**
 * ClassName: Bicycle
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/15 15:18
 * @Version 1.0
 */
public class Bicycle extends Vehicle{
    public Bicycle() {
    }

    public Bicycle(String brand, String color) {
        super(brand, color);
    }

    public void Bicycle(String brand, String color){

    }
    @Override
    public void run() {
        System.out.println("自行车通过人力脚蹬行驶");
    }
}
