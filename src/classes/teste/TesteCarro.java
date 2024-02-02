package classes.teste;

import classes.dominio.Carro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.nome = "Fiat uno";
        carro.modelo = "Gas";
        carro.ano = 2015;

        System.out.println("Vende-se: " + carro.nome + ", modelo: " + carro.modelo + ", ano: " + carro.ano);
    }
}
