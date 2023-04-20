package by.ruslan.radevich.homework.lessons7.accountingSystem.Contract;

import by.ruslan.radevich.homework.lessons7.accountingSystem.Program.Document;
import by.ruslan.radevich.homework.lessons7.accountingSystem.Program.Printable;

import java.util.Date;

public class DeliveryOfGoods extends Document implements Printable {
    @Override
    public void print() {
    }
    private String typeOfGoods;
    private int numberOfProducts;
    private DeliveryOfGoods(){
    }

    public DeliveryOfGoods(int documentNumber, Date documentDate, String typeOfGoods, int numberOfProducts) {
        super(documentNumber, documentDate);
        this.typeOfGoods = typeOfGoods;
        this.numberOfProducts = numberOfProducts;
    }

    public String getTypeOfGoods() {
        return typeOfGoods;
    }

    public void setTypeOfGoods(String typeOfGoods) {
        this.typeOfGoods = typeOfGoods;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    @Override
    public String toString() {
        return "DeliveryOfGoods{" +
                "typeOfGoods='" + typeOfGoods + '\'' +
                ", numberOfProducts=" + numberOfProducts +
                "} " + super.toString();
    }
}
