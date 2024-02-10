package matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*


Напишите программу, которая определяет, сколько раз встречается в матрице элемент, равный K .
Входные данные
В первой строке записаны через пробел размеры матрицы:
 количество строк N и количество столбцов M ( 1≤ N , M ≤100 ).
  В следующих N строках записаны строки матрицы, в каждой – по M натуральных чисел, разделённых пробелами.
   В следующей строке записано целое число K .
Выходные данные
Программа должна вывести количество элементов матрицы, равных K .
         */
        Scanner sc=new Scanner(System.in);
        int str=20;
        int stl=20;
        int[][] matrix=new int[str][stl];
        Random ran=new Random();
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]=ran.nextInt(100-1+1)+1;
            }
        }
        int sov=5;
        int count=0;
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
             //   System.out.print(matrix[i][j]+" ");
                if(matrix[i][j]==sov){
                    count++;
                }
            }
           // System.out.println();
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println(count);
    }
}
