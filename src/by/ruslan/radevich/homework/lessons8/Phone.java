package by.ruslan.radevich.homework.lessons8;

import java.util.Arrays;
import java.util.Random;

public class Phone {
    public int[] getReceveNumber;
    private int number;
    private String model;
    private int weight;
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

    public void printName(String name, int receveCall) {
        System.out.println("Call " + name + " " +receveCall);
    }
    public void printName(int receveCall, String name) {
        System.out.println("Call " + name + " " +receveCall);
    }

    public void sendMessage(int receveNumber, String sendMessage) {
        System.out.println(sendMessage + " "+ receveNumber);
    }
    public void sendMessage(int[] receveNumber) {
        System.out.println("Message "+ Arrays.toString(receveNumber));
        }
    }
