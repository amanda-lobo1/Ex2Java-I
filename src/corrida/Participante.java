package corrida;

public class Participante {
    private String nome, sobrenome;
    private String numeroCelular, numeroEmergencia;
    private String rg;
    private String tipoSanguineo;
    protected int idade;

    public Participante(String nome, String sobrenome, String numeroCelular, String numeroEmergencia,
                        String rg, String tipoSanguineo, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numeroCelular = numeroCelular;
        this.numeroEmergencia = numeroEmergencia;
        this.rg = rg;
        this.tipoSanguineo = tipoSanguineo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getNumeroEmergencia() {
        return numeroEmergencia;
    }

    public void setNumeroEmergencia(String numeroEmergencia) {
        this.numeroEmergencia = numeroEmergencia;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", numeroCelular='" + numeroCelular + '\'' +
                ", numeroEmergencia='" + numeroEmergencia + '\'' +
                ", rg='" + rg + '\'' +
                ", tipoSanguineo='" + tipoSanguineo + '\'' +
                ", idade=" + idade +
                '}';
    }
}
