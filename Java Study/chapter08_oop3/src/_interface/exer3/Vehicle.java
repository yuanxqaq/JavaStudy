package _interface.exer3;

/**
 * ClassName: Vehicle
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/15 15:16
 * @Version 1.0
 */
public abstract class Vehicle {
    private String brand;//品牌
    private String color;


    public Vehicle() {
    }

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract void run();
}
