package ex8;

public class Main {
    public static void main(String[] args){

        int[][] numeros =  {

        {1, 4, 2},
        {2, 7, 4, 8, 1}
        };
        for(int[] linha: numeros) {
            for(int num : linha) {
                System.out.println(num);
            }
        }
    }
}