package Strings;
import java.lang.*;
public class Substring {
    public static void main(String[] args){
        String str = "Verificando o metodo substring";
        String subst = "";

        System.out.println(str.length());
        subst = str.substring(0,2);
        System.out.println(str);
        System.out.println(subst + "....");
    }
}
