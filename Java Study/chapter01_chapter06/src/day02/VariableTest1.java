package day02;


/*

*/
public class VariableTest1 {
    public static void main(String[] args) {
        //1.整型
        // byte(1字节=8bit) / short(2字节)
        // int(4字节) / long(8字节)
        byte b1 = 12;
        byte b2 = -128;
        System.out.println(b1);
        System.out.println(b2);

        //2.浮点型
        // 声明long型变量，必须已"l"或“L”结尾
        short s1 = 128;
        int i1 = 1234;
        long l1 = 162371692371L;
        System.out.println(s1);
        System.out.println(i1);
        System.out.println(l1);

        //float类型变量，变量要以“f”或“F”结尾
        double d1 = 123.3;
        System.out.println(d1+1);
        float f1 = 12.3F;
        System.out.println(f1);

        //3.字符型 char(1字符=2字节)
        //定义char变量，通常使用一对'',内部只能写一个字符
        char c1 = 'a';
        System.out.println(c1);

        char c2 = '1';
        char c3 = '中';
        System.out.println(c2);
        System.out.println(c3);

        //表示方式：1.声明一个字符  2。转义字符 3.直接使用unicode值来表示字符
        char c4 = '\n'; // 换行符
        c4 = '\t'; //制表符
        System.out.println("hello"+c4);
        System.out.println("world");

        char c5 = '\u0043';
        System.out.println(c5);

        //4.布尔型(boolean)
        //只能取两个值之一 ：true false
        boolean bb1 = true;
        System.out.println(bb1);

        boolean isMarried = true;
        if (isMarried)
            System.out.println("你就不能参加\"单身\"party了！\n很遗憾");
        else
            System.out.println("你可以多谈谈女朋友！");
    }
}
