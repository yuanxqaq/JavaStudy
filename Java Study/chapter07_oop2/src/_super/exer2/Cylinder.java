package _super.exer2;

/**
 * ClassName: Cylinder
 * Package: _extends.exer2
 * Description: 圆柱类
 *
 * @Author ZhangJiaYuan
 * @Create 2023/3/25 8:45
 * @Version 1.0
 */
public class Cylinder extends Circle {
    private double length;//高

    public Cylinder(){
        this.length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //求圆柱的体积
    public double findVolume(){
//        return Math.PI * getRadius() * getRadius() * getRadius();

        return super.findArea() * getLength();
    }

    //求表面积
    public double findArea(){
        return Math.PI * getRadius() * getRadius() * 2 +
                2 * Math.PI * getRadius() * getLength();
    }
}
