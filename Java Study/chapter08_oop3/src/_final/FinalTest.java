
package _final;
/**
 * ClassName: FinalTest
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/14 19:47
 * @Version 1.0
 */
public class FinalTest {
    public static void main(String[] args) {
        E e = new E();
        System.out.println(e.MIN_SCORE);
//        e.MIN_SCORE = 1;
    }

}
class E{
    final int MIN_SCORE = 0;
    final int MAX_SCORE;
    final int LEFT;

//    final int RIGHT;
    {
        MAX_SCORE = 100;
    }
    public E(){
        LEFT = 2;
    }

//    public void setRight(int right){
//        RIGHT = right;
//    }
}

class  F{
    public void method(){
        final  int num;
        num = 10;
//        num++;
        System.out.println(num);
    }

    public void method(final int num){
//        num++;
        System.out.println(num);
    }
}
final class A{


}
//class B extends A{

//}
//class SubString extends String{

//}

class C{
    public final void method(){

    }

}
class D extends C{
//    public void method(){
//
//    }

}
