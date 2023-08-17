package day08.exer;

public class Exer3Test {
    public static void main(String[] args) {
        Exer3Test test = new Exer3Test();
        //3.1测试
//        test.method();
        //3.2测试
//        int area = test.method();
//        System.out.println("面积为："+area);

        //3.3测试
        System.out.println("面积为：" + test.method(12,10));

    }
    //3.1
//    public void method(){
//        for (int i=0;i<10;i++){
//            for (int j = 0;j < 8;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }


    //3.2

//    public int method(){
//        for (int i=0;i<10;i++){
//            for (int j = 0;j < 8;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        return 10 * 8;
//    }

    //3.3
    public int method(int m,int n){
        for (int i=0;i<m;i++){
            for (int j = 0;j < n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        return m * n;
    }
}
