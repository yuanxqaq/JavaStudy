package _super.exer3;

/**
 * ClassName: CheckAccount
 * Package: _super.exer3
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/3/26 18:36
 * @Version 1.0
 */
public class CheckAccount extends Account{

    private double overdraft;
    public CheckAccount(int id, double balance, double annualInterestRate){
        super(id, balance, annualInterestRate);
    }
    public CheckAccount(int id, double balance, double annualInterestRate,double overdraft){
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    //针对可透支账户的取钱的操作
    public void  withdraw(double amount){
        if(getBalance() >= amount){
            //错误的
//            getBalance() = getBalance() - amount;
            //正确的
            super.withdraw(amount);
        }else if (getBalance() + overdraft >= amount){
            overdraft -= amount - getBalance();
            super.withdraw(getBalance());
        }else {
            System.out.println("超过可透支限额");
        }
    }
}
