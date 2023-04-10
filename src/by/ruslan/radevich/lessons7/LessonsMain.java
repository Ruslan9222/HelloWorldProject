package by.ruslan.radevich.lessons7;

public class LessonsMain {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("a", "b", "c");
        laptop.setHdd("10");
        PC pc = new PC("a", "b");
        pc.setHdd("20");
//        Comp = new Comp("a", "b");
        Comp myBestComputer = new Laptop("c", "d", "e");
        System.out.println(myBestComputer);
        if (myBestComputer.getHdd() == "100") {
            System.out.println("ogogog");
        }else {
            System.out.println("fooo");
        }
        System.out.println();
        Airplane plane = new Airplane();
        plane.fly();
        plane.flyWithSound();
        plane.printMessage();

        Duck duke = new Duck();
        duke.fly();
        duke.flyWithSound();
        duke.printMessage();

        Object obj = new Airplane();
        Object obj2 = new Duck();
        if (obj instanceof Airplane){
            ((Airplane) obj).fly();
        }else if(obj instanceof Duck){
            ((Duck) obj).fly();
        }

        Flyable[] flyingItems = getFlyingItems();
        for (Flyable flyable: flyingItems){
            flyable.flyWithSound();
        }
    }

    private static Flyable[] getFlyingItems() {
        Flyable[] flyingItems = new Flyable[4];
        flyingItems[0] = new Duck();
        flyingItems[1] = new Airplane();
        flyingItems[2] = new Duck();
        flyingItems[3] = new Airplane();
        return flyingItems;
    }
}
