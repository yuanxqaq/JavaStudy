package object.equals.apply;

/**
 * ClassName: Account
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/10 11:00
 * @Version 1.0
 */
public class Account {
    private double balance;//余额

    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Double.compare(account.balance, balance) == 0;
    }

}
