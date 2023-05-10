package by.ruslan.radevich.lessons12;

import java.io.*;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name for reading");
        String fileName = sc.next();
        if(! new File(fileName).exists()){
            throw new FileNotFoundException("File "+ fileName+ " doesn exist");
        }

        try (FileReader reader = new FileReader("abc.xm;");
             Scanner scanner = new Scanner(reader);
             FileWriter correctWriter = new FileWriter("results.doc");
             FileWriter incorrectWriter = new FileWriter("failed_result.doc")) {
            while (isDocumentNameCorrect(scanner)) {

                String line = scanner.nextLine();
                if (line.length() == 15 && (line.startsWith("docnum") || line.startsWith("contract")))

                    correctWriter.write(scanner.nextLine() + "\n");
                incorrectWriter.write(scanner.nextLine() + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean isDocumentNameCorrect(Scanner scanner) {
        return scanner.hasNext();
    }

}
