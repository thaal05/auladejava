public class Main {
    static void analisar(String nome, int nota) {
    if (nota >= 7)
    System.out.println("O aluno(a) " + nome + "está aprovado com nota " + nota);
    else
    System.out.println("0 aluno(a) " + nome + "está reprovado com nota " + nota);
    }
    public static void main (String[] args) {
    analisar("Seleide", 8);
    }
}