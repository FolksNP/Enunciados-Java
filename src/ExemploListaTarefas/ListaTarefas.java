package ExemploListaTarefas;

import java.util.ArrayList;

public class ListaTarefas {

    private ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(String titulo, String descricao){
        tarefas.add(new Tarefa(titulo, descricao));
    }

    public ArrayList<Tarefa> getTarefas(){
        return tarefas;
    }

    public Boolean verificarTarefaExistente(String titulo, String descricao){
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getTitulo() == titulo && tarefa.getSituacao() == Boolean.FALSE){
                return false;
            }else{
                adicionarTarefa(titulo, descricao);
            }
        }
        return true;
    }
}
