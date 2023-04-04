package by.ruslan.radevich.lessons5;

import java.util.Arrays;
import java.util.Random;

public class FifthClasswork {
    public static void main(String[] args) {
        multiplayAndPrintArrays();

    }

    private static void multiplayAndPrintArrays() {
        //        int[] arr = new int[10];
//        int[][] arr2 = new int[10][10];
//        for (int i = 0; i < arr2.length; i++) {
//            for (int j = 0; j < arr2[i].length; j++) {
//                arr2[i][j] = i * j;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr2));//вывод в строку
//        for (int i = 0; i < arr2.length; i++) {
//            for (int j = 0; j < arr2[i].length; j++) {
//                System.out.print(" arr[i][j]= " + arr2[i][j]);
//            }
//            System.out.println();
//        }
//        int[][] arr3 = new int[4][];
//        for (int i = 0; i < arr3.length; i++) {
//                arr3[i] = new int[i + 1];
//                Arrays.fill(arr3[i],i+1);
//            }
//        System.out.println(Arrays.deepToString(arr3));
//
//        int[][] arr4 =new int[5][5];
//        Random random = new Random();
//        for (int i = 0; i<arr4.length;i++){
//            for (int j= 0 ; j<arr4[i].length;j++){
//                arr4[i][j]= random.nextInt(10);
//            }
//        }
//        System.out.println(Arrays.deepToString(arr4));
//        int[] arr5 = new int[10];
//        int[] newArr = new int[10];
////        arr5[5] = 1;
//        System.out.println(Arrays.equals(arr5, newArr));//сравнение двух масствов!
//        System.out.println(Arrays.compare(arr5, newArr));//сравнение двух масствов + показывает в какую сторону
//        Arrays.fill(arr5[i],22);
//        int[][][] superarr = new int[11][11][11];
//        for (int i = 0; i < superarr.length; i++) {
//            for (int j = 0; j < superarr[i].length; j++) {
//                for (int k = 0; k < superarr[i][j].length; k++) {
//                    System.out.print("arr[" + i + "][" + j + "][" + k + "] = " + superarr[i][j][k]);
//                }
//            }
//            System.out.println();
//        }
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        int[][] result = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = random.nextInt(5);
                arr2[i][j] = random.nextInt(5);
                result[i][j] = arr1[i][j] * arr2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(result));
    }
}