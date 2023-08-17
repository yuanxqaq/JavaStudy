package day10.exer3;

/**
 * @author ZhangJiaYuan
 * @create 2023-03-23-16:05
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer cust = new Customer("Jane","Smith");

        Account acct = new Account(1000,2000,0.0123);
        cust.setAccount(acct);

        cust.getAccount().deposit(100);
        cust.getAccount().withraw(960);
        cust.getAccount().withraw(2000);

        System.out.println("Customer["+cust.getLastName()+","+cust.getFirstName()+
                "]has a account: id is " + cust.getAccount().getId() + ",annualInterestRate is"
                + cust.getAccount().getAnnualInterestRate() * 100 + "%,balance is "
                + cust.getAccount().getBalance());
    }
}
