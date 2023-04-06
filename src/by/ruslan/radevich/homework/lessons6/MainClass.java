package by.ruslan.radevich.homework.lessons6;

public class MainClass {
    public static void main(String[] args) {
        CreditCard myCreditCard = new CreditCard(12343214,0);
        myCreditCard.putOfMoney(100);
        myCreditCard.putOfMoney(1099);
        myCreditCard.balance();
        myCreditCard.outOfMoney(50);
        myCreditCard.balance();
        myCreditCard.cardInformation();


    }
}
