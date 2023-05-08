package by.ruslan.radevich.homework.lessons11;

public class ClassTask {
    public static String condition = "1234-qwe-4321-ewq-1q2w";

    public static void firstTask() throws ExceptionClass {
        String str1 = "ABC";
        boolean check1 = condition.toUpperCase().contains(str1);
        if (check1) {
            System.out.println("here");
        } else throw new ExceptionClass("1", "11");
    }


    public static void secondTask() throws ExceptionClass {
        boolean check2 = condition.startsWith("555");
        if (check2) {
            System.out.println("Here");
        } else throw new ExceptionClass("2", "2");


    }


    public static void thirdTask() throws ExceptionClass {
        boolean check3 = condition.endsWith("1a2b");
        System.out.println(check3);
        if (check3) {
            System.out.println("here");
        } else throw new ExceptionClass("123", "1");
    }
}

