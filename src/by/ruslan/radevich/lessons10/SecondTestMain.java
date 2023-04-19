package by.ruslan.radevich.lessons10;

import java.util.Arrays;

public class SecondTestMain {
    public static void main(String[] args) {

        String str = "This is my string";
        String str2 = "THIS IS MY STRING";

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.equalsIgnoreCase(str2));

        System.out.println(str.replace('i', 'a'));//замена символа
        System.out.println(str.replace("is", "as"));//замена строчки

        System.out.println(str.concat("is"));
        System.out.println(str.indexOf("is")); // вернет номер индекса  с начала строки
        System.out.println(str.lastIndexOf("is"));
        System.out.println(str.indexOf("is",8));//поиск с этои позиций

        System.out.println(str.replaceFirst("", "a"));  // замена regex  на другое в replacement
        System.out.println(str.replaceAll("", "a"));    // замена regex  на другое в replacement

        String str4 = "abra";
        int myVal = 125;
        String result = String.valueOf(myVal);//преоразование числа в строку
        String result2 = 125 + "";//преоразование числа в строку


        System.out.println(str4.repeat(5));    // склеить строку n раз
        System.out.println(str4.startsWith("ab"));
        System.out.println(str4.endsWith("ab"));

        String[] myArrayString = str.split(" "); // разбить строку на массив слов, разделённых regex
        System.out.println(Arrays.toString(myArrayString)); // между словами не более лдного пробела

        String str5 = " ";
        System.out.println(str5.isEmpty()); // пустая строчка ?
        System.out.println(str5.isBlank()); // чистая строка ?


    }
}



