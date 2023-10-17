package main.java.list.operacoesbasicas;

public class Tarefa {
    //atributo
    private String descricao;

    public Tarefa (String descricaoTarefa) {
        this.descricao = descricaoTarefa;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}