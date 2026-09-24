//Crie um programa contendo uma função que irá receber um valor inteiro.
//Exiba a tabuada de número digitado.


import java.util.Scanner;

public class Main {

    public static void tabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        tabuada(numero);

        scanner.close();
    }
}

