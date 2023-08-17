package day10.exer1;

/**
 * @author ZhangJiaYuan
 * @create 2023-03-23-13:52
 */
public class TriAngle {
    private double base;//底边长
    private double height;//高

    public TriAngle(){

    }

    public TriAngle(double b, double h){
        base = b;
        height = h;
    }


    public void setBase(double b) {
        base = b;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double getHeight() {
        return height;
    }
}
