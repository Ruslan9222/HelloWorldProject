package by.ruslan.radevich.homework.lessons6;

public class RAM {
    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public RAM(String name, int volume) {
        this.name = name;
        this.volume = volume;

    }

    public void name(String name) {
        System.out.println("name " + name);
    }

    public void volume(int volume) {
        System.out.println("volume " + volume);
    }

}
