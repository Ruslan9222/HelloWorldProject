package by.ruslan.radevich.lessons11;

public class ExceptionExample {
    public static void main(String[] args) {
        int result = 0;
        try {//блок try cach используется когда знаем что возможна ошибка
            result = 1 / 0;//ловим ошибку
            } catch (ArithmeticException |
                     IndexOutOfBoundsException e) {//арифметическая ошибка, можно писать несколько подряд
                System.out.println("Oops, something bad");
                result = 0;
            } catch (Exception e) {// ошибка родитель(смотри схему)
                System.out.println("Oops, something bad");
                result = -1;//можно делать несколько
            } finally {//выполняется всегда даже когда ошибки нет
                System.out.println("this is the end of try block!!");
            }
            System.out.println(result);
        }
    }

