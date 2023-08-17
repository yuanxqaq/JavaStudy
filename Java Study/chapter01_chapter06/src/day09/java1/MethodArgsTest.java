package day09.java1;

/**
 * 可变个数形参的方法
 *
 * 2.具体使用
 *  2.1可变个数形参的格式：数据类型 ... 变量名
 *  2.2当调用可变个数形参的方法时，传入的参数可以时0个、1个、2个 ...
 *  2.3可变个数形参的方法与本类中方法名相同，形参不同的方法之间构成重载
 *  2.4可变个数形参在方法的形参中，必须声明在末尾
 *  2.5可变个数形参在方法的形参中，最多只能声明一个可变形参
 *
 */
public class MethodArgsTest {
    public static void main(String[] args) {
        MethodArgsTest test = new MethodArgsTest();
        test.show(12);
        test.show("Hello");
        test.show("Hello","World");
        test.show();
    }

    public void show(int i){

    }

    public void show(String s){
        System.out.println("show(String)");

    }

    public void show(String ... strs){
        System.out.println("show(String ... strs)");
        for (int i=0;i<strs.length;i++){
            System.out.println(strs[i]);
        }
    }
}
