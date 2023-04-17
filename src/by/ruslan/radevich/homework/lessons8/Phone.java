package by.ruslan.radevich.homework.lessons8;

public class Phone {
    private int number = 3333333;
    private String model = "Samsung";
    private int weight = 250;
    private int receveNumber;
    private String sendMessage;

    private String ReceiveCall = "name";

    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public String getSendMessage() {
        return sendMessage;
    }

    public void setSendMessage(String sendMessage) {
        this.sendMessage = sendMessage;
    }

    public int getReceveNumber() {
        return receveNumber;
    }

    public void setReceveNumber(int receveNumber) {
        this.receveNumber = receveNumber;
    }

    public String getReceveCall() {
        return ReceiveCall;
    }

    public void setReceveCall(String reciveCall) {
        ReceiveCall = reciveCall;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void name(String name,int receveCall) {
        System.out.println("Call " + name + " " + getReceveCall());
    }
    public void message(int receveNumber,String sendMessage){
        System.out.println(sendMessage.length()+receveNumber);
    }
}
