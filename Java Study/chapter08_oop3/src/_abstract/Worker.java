package _abstract;

/**
 * ClassName: Worker
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/15 12:07
 * @Version 1.0
 */
public abstract class Worker extends Person{
    @Override
    public void eat() {
        System.out.println("工人很辛苦，多吃");
    }

}
