package ExemploListaTarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaTarefas {

    Scanner sc = new Scanner(System.in);
    ArrayList<Tarefa> tarefas = new ArrayList<>();
    String [] tags = new String[10];

    public void adicionarTarefa(){
        System.out.print("Digite o titulo da tarefa: ");
        String titulo = sc.nextLine();
        System.out.print("Digite a descricao da tarefa: ");
        String descricao = sc.nextLine();
        System.out.print("Esta tarefa depende que outra seja concluida? true/false: ");
        Boolean dependencia = sc.nextBoolean();
        int idAntecedente;
        if (dependencia == true){
            listarTarefas();
            System.out.print("Digite o id da tarefa que está depende da conclusão: ");
             idAntecedente = sc.nextInt();
        }else{
            idAntecedente = Integer.MIN_VALUE;
        }
        String [] addTags = adicionarTags();
        tarefas.add(new Tarefa(titulo, descricao, dependencia, idAntecedente, addTags));
    }

    public void criarTags() {
        for (int i = 0; i < tags.length; i++) {
            System.out.print("Digite a tag (ou pressione ENTER para parar): ");
            String tag = sc.nextLine();
            if (tag.isEmpty()) {
                break;
            }
            tags[i] = tag;
        }
    }

    public String[] adicionarTags() {
        System.out.println("Tags disponíveis:");
        for (int i = 0; i < tags.length; i++) {
            if (tags[i] != null) {
                System.out.printf("%d - %s\n", i, tags[i]);
            }
        }
        System.out.println("Selecione no máximo 5 tags pelo índice (digite -1 para parar):");
        ArrayList<String> tagsSelecionadas = new ArrayList<>();
        while (tagsSelecionadas.size() < 5) {
            System.out.print("Digite o índice da tag: ");
            int index = sc.nextInt();
            sc.nextLine();
            if (index == -1) {
                break;
            }
            if (index >= 0 && index < tags.length && tags[index] != null) {
                tagsSelecionadas.add(tags[index]);
            } else {
                System.out.println("Índice inválido ou tag inexistente.");
            }
        }
        return tagsSelecionadas.toArray(new String[0]);
    }

    public void concluirTarefa(){
        listarTarefas();
        System.out.println("Selecione a tarefa que deseja concluir: ");
        int id = sc.nextInt();
        Tarefa tarefaConcluida = tarefas.get(id);
        if (tarefaConcluida.getDependeDeOutraTarefa() == true){
            Tarefa tarefaDependente = tarefas.get(tarefaConcluida.getIdTarefaAntecedente());
            if (tarefaDependente.getSituacao() == Boolean.FALSE){
                System.out.println("Não é possivel concluir esta tarefa, pois a tarefa N° " + tarefaConcluida.getIdTarefaAntecedente() + " ainda não foi conluida.");
            }else{
                tarefaConcluida.setSituacao(Boolean.TRUE);
            }
        }else{
            tarefaConcluida.setSituacao(Boolean.TRUE);
        }
        listarTarefas();
    }

    public void listarTarefas() {
        Menu.menuListarTarefas();
        int opcList = sc.nextInt();
        switch (opcList){
            case 1:
                listarTodasAsTarefas();
                break;
            case 2:
                listarSomenteTodasAsTarefasEmAberto();
                break;
            case 3:
                listarSomenteTodasAsTarefasFechadas();
                break;
            default:
                System.out.println("Seleção inválida ");
                break;
        }

    }

    public void listarTodasAsTarefas(){
        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa tarefa = tarefas.get(i);
            String sit = (tarefa.getSituacao()) ? "Finalizada" : "Em aberto";
            System.out.println("-----------------------------");
            System.out.printf("Id: %d\nTitulo: %s\nDescricao: %s\nSituacao: %s\n", i, tarefa.getTitulo(), tarefa.getDescricao(), sit);
        }
    }

    public void listarSomenteTodasAsTarefasEmAberto(){
        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa tarefa = tarefas.get(i);
            if (tarefa.getSituacao() == Boolean.FALSE) {
                String sit = (tarefa.getSituacao()) ? "Finalizada" : "Em aberto";
                System.out.println("-----------------------------");
                System.out.printf("Id: %d\nTitulo: %s\nDescricao: %s\nSituacao: %s\n", i, tarefa.getTitulo(), tarefa.getDescricao(), sit);
            }
        }
    }

    public void listarSomenteTodasAsTarefasFechadas(){
        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa tarefa = tarefas.get(i);
            if (tarefa.getSituacao() == Boolean.TRUE) {
                String sit = (tarefa.getSituacao()) ? "Finalizada" : "Em aberto";
                System.out.println("-----------------------------");
                System.out.printf("Id: %d\nTitulo: %s\nDescricao: %s\nSituacao: %s\n", i, tarefa.getTitulo(), tarefa.getDescricao(), sit);
            }
        }
    }

    public void busca(){
        System.out.print("Digite alguma palavra ou frase que deseja encontrar em alguma tarefa: ");
        String buscar = sc.next();
        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa tarefa = tarefas.get(i);
            if (tarefa.getTitulo().contains(buscar)){
                String sit = (tarefa.getSituacao()) ? "Finalizada" : "Em aberto";
                System.out.println("-----------------------------");
                System.out.printf("Id: %d\nTitulo: %s\nDescricao: %s\nSituacao: %s\n", i, tarefa.getTitulo(), tarefa.getDescricao(), sit);
            }else{
                System.out.println("Tarefa não encontrada. ");
            }
        }
    }

}
