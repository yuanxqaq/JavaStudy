package _static.exer1;

/**
 * ClassName: AccountTest
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/11 17:32
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account acct1 = new Account();
        System.out.println(acct1);

        Account acct2 = new Account("123456",2000);
        System.out.println(acct2);

        Account.setInterestRate(0.0123);
        Account.setMinBalance(10);
        System.out.println("银行存款的利率为：" + Account.getInterestRate());
        System.out.println("银行存款鹅最小额度为:" + Account.getMinBalance());
    }
}
