package Exercicios.edabit;
import java.lang.*;
public class Gagueira {
    public static void main(String[] args){
        String str = stutter("incredible");
        System.out.println(str);
        str = stutter("enthusiastic");
        System.out.println(str);
        str = stutter("outstanding");
        System.out.println(str);
    }

    public static  String stutter(String word){
        String palavra = word.substring(0,2);
        String novaPalavra = palavra + "... " + palavra + "... " + word + "?";

        return novaPalavra;
    }
}
