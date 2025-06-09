package ExemploListaTarefas;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ListaTarefas listaTarefas = new ListaTarefas();

    public static void menu(){
        System.out.println(" ----------------------- ");
        System.out.println("Selecione alguma ação: ");
        System.out.println("1 - Adicionar Tarefa");
        System.out.println("2 - Terminar Tarefa");
        System.out.println("3 - Listar Tarefas");
        System.out.println("4 - Sair");
    }

    public static void main(String[] args) {
        int continua = 1;
        while (continua != 4){
            menu();
            int opc = sc.nextInt();
            switch (opc){
                case 1:
                    listaTarefas.adicionarTarefa();
                    break;
                case 2:
                    listaTarefas.concluirTarefa();
                    break;
                case 3:
                    listaTarefas.listarTarefas();
                    break;
                case 4:
                    continua = 4;
                    break;
                default:
                    menu();
                    break;
            }

        }

    }

}
