package annotation.junit;

import org.junit.Test;

/**
 *
 * @author shkstart
 * @create 14:34
 */
public class JUnitTest {

    int num = 10;
    @Test
    public void test1(){
        System.out.println("hello");
    }

    @Test
    public void test2(){
        System.out.println("hello1");
        System.out.println("number = "+ num);
        method();
    }
    @Test
    public void test(){
        
    }

    public void method(){
        System.out.println("method()...");
    }

}
