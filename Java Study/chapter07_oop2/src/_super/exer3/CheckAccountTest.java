package _super.exer3;

/**
 * ClassName: CheckAccountTest
 * Package: _super.exer3
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/3/29 22:54
 * @Version 1.0
 */
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount checkAccount = new CheckAccount(1122,20000,0.045,5000);


        checkAccount.withdraw(5000);
        System.out.println("您的账户余额：" + checkAccount.getBalance());
        System.out.println("您的可透支额：" + checkAccount.getOverdraft());

        checkAccount.withdraw(18000);
        System.out.println("您的账户余额：" + checkAccount.getBalance());
        System.out.println("您的可透支额：" + checkAccount.getOverdraft());

        checkAccount.withdraw(3000);
        System.out.println("您的账户余额：" + checkAccount.getBalance());
        System.out.println("您的可透支额：" + checkAccount.getOverdraft());
    }
}
