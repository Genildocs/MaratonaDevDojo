package maratona.devdojo.introducao;
import java.util.Scanner;
public class OperadorTernario {

    public static void main(String[] args){
        int number;
        System.out.println("Digite sua idade? ");
        Scanner x;
        x = new Scanner(System.in);
        number = x.nextInt();
        String condicao = number < 18 ? "Não é de maior" : "É de maior";
        System.out.println(condicao);
    }
}
