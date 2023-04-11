package by.ruslan.radevich.lessons7;

public class Airplane implements Flyable{
    @Override
    public void fly() {
        System.out.println("Airplane is fly");
    }

    @Override
    public void flyWithSound() {
        System.out.println("Airplane is flying, zhzhzhzhzhz");

    }//мои свмолет должен уметь летать

}
