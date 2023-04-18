package by.ruslan.radevich.lessons9;

import java.util.Random;

public class Ambulance {
    public static void main(String[] args) {
        //1 - создать пациента
//        Patient knowPatient = new Patient("Vasya", 23);
//        Patient unlnowPatient = new Patient();
        //создаем пациентов
        Patient[] patients = getPatients();
        for (Patient patient: patients){
            setMedicalPlan(patient);
            //3 - выделить доктора
            Doctor doctor = getDoctorToPatient(patient);
            //4 - вылечить
            doctor.heal();
        }

//        //2 - прописать план лечения
//        setMedicalPlan(knowPatient);
//        setMedicalPlan(unlnowPatient);
//        //3 - выделить доктора
//        Doctor firstDoctor = getDoctorToPatient(knowPatient);
//        Doctor secondDoctor = getDoctorToPatient(unlnowPatient);
//
//        //4 - вылечить
//        firstDoctor.heal();
//        secondDoctor.heal();

        /**
         * we give a doctor to Patient
         * if  medical plan - we give Terapist
         * if medical plan = 2 - we give Dentist
         * else we give Surgeon
         */
//        int p=0;
//        increment(p);
//        System.out.println(p);

    }

    private static Doctor getDoctorToPatient(Patient patent) {
        if(patent.getMedicalPlan()==1)return new Terapist();
        if(patent.getMedicalPlan()==2)return new Dentist();
        return new Surgeon();
    }

    /**
     * set different medical plan
     * @param patient
     */
    private static void setMedicalPlan(Patient patient) {
        if (patient.getName() == null) {
            patient.setMedicalPlan(1);
        } else {
            Random random = new Random();
            patient.setMedicalPlan(random.nextInt(3));
           // patient.setMedicalPlan(2);
        }
    }
    private static Patient[] getPatients(){
        Patient[] patients = new Patient[2];
        patients[0]= new Patient( "Vasya", 23);
        patients[1] = new Patient();
        return patients;
    }

//    private static void increment(int param){
//        param= param+1;
//        System.out.println(param);
//    }
    public static final String DEFAULT_NAME="animaл"; // константа обьявляется так!

}


