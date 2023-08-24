package maratona.devdojo.introducao;

public class Switch {

    public static void main(String[] args){
        String dia  = "Sexta";

        switch (dia){
            case "Segunda":
                System.out.println("Trabalho");
                break;
            case "Terça":
                System.out.println("Trabalho");
                break;
            case "Quarta":
                System.out.println("Trabalho");
                break;
            case "Quinta":
                System.out.println("Trabalho");
                break;
            case "Sexta":
                System.out.println("Sextouuuuuu!");
                break;
            case "Sabado":
                System.out.println("Dia de festa");
                break;
            case "Domingo":
                System.out.println("Relexar");
                break;
            default:
                System.out.println("Opção invalida!");
                break;

        }

    }
}
