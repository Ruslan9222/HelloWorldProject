package by.ruslan.radevich.lessons12;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FilesExample {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\JavaProject\\HelloWorldProject\\out2\\abc3.doc");//абсолютный путь
        //File file = new File("abc.doc");//тносительный путь(если указывать полность путь к диску тогда относительный
        File file1 = new File("out2");
        String str = "hello \n world";//\t табуляция \n перенос но новую строчку
        System.out.println(str);
        System.out.println(file.exists());//такои фаил есть??
        System.out.println(file.isFile());//фил или не фаил??
        System.out.println(file.isDirectory());//это папка??
        System.out.println(file1.getAbsolutePath());
        System.out.println(file.getCanonicalFile());
        System.out.println(file.getParent());
        File file3 = new File("C:\\JavaProject\\HelloWorldProject");
        System.out.println(Arrays.toString(file3.listFiles(new DockFilter())));//показывает все что лежит в папке фаилы!
        System.out.println(Arrays.toString(file3.listFiles()));

        file1.mkdir();//создает новую папку out2
        System.out.println(file.isHidden());//скрытый фаил или нет
        try {
            System.out.println(file.createNewFile());
            System.out.println(file.canRead());//могу ли я читать
            System.out.println(file.canWrite());//писать
            // System.out.println(file.canExecute());//выполнить
            System.out.println(file.getTotalSpace());//посмотреть сколько в папке
            System.out.println(file.renameTo(new File("abc4.doc")));
            System.out.println(file.setReadOnly());
            System.out.println(file.setReadable(true));//можно ли читать
            System.out.println(file.setWritable(false));//можно ли писать
            System.out.println(file.lastModified());
        }catch (IOException e){
            System.out.println("File is not created by some reason: "+e);
        }
        System.out.println(file.delete());

    }
}
