package corrida;

import org.w3c.dom.ls.LSOutput;

public class Inscricao {
    private Participante participante;
    private String percurso;
    private Double valorInscricao;

    public Inscricao(Participante participante, String percurso) {
        this.participante = participante;
        this.percurso = percurso;
        this.setValorInscricao(calcularInscricao());
    }

    public Double calcularInscricao(){
        if (this.percurso == "pequeno"){
            if (participante.idade <= 17){
                return 1.300;
            } else {
                return 1.500;
            }
        } else if (this.percurso == "medio") {
            if (participante.idade <= 17){
                return 2.000;
            } else {
                return 2.300;
            }
        } else if (this.percurso == "avancado"){
            try {
                if (participante.idade <= 17){
                    return (Double.parseDouble("Incrição não permitida para menores de 18 anos!"));
                } else {
                    return 2.800;
                }
            } catch (NumberFormatException e){
                System.out.println("Inscrição não permitida para menores de 18 anos!");
            }
        }
        return null;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public String getPercurso() {
        return percurso;
    }

    public void setPercurso(String percurso) {
        this.percurso = percurso;
    }

    public Double getValorInscricao() {
        return valorInscricao;
    }

    public void setValorInscricao(Double valorInscricao) {
        this.valorInscricao = valorInscricao;
    }

    @Override
    public String toString() {
        return "Inscricao{" +
                "participante=" + participante +
                ", percurso='" + percurso + '\'' +
                ", valorInscricao=" + valorInscricao +
                '}';
    }
}
