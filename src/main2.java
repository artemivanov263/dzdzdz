
import jdk.dynalink.beans.StaticClass;

import java.lang.reflect.Array;
import java.util.Arrays;

import static method.Method.*;

public class main2 {

    public static void main(String[] args) {
        int[][] namber = new int[3][5];
        array(namber);
        array2(namber);

        sumslains(namber);
        sumsstolb(namber);
        int[] nams2 = new int[]{4,53,32,43};
        System.out.println("исходный :" + " " +  Arrays.toString(nams2));
        changearaay(nams2);
        System.out.println("измененный :" + " " +  Arrays.toString(nams2));
        copyarray(nams2);
        System.out.println("после  изминения копии:" + " " +  Arrays.toString(nams2));

    }


    static void array(int[][] nams) {  // заполняет числа по порядчку

        int n = 1;
        for (int i = 0; i < nams.length; i++) {
            for (int j = 0; j < nams[0].length; j++) {
                nams[i][j] = n;
                n++;

            }
        }
    }

    static void array2(int[][] nams) {   // выводит символы в столбик и строчку
        for (int[] nam : nams) {
            for (int araay2 : nam) {
                System.out.print(araay2 + " ");
            }
            System.out.println();
        }
    }

    static void sumslains(int[][] nams) {
        int sum = 0;
        for (int i = 0; i < nams.length; i++) {
            for (int j = 0; j < nams[i].length; j++) {

                sum += nams[i][j];

            }
            System.out.println("sumAll_lain" + " " + sum);
            sum = 0;
        }
    }

    static void sumsstolb(int[][] nams) {
        int sum = 0;
        for (int i = 0; i < nams[0].length; i++) {
            for (int j = 0; j < nams.length; j++) {

                sum += nams[j][i];


            } System.out.println("sumAll_stolb" + " " + sum);
            sum = 0;
        }
    }


    static void changearaay(int[] nams) {
        Arrays.sort(nams);


    }
    static void copyarray(int[] nams) {
        int [] copy = Arrays.copyOf(nams, nams.length);
        Arrays.fill(copy, 0);

        System.out.println("изменения копии");
        System.out.println(Arrays.toString(copy));

    }
}








