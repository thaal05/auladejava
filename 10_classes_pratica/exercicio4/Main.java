
public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.setModelo("2.0");
        motor.setPotencia(140);

        Acessorio acessorio = new Acessorio();
        acessorio.setNome("Ar-condicionado");
        acessorio.setPreco(2500);

        Carro carro = new Carro();
        carro.setMarca("Chevrolet");
        carro.setModelo("Vectra");
        carro.setMotor(motor);
        carro.getAcessorios().add(acessorio);

        System.out.println(carro.getMarca());
        System.out.println(carro.getMotor().getModelo());
        System.out.println(carro.getAcessorios().get(0).getNome());
    }
}
