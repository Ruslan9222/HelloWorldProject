package by.ruslan.radevich.homework.lessons11;

public class ClassTask {
    public static String condition = "1234-qwe-4321-ewq-1q2w";

    public static void firstTask() {
        String str1 = "ABC";
//        try {
//           condition.toUpperCase().contains(str1);
//        } catch (ExceptionClass e) {
//            System.out.println("ABC is not found"+e);
        }



    public static void secondTask() {
        try {
            boolean check2 = condition.startsWith("555");
            System.out.println(check2);
        } catch (Exception e) {
            System.out.println("He document does not start with the sequence 555"+e);
        }

    }

    public static void thirdTask() {
        try {
            boolean check3 = condition.endsWith("1a2b");
            System.out.println(check3);
        } catch (Exception e) {
            System.out.println("The document does not end with the sequence 555"+e);
        }

    }
}

