
import java.util.ArrayList;

public class Time {
    private String nome;
    private String modalidade;
    private ArrayList<Jogador> jogadores = new ArrayList<>();
    private EquipeTecnica equipeTecnica;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public EquipeTecnica getEquipeTecnica() {
        return equipeTecnica;
    }

    public void setEquipeTecnica(EquipeTecnica equipeTecnica) {
        this.equipeTecnica = equipeTecnica;
    }
}
