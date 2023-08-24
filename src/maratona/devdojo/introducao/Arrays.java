package maratona.devdojo.introducao;

public class Arrays {
    public static void main(String[] args) {
        int [] idades = new int[3];
        idades[0] = 15;
        idades[1] = 20;
        idades [2] = 25;


        String [] nome = new String[1];
        nome[0] = "Genildo";


    /*Inicializando um array sem especificar o tamanho*/
        String name = "Genildo";
        String [] animes = {"Naruto", "Bleach", "One piece", "Fairy Tail"};
        /*For each */
        for(String i:animes){ /*Não é possivel acessar o indicie com esse for*/
            System.out.println("Animes: "+i);
        }

    }
}
