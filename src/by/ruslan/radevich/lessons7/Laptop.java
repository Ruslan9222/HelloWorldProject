package by.ruslan.radevich.lessons7;

public class Laptop extends Comp {//говорим что все это есть в комп "extends"

    public Laptop(String hdd, String ram, String touchpad) {
        super(hdd, ram);//конструктор класс родителя
        this.touchpad = touchpad;// класс ребенка
        this.username = "Ruslan";
    }

    private String touchpad;

    public String getTouchpad() {
        return touchpad;
    }

    public void setTouchpad(String touchpad) {
        this.touchpad = touchpad;
    }

    @Override
    public void printDisplay() {
        System.out.println("this is laptop display");
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "touchpad='" + touchpad + '\'' +
                "} " + super.toString();
    }
}

