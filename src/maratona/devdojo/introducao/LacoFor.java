package maratona.devdojo.introducao;

public class LacoFor {
    public static void main(String[] args){

        String [] nomes = new String[3];
        nomes[0] = "Marcia";
        nomes[1] = "Carlos";
        nomes[2] = "Roberto";
//        nomes[3] = "Santana";

        for (int i = 0; i < nomes.length; i++)
            System.out.println(nomes[i]);


        int n = 11;
        for (int i = 0; i < n; i++ ){
            System.out.println(i);
        }

//        Imprimindo todos os pares de 0 até 1000000

        /*int milion = 1000000;
        for (int i = 0; i <= milion; i++){
            if (i % 2 == 0)
                System.out.println("Numeros pares: "+i);
        }*/

        for (int i = 0; i < 100; i++){
            System.out.println("Impimindo até 25: "+i);
            if(i == 25) break;
        }

    }
}
