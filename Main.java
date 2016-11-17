package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {

    int arr [];
    byte byteArray [] = new byte [26];
    String stringArray [] = new String[10];
    static String daysOfWeek [] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    static int arr8 [] = {5,-8,19,4};
    static int arr9 [][] = {
            {1,2,3},
            {1,2,3}
    };
    static int arr10 [][] = {
            {50,2,3,4,5},
            {1,2,3,6,44}
    };

    static int arr11 [][] = {
            {50,23,53,124,5},
            {13,27,3,6,44}
    };





    public static void main(String[] args) {

        getDaysOfWeekValue(3); //5.   Составить программу вывода на экран любого элемента массива по его индексу.





        //6.   Заполнить массив из восьми элементов следующими значениями: первый элемент массива равен 37, второй — 0, третий — 50, четвертый — 46, пятый — 34, шестой — 46, седьмой — 0, восьмой —13.
        Integer mass8 [] = {37,0,50,46,34,46,0,13};

        //7.      Заполнить массив из восьми элементов таким образом, чтобы значения элементов при просмотре массива слева направо образовывали:
        Arrays.sort(mass8, Collections.reverseOrder()); //а) убывающую последовательность;
        Arrays.sort(mass8); //б) возрастающую последовательность.

        //8.      Дан массив целых чисел. Выяснить:
        isPositive(2);//а) является ли s-й элемент массива положительным числом;
        isEven(0);//б) является ли k-й элемент массива четным числом;
        isBiggest(1,0); //в) какой элемент массива больше: k-й или s-й.

        //9.      Дан двумерный массив

        rightUpper(arr9); //а) Вывести на экран элемент, расположенный в правом верхнем углу массива.
        lesftLower(arr9); //б) Вывести на экран элемент, расположенный в левом нижнем углу массива.

        //10.  Дан двумерный массив.
        rightLower(arr10);//а) Вывести на экран элемент, расположенный в правом нижнем углу массива.
        leftUpper(arr10); //б) Вывести на экран элемент, расположенный в левом верхнем углу массива.

        //11.  Дан двумерный массив. Составить программу:
        anyElementOfSecondLine(arr11);
        anyElementOfArray(arr11);



    }

    //5.   Составить программу вывода на экран любого элемента массива по его индексу.
    public static void getDaysOfWeekValue(int arrIndex){
        System.out.println(daysOfWeek[arrIndex]);
    }

    //8
    public  static void isPositive(int x){ //а) является ли s-й элемент массива положительным числом;
        boolean isPositive = arr8[x] >= 0;
        System.out.println("число с индексом "+x+" позитивное ? - " +isPositive);

    }
    public static void isEven (int x) { //б) является ли k-й элемент массива четным числом;
        boolean isEven = (arr8[x] % 2) == 0;//
        System.out.println("число с индексом "+ x+" четное ? - " + isEven);

    }
    public static void isBiggest (int x, int y){ //в) какой элемент массива больше: k-й или s-й.
        boolean isBiggest = arr8[x] > arr8[y];
        System.out.println("Число с индексом "+ x+" больше чем с индексом "+y+" ? - "+isBiggest);

    }

    //9
    public static void rightUpper(int array[][]){
        int size1 = array.length;
        int size2 = array[size1-1].length;
        System.out.println("элемент, расположенный в правом верхнем углу массива - "+array[0][size2-1]);//а) Вывести на экран элемент, расположенный в правом верхнем углу массива..

    }
    public static void lesftLower(int array[][]){
        int size1 = array.length;
        System.out.println("элемент, расположенный в левом нижнем углу массива - "+array[size1 -1][0]);//б) Вывести на экран элемент, расположенный в левом нижнем углу массива.

    }


    //10
    public static void rightLower(int array[][]){
        int size1 = array.length;
        int size2 = array[size1-1].length;
        System.out.println("элемент, расположенный в правом нижнем углу массива - "+array[size1-1][size2-1]);//а) Вывести на экран элемент, расположенный в правом нижнем углу массива.
    }
    public static void leftUpper(int array[][]){
        System.out.println("элемент, расположенный в левом верхнем углу массива - "+array[0][0]);//б) Вывести на экран элемент, расположенный в левом верхнем углу массива.
    }

    //11
    public static void anyElementOfSecondLine(int arr[][]){//а) вывода на экран любого элемента второй строки массива;
        Random random = new Random();
        int y = random.nextInt(arr[1].length);
        System.out.println((y+1)+"й элемет второй строки массива = "+ arr[1][y]);
    }
    public static void anyElementOfArray(int arr[][]){//б) вывода на экран любого элемента массива.
        Random random = new Random();
        int x = random.nextInt(arr.length);
        int y = random.nextInt(arr[x].length);
        System.out.println((y+1) + "й элемет "+ (x+1) +"й строки массива = "+ arr[x][y]);
    }


}
