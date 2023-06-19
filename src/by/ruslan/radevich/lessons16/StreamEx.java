package by.ruslan.radevich.lessons16;

import by.ruslan.radevich.lessons14.MyBestInterface;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        MyBestInterface intSTr = str -> str.substring(0, 2);
        intSTr.test("abc");

        List<Integer> testValue = Arrays.asList(1, 2, 5, 3, 2, 1);
        Map<Integer, Long> result = testValue.stream()
                .collect(Collectors.groupingBy(//соедини по группам счас говори ключи и что в ним должно быть
                        Function.identity(),//добавляем наш лист в ключ
                        Collectors.counting()));//сортируем по группам
        System.out.println(result);

        List<User> users = Arrays.asList(new User(20, "Nick"),
                new User(20, "Mike"),
                new User(30, "Max"),
                new User(30, "Ada"));
        Map<Integer, List<User>> usersByAge = users.stream()
                .collect(Collectors.groupingBy(User::getAge));//сортируем по возрасту
        System.out.println(usersByAge);

        var employess = Arrays.asList(new Employee("Worker", 200),
                new Employee("Worker", 250),
                new Employee("Worker", 500),
                new Employee("Worker", 1200),
                new Employee("Manager", 1200),
                new Employee("Manager", 700),
                new Employee("Manager", 200));
        var averageSalary = employess.stream()
                .mapToDouble(Employee::getSalary)//переделали в числа
                .average()
                .getAsDouble();//считаем среднюю зп
        System.out.println(averageSalary);
        //Stream<Integer> поток чисел
        //IntStream числовои поток
        var employeesByCategory = employess.stream()
                .collect(Collectors.groupingBy(Employee::getCategory));
        System.out.println(employeesByCategory);

        var salaryByCategory = employess.stream()
                .collect(Collectors.groupingBy(Employee::getCategory,
                        Collectors.averagingDouble(Employee::getSalary)));//средняя зп по категориям работник
        System.out.println(salaryByCategory);


        var minsalaryByCategory = employess.stream()
                .collect(Collectors.groupingBy(Employee::getCategory,
                        Collectors.minBy(Comparator
                                .comparingDouble(Employee::getSalary))));//самая маленька по категориям
        System.out.println(minsalaryByCategory);

        Map<Employee, String> tests = employess.stream()
                .collect(Collectors.toMap(//один обьект один ключ без повторок
                        Function.identity(),
                        Employee::getCategory));
        System.out.println(tests);


    }

}
