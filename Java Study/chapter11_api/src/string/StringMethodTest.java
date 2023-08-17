package string;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * ClassName: StringMethodTest
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/23 15:06
 * @Version 1.0
 */
public class StringMethodTest {
    @Test
    public void test1(){
        String s1 = new String();
        String s2 = new String("");
        String s3 = new String(new char[]{'a','b','c','d'});

        System.out.println(s3);
    }
    @Test
    public void test2(){
        int num = 10;
        String s1 = num + "";
        String s2 = String.valueOf(num);

        String s3 = "123";
        int i1 = Integer.parseInt(s3);
    }
    
    @Test
    public void test3(){
        String str = "hello";
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //char --> String
        String str1 = new String(arr);
        System.out.println(str1);
    }

    @Test
    public void test4() throws UnsupportedEncodingException {
        String str = new String("abc中国");
        byte[] arr = str.getBytes();//使用默认的字符集
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        byte[] arr1 = str.getBytes("gbk");//使用指定的字符集
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        //byte[] --> String
        String str1 = new String(arr);
        System.out.println(str1);

    }


}
