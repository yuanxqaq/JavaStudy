package _super.exer2;

/**
 * ClassName: Circle
 * Package: _extends.exer2
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/3/25 8:43
 * @Version 1.0
 */
public class Circle {
    private double radius;

    public Circle(){
        this.radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //求圆的面积
    public double findArea(){
        return Math.PI * radius * radius;
    }
}
