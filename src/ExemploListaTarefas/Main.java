package ExemploListaTarefas;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ListaTarefas listaTarefas = new ListaTarefas();

    public static void main(String[] args) {
        int continua = 1;
        while (continua != 0){
            Menu.menuPrincipal();
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
                    listaTarefas.busca();
                    break;
                case 5:
                    listaTarefas.criarTags();
                    break;
                case 0:
                    continua = 0;
                    System.out.println("Encerrando... ");
                    break;
                default:
                    Menu.menuPrincipal();
                    break;
            }

        }

    }

}
