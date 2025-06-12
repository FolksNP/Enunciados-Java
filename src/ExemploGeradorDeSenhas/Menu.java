package ExemploGeradorDeSenhas;

public class Menu {

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
        System.out.println("5. Apenas números e caracteres especiais");
        System.out.println("6. Apenas letras e caracteres especiais");
        System.out.println("7. Números, letras e caracteres especiais");
    }

}
