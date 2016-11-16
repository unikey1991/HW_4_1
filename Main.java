package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int arr [];
        byte byteArray [] = new byte [26];
        String stringArray [] = new String[10];
        String daysOfWeek [] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        System.out.println(daysOfWeek[3]);

        //6.   Заполнить массив из восьми элементов следующими значениями: первый элемент массива равен 37, второй — 0, третий — 50, четвертый — 46, пятый — 34, шестой — 46, седьмой — 0, восьмой —13.
        Integer mass8 [] = {37,0,50,46,34,46,0,13};

        //7.      Заполнить массив из восьми элементов таким образом, чтобы значения элементов при просмотре массива слева направо образовывали:
        Arrays.sort(mass8, Collections.reverseOrder()); //а) убывающую последовательность;
        Arrays.sort(mass8); //б) возрастающую последовательность.

        //8.      Дан массив целых чисел. Выяснить:
        int arr8 [] = {5,-8,19,4};//а) является ли s-й элемент массива положительным числом;
        boolean isPositive = arr8[1] >= 0;
        System.out.println("число с индексом 1 позитивное ? - " +isPositive);
        boolean isEven = (arr8[3] % 2) == 0;//б) является ли k-й элемент массива четным числом;
        System.out.println("число с индексом 3 четное ? - "+isEven);
        boolean isBiggest = arr8[1] > arr8[2]; //в) какой элемент массива больше: k-й или s-й.
        System.out.println("Число с индексом 1 больше чем с индексом 2 ? - "+isBiggest);

        //9.      Дан двумерный массив
        int arr9 [][] = {{1,2,3},{1,2,3}};
        System.out.println(arr9[0][2]);//а) Вывести на экран элемент, расположенный в правом верхнем углу массива.
        System.out.println(arr9[1][0]);//б) Вывести на экран элемент, расположенный в левом нижнем углу массива.

        //10.  Дан двумерный массив.
        int arr10 [][] = {{50,2,3,4,5},{1,2,3,6,44}};
        System.out.println(arr10[1][4]);//а) Вывести на экран элемент, расположенный в правом нижнем углу массива.
        System.out.println(arr10[0][0]);//б) Вывести на экран элемент, расположенный в левом верхнем углу массива.

        //11.  Дан двумерный массив. Составить программу:
        int arr11 [][] = {{50,23,53,124,5},{13,27,3,6,44}};

        Random random = new Random();//а) вывода на экран любого элемента второй строки массива;
        int x = random.nextInt(5);
        System.out.println(arr11[1][x]);

        Random random2 = new Random();//б) вывода на экран любого элемента массива.
        int y = random.nextInt(2);
        System.out.println(arr11[y][x]);














    }
}
