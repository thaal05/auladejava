public class Main {
    public static void main(String[] args) {

        //Crie uma matriz com 4 linhas e 4 colunas.
        //Para cada posição da matriz, preencha com valores inteiros aleatórios.
        //Exiba o valor da posição 2,3.

        int[][] numeros= {
            {1, 4, 2, 8},
            {3, 6, 8, 9},
            {4, 7, 5, 3},
            {9, 2, 1, 3}
        };
        
         for(int i = 0; i <4; i++) {
            for(int j = 0; j <4; j++) {
                numeros [i][j] = 0;
            }
         }
        
        // for(int i = 0; i <4; i++) {
        //     for(int j = 0; j <4; j++)
        //     System.out.println(numeros[i][j]);
        //}

       //System.out.println(numeros[2][3]);
    }
}