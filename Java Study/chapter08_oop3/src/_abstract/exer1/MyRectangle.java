package _abstract.exer1;

/**
 * ClassName: MyRectangle
 * Package: polymorphism.exer1
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/7 14:57
 * @Version 1.0
 */
public class MyRectangle extends GeometricObject{

    private double width;
    private double height;

    public MyRectangle(String color, double weight, double width, double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {
        return width * height;
    }
}
