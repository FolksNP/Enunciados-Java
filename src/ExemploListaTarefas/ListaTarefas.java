package ExemploListaTarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaTarefas {

    Scanner sc = new Scanner(System.in);
    ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(){
        System.out.println("Digite o titulo da tarefa");
        String titulo = sc.nextLine();
        System.out.println("Digite a descricao da tarefa");
        String descricao = sc.nextLine();
        tarefas.add(new Tarefa(titulo, descricao));
    }

    public void concluirTarefa(){
        listarTarefas();
        System.out.println("Selecione a tarefa que deseja concluir: ");
        int id = sc.nextInt();
        Tarefa tarefaConcluida = tarefas.get(id);
        tarefaConcluida.setSituacao(Boolean.TRUE);
        listarTarefas();
    }

    public void listarTarefas() {
        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa tarefa = tarefas.get(i);
            System.out.println("-----------------------------");
            System.out.printf("Id: %d\nTitulo: %s\nDescricao: %s\nSituacao: %b\n", i, tarefa.getTitulo(), tarefa.getDescricao(), tarefa.getSituacao());
        }
    }

}
