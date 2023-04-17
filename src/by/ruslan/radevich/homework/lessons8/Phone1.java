package by.ruslan.radevich.homework.lessons8;

public class Phone1 {
    private int number = 4444444;
    private String model = "Iphone";
    private int weight = 251;
    private String ReceiveCall = "name";

    public Phone1(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;

    }

    public Phone1(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone1() {
    }

    public String getReceiveCall() {
        return ReceiveCall;
    }

    public void setReceiveCall(String receiveCall) {
        ReceiveCall = receiveCall;
    }

    @Override
    public String toString() {
        return "Phone1{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
    public void name(String name) {
        System.out.println("Call " + name + " " + getReceiveCall());
    }
}
