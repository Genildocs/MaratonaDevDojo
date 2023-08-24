package Exercicios.edabit;
import java.util.*;
public class Multiples {
    public static void main(String[] args) {
        int [] result = arrayOfMultiples(12,10);
        for(int n:result){
            System.out.println(n);
        }
    }

    public static int [] arrayOfMultiples (int num, int length){
            int [] multiple = new int[length];
            for(int i=0; i < multiple.length; i++)
                multiple[i] = (i + 1) * num;

            return multiple;
    }
}
