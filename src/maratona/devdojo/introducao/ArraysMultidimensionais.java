package maratona.devdojo.introducao;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        /*Arrays multidimensionais, linkando um array em outro. Exemplo, vamos linkar
        * os meses do ano aos dias do mÊs*/
        int [][] dias = new int[3][3]; /*No primeiro [] estamos é referenciado a posição do numero de arrays no segundo []
                                      Esse segundo [] vai representar a quantidades de arrays, nesse caso de dias serão 3 arrays com 3 posições*/

        /*Exemplo Classe e aluno*/
        String [][] classe = new String[3][3];
        classe[0][0] = "Carlos";
        classe[0][1] = "Matilda";
        classe[0][2] = "Jujubinha";

        classe[1][0] = "João";
        classe[1][1] = "Paula";
        classe[1][2] = "Ana";

        classe[2][0] = "Luff";
        classe[2][1] = "Zoro";
        classe[2][2] = "Nany";

        for (int i=0;i <classe.length; i++){
            System.out.println("Posição "+i+":" +classe[0][i]);

            System.out.println("Posição "+i+":" +classe[1][i]);

            System.out.println("Posição "+i+":" +classe[2][i]);
            System.out.println("-------------------------");
        }

        for(int i=0;i <classe.length;i++){
            for (int j=0;j<classe[0].length;j++){
                System.out.println("Matriz "+i+":"+classe[i][j]);
            }
            System.out.println("-------------------------");
        }
    }
}
