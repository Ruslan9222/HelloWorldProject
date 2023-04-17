package by.ruslan.radevich.lessons9;

public class Patient {
    private String name;
    private int age;
    //это тою, к какому в рачу к кокому собираемся отправить пациента
    private int medicalPlan;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Patient() {
    }

    public int getMedicalPlan() {
        return medicalPlan;
    }

    public String getName() {
        return name;
    }

    public void setMedicalPlan(int medicalPlan) {
        this.medicalPlan = medicalPlan;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
