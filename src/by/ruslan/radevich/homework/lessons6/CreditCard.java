package by.ruslan.radevich.homework.lessons6;

public class CreditCard {
    private int accountNumber = 12343214;
    private int accountBalance;
    private int accrualOfMoney;
    private int withdrawalOfMoney;

    public CreditCard(int accountNumber, int accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getAccrualOfMoney() {
        return accrualOfMoney;
    }

    public void setAccrualOfMoney(int accrualofmoney) {
        this.accrualOfMoney = accrualOfMoney;
    }

    public int getWithdrawalOfMoney() {
        return withdrawalOfMoney;
    }

    public void setWithdrawalOfMoney(int withdrawalOfMoney) {
        this.withdrawalOfMoney = withdrawalOfMoney;
    }

    public void putOfMoney(int accrualofmoney) {
        accountBalance = accountBalance + accrualOfMoney;
        System.out.println("balance + " + accrualOfMoney);
    }

    public void outOfMoney(int withdrawalofmoney) {
        accountBalance = accountBalance - withdrawalOfMoney;
        System.out.println("balance - " + withdrawalOfMoney);
    }

    public void balance() {
        System.out.println("balance " + accountBalance);
    }
    public void cardInformation(){
        System.out.println("account number "+accountNumber);
        System.out.println("balance "+ accountBalance);
    }

}
