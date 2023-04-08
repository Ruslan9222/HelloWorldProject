package by.ruslan.radevich.homework.lessons6;

public class MainClass {
    public static void main(String[] args) {
        CreditCard myCreditCard = new CreditCard(12343214,0);
        CreditCard myGoldCard = new CreditCard(55555555,100);
        CreditCard myPlatinumCard = new CreditCard(99999999,1000);
        myCreditCard.putOfMoney(100);
        myGoldCard.putOfMoney(226);
        myCreditCard.balance();
        myPlatinumCard.outOfMoney(50);
        myCreditCard.balance();
        myCreditCard.cardInformation();
        myPlatinumCard.cardInformation();
        myGoldCard.cardInformation();


    }
}
