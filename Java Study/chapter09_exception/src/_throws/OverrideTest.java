package _throws;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ClassName: OverrideTest
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/17 12:29
 * @Version 1.0
 */
public class OverrideTest {
    public static void main(String[] args) {
        Father f = new Son();
        try {
            f.method1();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

class Father{
    public void method1()throws IOException {

    }
    public void method2(){

    }
}

class Son extends Father{
    @Override
    public void method1() throws FileNotFoundException {

    }

//    @Override
//    public void method2() throws FileNotFoundException {
//    }

    public void method3() throws RuntimeException{

    }
}