package date.exer2;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * ClassName: Exer02
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/24 18:26
 * @Version 1.0
 */
public class Exer02 {
    @Test
    public void test1(){
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println("你的生日是：" + date);

        calendar.add(Calendar.DAY_OF_YEAR,100);
        Date newdate = calendar.getTime();
        System.out.println("一百天后是：" + newdate);
    }

    @Test
    public void test2(){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("你的生日是：" + localDateTime);

        LocalDateTime localDateTime1 = localDateTime.plusDays(100);
        System.out.println("一百天后是：" + localDateTime1);
    }
}
