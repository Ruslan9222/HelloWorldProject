package by.ruslan.radevich.lessons11;

import java.util.Scanner;

public class MyBestExceptionExample {
    public static void main(String[] args) {
        //мы попросим человека угадать наш возраст
        //если плюс минус 5 лет - мы говорим что не угодал
        //если угадал - мы говорим что угадал
        //если разбежка в большую сторону(и больше 5 лет) - ошибка (видимо охренел)
        //если в меньшую сторону( и болше5)- ошибка (льстец)
        int currentAge = 30;
        System.out.println("Please, enter guessed age");
        Scanner scanner = new Scanner(System.in);
        int guassedAge = scanner.nextInt();
        try {
            boolean isGameContinue = checkAge(currentAge, guassedAge);

            while (isGameContinue) {
                System.out.println("Please, enter guessed age again");
                guassedAge = scanner.nextInt();

                isGameContinue = checkAge(currentAge, guassedAge);
            }
        } catch (MyBestException e) {
            System.out.println("My age is "+ e.getAge()+". "+e.getMessage());
            e.printStackTrace();//пишет строки в которых пвдает ошибка

        }
    }


    private static boolean checkAge(int currentAge, int guessedAge) throws MyBestException {
        int result = currentAge - guessedAge;
        //если угадал - мы говорим что угадал
        if (result == 0) {
            System.out.println("you are right");
            return false;
        }
        //если плюс минус 5 лет - мы говорим что не угодал
        if (result > -5 && result < 5) {
            System.out.println("try again, you are close enough");
            return true;
        }
        if (result>5) throw new MyBestException("You are not expert!!!(flirt version) ",currentAge);
        throw new MyBestException("You are not expert!!!(angry version) ",currentAge);
        //return false;
    }

}