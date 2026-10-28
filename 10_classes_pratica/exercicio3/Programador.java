public class Programador {
    private String nome;
    private int nivel_cafeina;
    private Linguagem[] linguagens;
    private SistemaOperacional[] sistemas;

    public Programador(String nome, int nivel_cafeina, Linguagem[] linguagens, SistemaOperacional[] sistemas) {
        this.nome = nome;
        this.nivel_cafeina = nivel_cafeina;
        this.linguagens = linguagens;
        this.sistemas = sistemas;
    }

    public static void main(String[] args) {
        Programador dev = new Programador("Lucas", 95,
            new Linguagem[]{new Linguagem("Java"), new Linguagem("Python")},
            new SistemaOperacional[]{new SistemaOperacional("Linux"), new SistemaOperacional("Windows")}
        );

        System.out.println(dev.nome + " - Cafeína: " + dev.nivel_cafeina + "%");

        for (Linguagem l : dev.linguagens)
            System.out.println(l.getNome());

        for (SistemaOperacional s : dev.sistemas)
            System.out.println(s.getNome());
    }
}