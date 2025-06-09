package ExemploGeradorDeSenhas;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ManipulaSenha manipulador = new ManipulaSenha();

    public static void menuPrincipal(){
        System.out.println("1. Gerar nova senha");
        System.out.println("0. Encerrar sistema");
    }

    public static void menuTipoSenhas(){
        System.out.println("================= MENU =================");
        System.out.println("1. Apenas números");
        System.out.println("2. Apenas letras");
        System.out.println("3. Apenas caracteres especiais");
        System.out.println("4. Apenas números e letras");
        System.out.println("5. Apenas letras e caracteres especiais");
        System.out.println("6. Números, letras e caracteres especiais");
    }

    public static void main(String[] args) {
        int cont = 1;
        while (cont != 0){
            menuPrincipal();
            cont = sc.nextInt();
            if (cont == 0){
                cont = 0;
                break;
            }
            System.out.print("Digite o tamanho minimo da senha: ");
            int min = sc.nextInt();
            menuTipoSenhas();
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
