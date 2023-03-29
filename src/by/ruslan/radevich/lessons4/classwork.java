package by.ruslan.radevich.lessons4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class classwork {
    public static void main(String[] args) {
//        int[] arr = {0, 1, 2};
//        int[] arr2 = new int[5];
//        System.out.println("therd element: " + arr[2]);
//        System.out.println("therd element: " + arr2[2]);
////        arr2[2]= 10;
//        System.out.println("therd element: " + arr2[2]);
//        System.out.println("Arr Lenght: " + arr.length); // длинна массива
//        Random random = new Random();
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = random.nextInt(10);
//            System.out.println(arr2[["+ i +"] = " + arr2[i]);
//        }
//        int[]arr3= new int[10];
//        for (int i =0 ; i< arr3.length; i++){
//            arr3[i]= 1+i;
//            System.out.println("arr3["+ i +"] = " + arr3[i]);//вывод массива на 10 ячеек
//        }
//        System.out.println(Arrays.toString(arr3)); //вывести все сразу в строку красиво
//        for (int val: arr3){
//            System.out.println(val);//просто вывод всех элементов массива
//        }
//        int sum= 0;
//        for (int val: arr3){
//            sum +=val;
//            System.out.println(sum);
//            Arrays.sort(arr3);
//            System.out.println(Arrays.toString(arr3));//просто вывод суммы элементов массива
//        }
//        int minValue = Integer.MIN_VALUE;// минимальное число int
//        int maxValue = Integer.MAX_VALUE;// максимальное число int
//        int result = -1;
//        int[] arr2 = new int[5];
//        Random random = new Random();
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = random.nextInt(5);
//            if (result < arr2[i]) {
//                result = arr2[i];//поиск самого большого числа
//            }

//        int[] arr2 = new int[5];
//        int countOftwo = 0;
//        Random random = new Random();
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = random.nextInt(4);
//            if (arr2[i] == 2) {
//                countOftwo++;
//            }
//        }
//        System.out.println(countOftwo);
//        System.out.println(Arrays.toString(arr2));
        int[] arr3 = new int[5];
        int countoftwo = 0;
        Random random = new Random();
        for (int val : arr3) {
            arr3[val] = random.nextInt(4);
            if (arr3[val] == 2) {
                countoftwo++;
            }
        }

        System.out.println(countoftwo);
        System.out.println(Arrays.toString(arr3));
    }
}