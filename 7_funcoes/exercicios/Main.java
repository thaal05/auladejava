// Crie um programa contendo uma função que irá receber o nome do aluno e uma nota
//Caso a nota seja >_7, deverá exibir que o aluno está aprovado, senão, exibir reprovado.

public class Main {

    public static void saudacao(String nome, double nota) {
        if (nota >= 7) {
            System.out.println("Nome Completo: " + nome);
            System.out.println("Nota: " + nota);
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Nome Completo: " + nome);
            System.out.println("Nota: " + nota);
            System.out.println("Aluno reprovado!");
        }
    }

    public static void main(String[] args) {
        saudacao("Thalita", 10);
    }
}
