package polymorphism.exer1;

/**
 * ClassName: GeometricObject
 * Package: polymorphism.exer1
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/6 10:52
 * @Version 1.0
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    protected GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double findArea(){
        return 0.0;
    }
}
