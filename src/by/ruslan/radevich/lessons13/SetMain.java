package by.ruslan.radevich.lessons13;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> firstSet = new HashSet<>();//очень быстро наити
        Set<Integer> secondSet = new TreeSet<>();//сохраняет по возрастанию всегда идет по алфавиту или по взрастанию
        for (int i = 0; i<10; i++){
            firstSet.add(i);
            secondSet.add(i);
        }
        System.out.println(firstSet);
        System.out.println(secondSet);
        Set<String>firstSet1 = new HashSet<>();
        Set<String>secondSet1 = new HashSet<>();
        firstSet1.add("afirst");
        secondSet1.add("bsecond");
        System.out.println(firstSet1.add("cthird"));//смотрит вставил строчку или нет, вставляет 1 раз
        firstSet1.add("afirst");
        firstSet1.add("cthird");
        secondSet1.add("bsecond");
        System.out.println(firstSet1);
        System.out.println(secondSet1);
        System.out.println(firstSet1.contains("first"));
        System.out.println(firstSet1.isEmpty());//пустои или нет
        System.out.println(firstSet1.size());//размер
        System.out.println(firstSet1.remove("cthird"));//удаляет строку выдает true false


//        Set<Person> myPesronSet = new HashSet<>();//тут он сам сортирует
//        myPesronSet.add(new Person("Ruslan","Rad"));
//        myPesronSet.add(new Person("Ruslan","Rad"));
//        System.out.println(myPesronSet);

        Set<Person> myPesronSet = new TreeSet<>();//тут надо учить сортировать при помощи метода Compare
        myPesronSet.add(new Person("Ruslan","Rad"));
        myPesronSet.add(new Person("Petr","Rad"));
        myPesronSet.add(new Person("Anna","Rad"));

        System.out.println(myPesronSet);



    }
}
