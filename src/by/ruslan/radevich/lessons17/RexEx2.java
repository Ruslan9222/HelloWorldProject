package by.ruslan.radevich.lessons17;

import static java.util.regex.Pattern.CASE_INSENSITIVE;
import static java.util.Arrays.asList;
import static java.util.regex.Pattern.compile;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RexEx2 {
    public static void main(String[] args) {
        List<String> testStrings = asList("ABC", "abc", "f", "F", "", "a1a", "a11", "a.1", "a..1");
        //Pattern pattern = Pattern.compile("[a-z]");//совпадает ли точка поллностью с шаблоном одна буква
        //Pattern pattern = Pattern.compile("[a-z]*");// от0 до бесконечности маленьких букв
        //Pattern pattern = Pattern.compile("[a-z]?");//или 0 или одна
        //Pattern pattern = Pattern.compile("[a-z]{2,3}");//от 2х до 3х букв совпадение
        //Pattern pattern = Pattern.compile("[a-z]+");//любая строчка где есть маленькие буквы
        //Pattern pattern = Pattern.compile("[a-zA-Z]+");//и маленькие и большие
        //Pattern pattern = compile("[a-z]+", CASE_INSENSITIVE);//и маленькие и большие по правильному
        //Pattern pattern = Pattern.compile("[^a-z]+");//все кроме букв в скобках + как минимум 1 символ
        //Pattern pattern = Pattern.compile("[a-z]+\\d+[a-z]+");//снчала буква потом какая нибудь цифра, потом буква
        //Pattern pattern = Pattern.compile("[a-z]+\\d+$");//заканчиваем цифрои , если found то конец строчки
        //Pattern pattern = Pattern.compile("^[a-z]+\\d+");//ищем толко сначала
        //Pattern pattern = Pattern.compile("[a-z]+\\.\\d+");//указываем точку как точку ищем точку
        //Pattern pattern = Pattern.compile("[a-z]+.\\d+");//абслютно любои символ .
        Pattern pattern = Pattern.compile("([a-z]+.)(\\d+)");//для ифа


        testStrings.forEach(str -> {
            Matcher matcher = pattern.matcher(str);
            // System.out.println(str + " mathers? " + matcher.matches());//совпадает ли точка поллностью с шаблоном
            if (matcher.find()) {
                System.out.println("First group:  " + matcher.group(1));// для скобок 1 скобка
                System.out.println("Second group:  " + matcher.group(2));// для скобок 2 скобка
            }
        });
    }
}
