
public class Personagem {
    private String nome;
    private int vida;
    private Tipo[] tipos;
    private Poder[] poderes;

    public Personagem(String nome, int vida, Tipo[] tipos, Poder[] poderes) {
        this.nome = nome;
        this.vida = vida;
        this.tipos = tipos;
        this.poderes = poderes;
    }

    public static void main(String[] args) {
        Tipo[] tipos = {new Tipo("Guerreiro"), new Tipo("Zumbi")};
        Poder[] poderes = {new Poder("Fogo"), new Poder("Raio")};

        Personagem p = new Personagem("Kratos", 100, tipos, poderes);

        System.out.println(p.nome + " - Vida: " + p.vida);

        for (Tipo t : p.tipos)
            System.out.println("Tipo: " + t.getNome());

        for (Poder po : p.poderes)
            System.out.println("Poder: " + po.getDescricao());
    }
}
