package by.ruslan.radevich.homework.lessons10;

public class ClassTask {
    public static String condition = "1234-qwe-4321-ewq-1q2w";

    public static void firstTask() {
        System.out.println(condition.substring(0, 4) + condition.substring(9, 13));
    }

    public static void secondTask() {
        StringBuilder builder = new StringBuilder("1234-qwe-4321-ewq-1q2w");
        System.out.println(builder.replace(5 ,8, "***")
                .replace(14,17, "***"));
    }

    public static void thirdTask() {
        StringBuilder builder = new StringBuilder("1234-qWe-4321-ewQ-1q2w".toLowerCase());
        System.out.println(builder
                .delete(0, 5)
                .delete(3, 8)
                .deleteCharAt(8)
                .deleteCharAt(9));
    }

    public static void fourthTask() {
        StringBuilder builder = new StringBuilder("1234-qWe-4321-ewQ-1q2w".toUpperCase());
        System.out.println("Leets: " + builder
                .delete(0, 5)
                .delete(3, 8)
                .deleteCharAt(8)
                .deleteCharAt(9));

    }

    public static void fifthTask() throws MyException {
        String str1 = "ABC";
        System.out.println(condition.toUpperCase().contains(str1));
    }


    public static void sixthTask() {
        System.out.println(condition.startsWith("555"));

    }

    public static void seventyTask() {
        System.out.println(condition.endsWith("1a2b"));
    }
}