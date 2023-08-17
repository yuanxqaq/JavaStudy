package day03;

public class LogicTest {
    public static void main(String[] args) {

        //区分&与&&
        boolean b1 = true;
        int num1 = 10;
        if(b1 & (num1++ > 0)){
            System.out.println("我现在在北京");
        }else {
            System.out.println("我现在在南京");
        }
    }
}
