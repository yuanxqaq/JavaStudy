package _interface.apply;

/**
 * ClassName: USBTest
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/15 14:36
 * @Version 1.0
 */
public class USBTest {
    public static void main(String[] args) {
        //创建接口实现类的对象
        Computer computer = new Computer();
        Printer printer = new Printer();
        computer.transferData(printer);

        //创建接口实现类的匿名对象
        computer.transferData(new Camera());

        //创建接口匿名实现类的对象
        USB usb1 = new USB() {
            @Override
            public void start() {
                System.out.println("U盘开始工作");
            }

            @Override
            public void end() {
                System.out.println("U盘结束工作");
            }
        };

        //创建接口匿名实现类的匿名对象
        computer.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("扫描仪开始工作");
            }

            @Override
            public void end() {
                System.out.println("扫描仪结束工作");
            }
        });
    }
}

class Computer{
    public void transferData(USB usb){//USB usb = new Printer()
        System.out.println("设备连接成功...");
        usb.start();
        System.out.println("数据传输的细节操作...");
        usb.end();
    }
}

class Camera implements USB{

    @Override
    public void start() {
        System.out.println("照相机开始工作");
    }

    @Override
    public void end() {
        System.out.println("照相机开始工作");
    }
}

class Printer implements USB{

    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void end() {
        System.out.println("打印机结束工作");
    }
}
interface USB{
    //声明常量
    //USB的长宽高...

    //方法
    void start();
    void end();
}
