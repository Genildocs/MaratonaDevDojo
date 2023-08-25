package Exercicios.edabit;

public class Challenge {
    public static void main(String[] args) {
        int result = WarOfNumber(new int[]{12,90,75});
        System.out.println(result);
        result = WarOfNumber(new int[]{5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243});
        System.out.println(result);
    }

    public static int WarOfNumber(int[] numbers){
        int [] arr = numbers;
        int pares = 0;
        int impares = 0;

        for (int i=0; i < arr.length; i++){
             if(arr[i] % 2 == 0){
                 pares += arr[i];
             }else{
                 impares += arr[i];
             }
        }

        int result = pares - impares;
        return result;
    }
}
