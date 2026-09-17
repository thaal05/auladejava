// crie um programa contendo uma funcção que irá receber um valor inteiro.
// o programa deverá exibir se o valor é: menor que zero, igual a zero ou maior que zero.

public class Main {

    static void verificarValor(int valor) {
        if (valor < 0) {
            System.out.println("Menor que zero");
        } else if (valor == 0) {
            System.out.println("Igual a zero");
        } else {
            System.out.println("Maior que zero");
        }
    }

    public static void main(String[] args) {
        verificarValor(0);
    }
}