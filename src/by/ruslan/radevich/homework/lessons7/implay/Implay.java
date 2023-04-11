package by.ruslan.radevich.homework.lessons7.implay;

public abstract class Implay {
    private String Director;
    private String Worker;
    private String Accountant;

    public Implay(String director, String worker, String accountant) {
        Director = director;
        Worker = worker;
        Accountant = accountant;
    }

    @Override
    public String toString() {
        return "Implay{" +
                "Director='" + Director + '\'' +
                ", Worker='" + Worker + '\'' +
                ", Accountant='" + Accountant + '\'' +
                '}';
    }
}
