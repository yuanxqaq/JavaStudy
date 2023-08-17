package _interface.exer2;

/**
 * ClassName: ComparableCircle
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/15 15:00
 * @Version 1.0
 */
public class ComparableCircle extends Circle implements CompareObject{
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    //根据对象的半径的大小，比较对象的大小
    @Override
    public int compareTo(Object o) {
        if (this == o){
            return 0;
        }
        if (o instanceof ComparableCircle){
            ComparableCircle c = (ComparableCircle)o;

            //写法1
//            if (this.getRadius() > c.getRadius()){
//                return 1;
//            } else if (this.getRadius() < c.getRadius()) {
//                return -1;
//            }else {
//                return 0;
//            }

            //写法2
            return Double.compare(this.getRadius(),c.getRadius());
        }else {
            return 2;
        }
    }
}
