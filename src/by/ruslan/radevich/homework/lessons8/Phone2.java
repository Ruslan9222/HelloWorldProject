package by.ruslan.radevich.homework.lessons8;

public class Phone2 {
    private int number = 5555555;
    private String model = "MI";
    private int weight = 253;
    private String ReceiveCall = "name";

    public Phone2(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone2(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone2() {
    }

    public String getReceiveCall() {
        return ReceiveCall;
    }

    public void setReceiveCall(String receiveCall) {
        ReceiveCall = receiveCall;
    }

    @Override
    public String toString() {
        return "Phone2{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
    public void name(String name) {
        System.out.println("Call " + name + " " + number);
    }
}
