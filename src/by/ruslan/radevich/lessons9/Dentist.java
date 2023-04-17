package by.ruslan.radevich.lessons9;

public class Dentist implements Doctor {
    @Override
    public void heal() {
        System.out.println("How many teeth do you have? Lets reduce the number");
    }
}
