package _abstract.exer1;

/**
 * ClassName: Circle
 * Package: polymorphism.exer1
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/7 14:55
 * @Version 1.0
 */
public class Circle extends GeometricObject{

    private double radius;//半径

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return Math.PI * radius * radius;
    }
}
