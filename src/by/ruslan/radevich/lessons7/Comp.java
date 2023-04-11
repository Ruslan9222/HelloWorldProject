package by.ruslan.radevich.lessons7;

public abstract class Comp {//нельзя создать в маин классе new Comp(нельзя создавать обьекты этого класса)
    private String hdd;
    private String ram;
    protected String username;//говорит то что видет внутри детеи + внутри папки

    public Comp(String hdd, String ram) {
        this.hdd = hdd;
        this.ram = ram;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public abstract void printDisplay();

    @Override
    public String toString() {
        return "Comp{" +
                "hdd='" + hdd + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }
}
//