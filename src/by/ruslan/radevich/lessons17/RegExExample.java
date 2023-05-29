package by.ruslan.radevich.lessons17;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExample {
    public static void main(String[] args) {
        String testString = "This is my test 1 test string,  -1245 ";
        String test2 = "123456";
        Pattern numbers = Pattern.compile("\\d+");//задание шаблона для поиск
        Matcher numbersMutcher = numbers.matcher(testString);//в чем я буду искать
        System.out.println(numbersMutcher.matches());//соответствует ли Вся строчка нашему матчеру


        Matcher numbersMutcher2 = numbers.matcher(test2);//в чем я буду искать
        System.out.println(numbersMutcher2.matches());

        if (numbersMutcher.find()) {//поиск подходящего под шаблон поиск только первое совпадение
            System.out.println(numbersMutcher.start() + " " + numbersMutcher.end());//показывает где начало и конец подходящего куска строки
            System.out.println(numbersMutcher.group());//возвращает этот кусок
        }
//        while (numbersMutcher.find()) {//поиск подходящего под шаблон все куски которые соответствуе
//            System.out.println(numbersMutcher.start() + " " + numbersMutcher.end());//показывает где начало и конец подходящего куска строки
//            System.out.println(numbersMutcher.group());//возвращает этот кусок
//
//        }
        numbersMutcher.reset();//скидывает все обратно для нового поиска
        //numbersMutcher.usePattern(Pattern.compile("test"));//начинаем поиск по новому патерну
        while (numbersMutcher.find()) {//поиск подходящего под шаблон все куски которые соответствуе
            System.out.println(numbersMutcher.start() + " " + numbersMutcher.end());//показывает где начало и конец подходящего куска строки
            System.out.println(numbersMutcher.group());//возвращает этот кусок
        }
        numbersMutcher.reset();
        numbersMutcher.results()
                .map(MatchResult::group)
                .map(String::length)
                .forEach(lenght -> System.out.println(lenght));
    }
}