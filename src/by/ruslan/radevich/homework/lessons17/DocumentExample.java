package by.ruslan.radevich.homework.lessons17;

import by.ruslan.radevich.lessons12.Car;

import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static by.ruslan.radevich.lessons17.StringRegExExample.DEFAULT_DOCUMENT_FORMAT;

public class DocumentExample {
    List<String> documents;
    String phoneNumber;
    String email;

    public List<String> getDocuments() {
        return documents;
    }

    public void setDocuments(List<String> documents) {
        this.documents = documents;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "DocumentExample{" +
                "documents=" + documents +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void String( String documents) {
        try (FileReader reader = new FileReader("my_File.txt");
             Scanner scanner2 = new Scanner(reader);) {
            while (scanner2.hasNext()){
                Pattern pattern = Pattern.compile("(\\d{4}-[a-z]{3}-){2}(\\d[a-z]){2}");
                Matcher matcher = pattern.matcher(documents);
                System.out.println(getDocuments());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        }
    }
}