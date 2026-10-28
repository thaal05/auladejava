
import java.util.ArrayList;

public class Carro {
    private String marca;
    private String modelo;
    private Motor motor;
    private ArrayList<Acessorio> acessorios = new ArrayList<>();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public ArrayList<Acessorio> getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(ArrayList<Acessorio> acessorios) {
        this.acessorios = acessorios;
    }
}
