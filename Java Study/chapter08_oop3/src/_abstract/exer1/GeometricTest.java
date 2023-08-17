package _abstract.exer1;

/**
 * ClassName: GeometricTest
 * Package: polymorphism.exer1
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/7 20:58
 * @Version 1.0
 */
public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();
        Circle c1 = new Circle("red",1.0,2.3);
        Circle c2 = new Circle("red",1.0,3.3);
        test.displayGeometricObject(c1);
        test.displayGeometricObject(c2);

        boolean isEquals = test.equalsArea(c1,c2);
        if (isEquals){
            System.out.println("面积相等");
        }else {
            System.out.println("面积不相等");
        }

        //使用匿名对象
        test.displayGeometricObject(new MyRectangle("blue",1.0,2.3,4));
    }
    /**
     * 比较两个几何图形的面积是否相等
     * @param g1
     * @param g2
     * @return true:面积相等  false:面积不相等
     */
    public boolean equalsArea(GeometricObject g1,GeometricObject g2){
        return g1.findArea() == g2.findArea();
    }

    /**
     * 显示几何图形的面积
     * @param g
     */
    public void displayGeometricObject(GeometricObject g){
        System.out.println("几何图形的面积为：" + g.findArea()); //动态绑定
    }
}
