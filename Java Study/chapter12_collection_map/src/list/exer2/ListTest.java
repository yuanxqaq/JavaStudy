package list.exer2;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ClassName: listTest
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/5/1 15:36
 * @Version 1.0
 */
public class ListTest {
    public static void main(String[] args) {
        //(1) 创建集合，集合存放随机生成的30个小写字母
        ArrayList list = new ArrayList();
        for (int i = 0; i < 30; i++) {
            //'a' - 'z' [97,122]
            list.add((char)(Math.random() * (122 - 97 + 1) + 97) + "");
        }
        System.out.println(list);

        int aCount = listTest(list,"a");
        int bCount = listTest(list,"b");
        int cCount = listTest(list,"c");
        int xCount = listTest(list,"x");

        System.out.println("a:" + aCount);
        System.out.println("b:" + bCount);
        System.out.println("c:" + cCount);
        System.out.println("x:" + xCount);
    }
    //(2) 用listTest统计，a、b、c、x元素的出现次数
    public static int listTest(Collection list, String s){
        int count = 0;
        for (Object obj : list){
            if (s.equals(obj)){
                count++;
            }
        }
        return count;
    }
}

