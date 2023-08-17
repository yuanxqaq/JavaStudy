package polymorphism.exer3;

/**
 * ClassName: Graduate
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/8 19:04
 * @Version 1.0
 */
public class Graduate extends Student{
    public String major="IT";
    public String getInfo()
    {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school+"\nmajor:"+major;
    }
}