public class Main {
    public static void main(String[] args){

        int[] item = {4, 7, -2, 0, 9};

        for(int notas : item){
            if (notas < 0)
            System.out.println("Negativo.");
            if (notas == 0)
            System.out.println("Zero");
            if (notas > 0)
            System.out.println("Positivo.");
            }
    }
}