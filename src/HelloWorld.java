public class HelloWorld {
    public static void main(String[] args) {
//        //public - видят все, static - е нужен обьект нашго класса
//        //void - ничего нам не возвращает
//        //main - говорит что это старт нашего приложения
//        //psvm - что бы не писать руками
//        byte a = 3; //-128  +128
//        short myShort = a; //Приведение типов по нарастающеи можно писать всегда byte>short>int>long>double or float
//        byte secondByte = (byte) myShort; //наоборот надо подтверждать, если не влезет то просто поделит и остаток запишет
//        char letter = 'a'; //безнаковое целое число или буква
//        int myLeter = 122; //по умолчанию 0 !!!!
//        // чаще всего используется int and long
//        float myFloatNumber =2.5f;
//        boolean isTrue = true;
//        boolean iSFalse = false;
//        System.out.println(isTrue);
//        System.out.println("Hello world!!");
//        //sout - not to write by hands
//        //+,-,*,/
//        int aa = 4;
//        int bb = 3;
//        System.out.println(aa/bb);// выведет только целое число
//        System.out.println((double) aa/bb);//выведет дробь
//        System.out.println(aa%bb);//выведет остаток
//        aa++;
//        aa--;
//        ++aa;
//        --aa;
//        int t=7;
//        System.out.println(t++);//выведем 7+1
//        System.out.println(++t);//выведем сразу 7
        int minValue = 3;
        int maxValue = 5;
        System.out.println(minValue == maxValue);
        System.out.println(minValue != maxValue);
        System.out.println(minValue < maxValue);
        System.out.println(minValue > maxValue);
        System.out.println(minValue >= maxValue);
        System.out.println(minValue <= maxValue);
// Операторы сравнения!!
        boolean isEqual = minValue == maxValue;
        System.out.println(minValue > 0 && maxValue>10);
        System.out.println(minValue > 0 || maxValue >10);
        System.out.println(!(minValue>0));
        //логические опреаторы
        minValue+=3; //будет 6
        minValue-=3; //будет 3
        minValue*=3;
        minValue/=3;
        minValue%=3;
    }
}
