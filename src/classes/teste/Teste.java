package classes.teste;


import classes.dominio.Estudante;

public class Teste {
    public static void main(String[] args) {
        //Estudante é uma variavel de referencia para a classe Estudante,
        // e o new Estudante é o construtor do objeto estudante.
        Estudante estudante = new Estudante();
        estudante.matricula = 235;
        estudante.nome = "Carlos Alberto Santos";
        estudante.sexo = 'M';
        estudante.curso = "Sistema de informações";
        estudante.contato = "2210-2301";

        System.out.println("Estudante: " + estudante.nome + ", de sexo: " + estudante.sexo + '.');
        System.out.println("Matricula: " + estudante.matricula);

        //Agora temos acesso aos metodos e atributos criados na classe Estudante.

    }
}
