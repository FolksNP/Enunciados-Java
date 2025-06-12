package ExemploGeradorDeSenhas;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ManipulaSenha manipulador = new ManipulaSenha();

    public static void main(String[] args) {
        int cont = 1;
        while (cont != 0){
            Menu.menuPrincipal();
            cont = sc.nextInt();
            if (cont == 0){
                cont = 0;
                break;
            }
            System.out.print("Digite o tamanho minimo da senha: ");
            int min = sc.nextInt();
            Menu.menuTipoSenhas();
            int opc = sc.nextInt();
            System.out.print("Digite quantas senhas devemos gerar: ");
            int quantidade = sc.nextInt();
            for (int i = 0; i < quantidade; i++) {
                manipulador.gerarNovaSenha(min, opc);
            }
            manipulador.obterSenhas();
            manipulador.limparSenhas();
        }
    }

}
