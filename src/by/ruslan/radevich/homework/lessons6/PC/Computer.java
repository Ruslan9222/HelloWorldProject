package by.ruslan.radevich.homework.lessons6.PC;

public class Computer {
    private int price;
    private String model;
    private int HDD;
    private int RAM;

    public Computer(int price, String model) {
        this.price = price;
        this.model = model;
    }

    public Computer(int price, String model, int HDD, int RAM) {
        this.price = price;
        this.model = model;
        this.HDD = HDD;
        this.RAM = RAM;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHDD() {
        return HDD;
    }

    public void setHDD(int HDD) {
        this.HDD = HDD;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public void computer1(int price, String model) {
        System.out.println("price " + price + " model ASUS");
    }

    public void computer2(int price, String model, by.ruslan.radevich.homework.lessons6.PC.HDD HDD, boolean installType, by.ruslan.radevich.homework.lessons6.RAM RAM) {
        System.out.println("price " + price + " model ASUS" + " " + "HDD " + this.HDD + " " + "RAM " + this.RAM);
    }
}
