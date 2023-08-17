package day08.java;
/*
* 类中方法的声明和使用
* 3.2如果方法有返回值的话，则必须在方法声明时，指定返回值的类型，同时，
*   方法中需要使用return关键字来返回指定类型的变量或常量
*
*   如果方法没有返回值，则方法声明时，使用void表示。通常，没有返回值的
*   时候，可只写一个return或不写
* */
public class CustomerTest {
    public static void main(String[] args) {
        Customer cust1 = new Customer();
        cust1.eat();
        cust1.getNation("中国");
    }
}

class Customer{

    //属性
    String name;
    int age;
    boolean isMale;

    //方法
    public void eat(){
        System.out.println("客户吃饭");
    }

    public void sleep(int hour){  //void无返回值
        System.out.println("休息了"+hour+"个小时");
    }
    public String getName(){
        return name;
    }
    public String getNation(String nation){
        String info = "我的国籍是：" + nation;
        return info;
    }
}