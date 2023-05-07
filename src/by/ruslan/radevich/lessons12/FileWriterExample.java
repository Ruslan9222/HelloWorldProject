package by.ruslan.radevich.lessons12;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("abc.doc",true)){
            //можно перезаписывать тру
            //если написать так программа самом закроет без close
            writer.write("this is me string\n");
            writer.flush();//записать немедленно
            writer.write("this is me second string\n");
            writer.write("this is my third string\n");
            writer.close();//надо делать обязательно иначе ничего не запишет
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
