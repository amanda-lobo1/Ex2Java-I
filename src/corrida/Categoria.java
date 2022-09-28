package corrida;

import java.util.ArrayList;

public class Categoria {
    private String tipoCategoria;
    private ArrayList<Inscricao> inscricao;

    public String getTipoCategoria() {
        return tipoCategoria;
    }

    public Categoria(String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
        this.inscricao = new ArrayList<>();
    }

    public void addInscricao(Inscricao inscricao){
       this.inscricao.add(inscricao);
    }
    @Override
    public String toString() {
        return "inscricoes:" + this.inscricao;
    }
}
