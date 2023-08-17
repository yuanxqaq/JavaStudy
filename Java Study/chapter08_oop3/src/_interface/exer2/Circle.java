package _interface.exer2;

/**
 * ClassName: Circle
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/15 15:00
 * @Version 1.0
 */
public class Circle {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
