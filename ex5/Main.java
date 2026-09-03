package ex5;

public class Main {
    public static void main(String[] args) {
        //String[] alunos = {"Miranata", "Savalo", "Aeronauta"};

        //alunos[0] = "Mariazinha";
        //System.out.println("Qtde de Alunos; " + alunos.length);

        //for (String estudante : alunos){
        // System.out.println(estudante);
        //}

            //Crie uma lista com 5 produtos
            //exiba cada produto utilizando foreach
            // e também for

             //String[] produtos = {"Banana", "Melancia", "Uva", "Goiaba", "Morango"};

                //Exiba cada produto utilizando foreach
                //for (String produto : produtos){
                //System.out.println(produto);


                 //Exiba cada produto utilizando for
                 //for (int i = 0; i < produtos.length; i++) {
                 //System.out.println(produtos[i]); 
                 //}

                    //Crie um array contendo 5 números
                    //Use foreach para exibir se cada número é
                    //Positivo, negativo ou igual a zero

                    int[] numeros = { 1, -5, 0, 10, -8};

                    for (int numero : numeros) {
                        if (numero > 0) {
                            System.out.println(numero + " positivo");
                        } else if (numero < 0) {
                            System.out.println(numero + " negativo");
                        } else {
                            System.out.println(numero + " igual a zero");
                        }
                    }


}    
}

