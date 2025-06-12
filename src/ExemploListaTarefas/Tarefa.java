package ExemploListaTarefas;

public class Tarefa {

    private String titulo;
    private String descricao;
    private Boolean situacao;
    private Boolean dependeDeOutraTarefa;
    private Integer idTarefaAntecedente;

    public Tarefa(String titulo, String descricao, Boolean dependeDeOutraTarefa, Integer idTarefaAntecedente) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.situacao = Boolean.FALSE;
        this.dependeDeOutraTarefa = dependeDeOutraTarefa;
        this.idTarefaAntecedente = idTarefaAntecedente;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getDependeDeOutraTarefa() {
        return dependeDeOutraTarefa;
    }

    public void setDependeDeOutraTarefa(Boolean dependeDeOutraTarefa) {
        this.dependeDeOutraTarefa = dependeDeOutraTarefa;
    }

    public Integer getIdTarefaAntecedente() {
        return idTarefaAntecedente;
    }

    public void setIdTarefaAntecedente(Integer idTarefaAntecedente) {
        this.idTarefaAntecedente = idTarefaAntecedente;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }
}
