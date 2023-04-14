package by.ruslan.radevich.homework.lessons6.PC;

public class HDD {
    private String name;
    private String type;
    private int volume;
    public String installType;

    public HDD(String name, String type, int volume) {
        this.name = name;
        this.type = type;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "HDD{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", volume=" + volume +
                ", typeInstall='" + installType + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void name(String name) {
        System.out.println("name " + name);
    }

    public void volume(int volume) {
        System.out.println("volume " + volume);
    }

    public void instalType(boolean internal) {
        if (internal) {
            System.out.println("HDD is internal");
        } else {
            System.out.println("hdd is extrenal");
        }
    }
}
