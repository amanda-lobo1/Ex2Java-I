package corrida;

public class Main {
    public static void main(String[] args) {
        Participante p1 = new Participante("Amanda", "Lobo", "00 000000000",
                "00 000000000", "00.000.000-0", "A+", 18);
        Participante p2 = new Participante("Anne", "Miller", "00 000000000",
                "00 000000000", "00.000.000-0", "B+", 16);
        Participante p3 = new Participante("Austin", "Gomes", "00 000000000",
                "00 000000000", "00.000.000-0", "AB+", 30);
        Participante p4 = new Participante("Ryan", "Backer", "00 000000000",
                "00 000000000", "00.000.000-0", "O+", 12);

        System.out.println("Circuito Pequeno:");
        Categoria categoria1 = new Categoria("pequeno");
        Inscricao inscricao1 = new Inscricao(p1, categoria1.getTipoCategoria());
        categoria1.addInscricao(inscricao1);
        System.out.println(categoria1.toString());

        System.out.println("\nCircuito Médio:");
        Categoria categoria2 = new Categoria("medio");
        Inscricao inscricao2 = new Inscricao(p2, categoria2.getTipoCategoria());
        categoria2.addInscricao(inscricao2);
        System.out.println(categoria2.toString());

        System.out.println("\nCircuito Avançado:");
        Categoria categoria3 = new Categoria("avancado");
        Inscricao inscricao3 = new Inscricao(p3, categoria3.getTipoCategoria());
        Inscricao inscricao4 = new Inscricao(p4, categoria3.getTipoCategoria());
        categoria3.addInscricao(inscricao3);
        categoria3.addInscricao(inscricao4);
        System.out.println(categoria3.toString());





    }
}
