package reflectapply.apply1;


import org.junit.Test;
import reflectapply.data.Person;

/**
 * ClassName: NewInstanceTest
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/5/5 15:57
 * @Version 1.0
 */
public class NewInstanceTest {
    @Test
    public void test1() throws InstantiationException, IllegalAccessException {
        Class clazz = Person.class;

        Person per = (Person) clazz.newInstance();

        System.out.println(per);
    }
}
