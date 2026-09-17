public class Main {

    static boolean ligarInterruptor(){
        if (passarEletricidade() == true){
            if (acenderLampada() == true){
                System.out.println("Lampada acendeu!");
            } else {
                System.out.println("Lampada queimou!");
            }
        } else {
            System.out.println("Problema no circuito!");
        }
        }
    }

    static boolean passarEletricidade(){
        return true;
    }

    static boolean acenderLampada(){
        return true;
    }

    public static void main(String[] args){
      System.out.println(ligarInterruptor());
    }
    
}
