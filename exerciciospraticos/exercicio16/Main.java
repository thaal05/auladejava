public class Main {
    public static void main(String[] args) {

        int[] numeros = {5, -2, 10, 0, -8, 3, 0, 7, -4, 12};

        int positivos = 0;
        int negativos = 0;
        int zeros = 0;

        for (int numero : numeros) {
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                zeros++;
            }
        }

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Zeros: " + zeros);
    }
}