package by.ruslan.radevich.homework.lessons6;

public class CreditCard {
    private int accountnumber = 12343214;
    private int accountbalance;
    private int accrualofmoney;
    private int withdrawalofmoney;

    public CreditCard(int accountnumber, int accountbalance) {
        this.accountnumber = accountnumber;
        this.accountbalance = accountbalance;
    }

    public int getAccountbalance() {
        return accountbalance;
    }

    public void setAccountbalance(int accountbalance) {
        this.accountbalance = accountbalance;
    }

    public int getAccrualofmoney() {
        return accrualofmoney;
    }

    public void setAccrualofmoney(int accrualofmoney) {
        this.accrualofmoney = accrualofmoney;
    }

    public int getWithdrawalofmoney() {
        return withdrawalofmoney;
    }

    public void setWithdrawalofmoney(int withdrawalofmoney) {
        this.withdrawalofmoney = withdrawalofmoney;
    }

    public void putOfMoney(int accrualofmoney) {
        accountbalance = accountbalance + accrualofmoney;
        System.out.println("balance + " + accrualofmoney);
    }

    public void outOfMoney(int withdrawalofmoney) {
        accountbalance = accountbalance - withdrawalofmoney;
        System.out.println("balance - " + withdrawalofmoney);
    }

    public void balance() {
        System.out.println("balance " + accountbalance);
    }
    public void cardInformation(){
        System.out.println("account number "+accountnumber);
        System.out.println("balance "+ accountbalance);
    }

}
