package com.company;

//  Написать программу сортировки по возрастанию заданного пользователем массива чисел.
//  Пользователь программы должен задавать размер массива и наполнять его числами.
//  Использовать одну из следующих сортировок: прямого выбора, вставки, быстрая, Шелла.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner arrScan = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int arrSize = arrScan.nextInt();
        int[] arr = new int[arrSize];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i<arrSize; i++){
            arr[i] = arrScan.nextInt();
        }

        int temp, j;
        for(int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i + 1]) {
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                j = i;
                while (j > 0 && temp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = temp;
            }
        }
        
        for (int i = 0; i<arrSize; i++){
            System.out.println(arr[i]);
        }
    }
}
