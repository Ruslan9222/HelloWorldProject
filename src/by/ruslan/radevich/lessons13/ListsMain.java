package by.ruslan.radevich.lessons13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListsMain {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();//можно заменить на linkedList и ничего не поменяется
        List<String> secondStrings = new ArrayList<>();
        strings.add("first");
        strings.add("second");
        strings.add("third");
        System.out.println(strings);//сохраняет именно в том порядке как и вводим
        secondStrings.add("forth");
        secondStrings.add("fifth");
        strings.addAll(secondStrings);
        strings.add(2,"next");
        System.out.println(strings);
        System.out.println(strings.contains("next"));
        System.out.println(strings.indexOf("next"));//поиск индекса
        System.out.println(strings.lastIndexOf("next"));
        System.out.println(strings.isEmpty());//показывает пустои лист или нет
        System.out.println(strings.get(4));//достаем четвертую позицию
        System.out.println(strings.remove("next"));//выкидываем переменную next
        System.out.println(strings.remove(4));// выкидываем 4ю позицию
        System.out.println(strings.removeAll(secondStrings));//выкидываем из листа другои лист
        System.out.println(strings.set(1,"next"));//меняем элемент на другои элемент без сдвига
        System.out.println(strings.subList(1,3));//выводим с первого по третий
        System.out.println(strings.size());//выводим размер
        System.out.println(strings);


        Collections.sort(secondStrings);//сортировка
        Collections.reverse(secondStrings);//пишем задом на перед
        Collections.shuffle(strings);//перемешиваем лист случаиным образом
        System.out.println(strings);
        for (String str: strings){
            System.out.println(str);
        }
    }
}
