import java.util.Scanner;

public class HelloHomework {
    public static void main(String[] args) {
        System.out.println("This is my second homework");
        Scanner input = new Scanner(System.in);
        String user = input.nextLine();
        String profession = "beginner javadeveloper";
        System.out.println("Hello" + " " + user + " " + profession);

    }
}
