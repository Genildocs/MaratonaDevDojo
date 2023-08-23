package Exercicios.edabit;
import java.lang.*;
public class CheckString {

    public static void main(String[] args){
       boolean result = checkEnding("abc", "bc");
        System.out.println(result);

        result = checkEnding("abc", "d");
        System.out.println(result);

        result = checkEnding("samurai", "zi");
        System.out.println(result);

        result = checkEnding("feminine", "nine");
        System.out.println(result);
    }
    public static boolean checkEnding(String word1, String word2){
        boolean result = word1.endsWith(word2);
        return result;
    }
}
