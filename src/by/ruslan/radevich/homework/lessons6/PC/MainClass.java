package by.ruslan.radevich.homework.lessons6.PC;

import by.ruslan.radevich.homework.lessons6.RAM;

public class MainClass {
    public static void main(String[] args) {
        HDD HDD = new HDD("Toshiba", "extrenal", 2);
        RAM RAM = new RAM("Patriot", 2);
        Computer computer1 = new Computer(100, "Asus");
        Computer computer2 = new Computer(200, "Asus", 200, 2);
        computer1.computer1(100, "Asus");
        computer2.computer2(100, "Asus", HDD, true, RAM);
        System.out.println(HDD);
        System.out.println(RAM);
    }
}
