package ExemploGeradorDeSenhas;

import java.util.ArrayList;

public class ManipulaSenha {

    private ArrayList<Senha> senhas = new ArrayList<>();
    Geradores gerador = new Geradores();

    public void adicionarSenhasALista(String senhaGerada) {
        senhas.add(new Senha(senhaGerada));
    }

    public void gerarNovaSenha(int min, int selecao) {
        if (selecao == 1){
            apenasNumeros(min);
        }else if (selecao == 2){
            apenasLetras(min);
        }else if (selecao == 3){
            apenasCaracteresEspeciais(min);
        }else if (selecao == 4){
            apenasNumerosLetras(min);
        }else if (selecao == 5){
            apenasLetrasCaracteresEspeciais(min);
        }else if (selecao == 6){
            numerosLetrasCaracteresEspeciais(min);
        }else {
            System.out.println("ERRO - USUÁRIO BURRO - SELEÇÃO INVÁLIDA");
        }
    }

    public void apenasNumeros(int min) {
        String gerado = "";
        for (int i = 0; i < min; i++) {
            gerado = gerado.concat(String.valueOf(gerador.numeroAleatorio()));
        }
        adicionarSenhasALista(gerado);
    }

    public void apenasLetras(int min) {
        String gerado = "";
        for (int i = 0; i < min; i++) {
            gerado = gerado.concat(gerador.letraAleatoria());
        }
        adicionarSenhasALista(gerado);
    }

    public void apenasCaracteresEspeciais(int min) {
        String gerado = "";
        for (int i = 0; i < min; i++) {
            gerado = gerado.concat(gerador.caractereEspecialAleatorio());
        }
        adicionarSenhasALista(gerado);
    }

    public void apenasNumerosLetras(int min) {
        String gerado = "";
        for (int i = 0; i < min; i++) {
            if (i % 2 == 0) {
                gerado = gerado.concat(String.valueOf(gerador.numeroAleatorio()));
            } else {
                gerado = gerado.concat(gerador.letraAleatoria());
            }
        }
        adicionarSenhasALista(gerado);
    }

    public void apenasNumerosCaracteresEspeciais(int min) {
        String gerado = "";
        for (int i = 0; i < min; i++) {
            if (i % 2 == 0) {
                gerado = gerado.concat(String.valueOf(gerador.numeroAleatorio()));
            } else {
                gerado = gerado.concat(gerador.caractereEspecialAleatorio());
            }
        }
        adicionarSenhasALista(gerado);
    }

    public void apenasLetrasCaracteresEspeciais(int min) {
        String gerado = "";
        for (int i = 0; i < min; i++) {
            if (i % 2 == 0) {
                gerado = gerado.concat(gerador.letraAleatoria());
            } else {
                gerado = gerado.concat(gerador.caractereEspecialAleatorio());
            }
        }
        adicionarSenhasALista(gerado);
    }

    public void numerosLetrasCaracteresEspeciais(int min) {
        String gerado = "";
        int contTempSel = 1;
        for (int i = 0; i < min; i++) {
            if (contTempSel > 3){
                contTempSel = 1;
            }
            if (contTempSel == 1){
                gerado = gerado.concat(String.valueOf(gerador.numeroAleatorio()));
            }else if (contTempSel == 2){
                gerado = gerado.concat(gerador.letraAleatoria());
            }else if (contTempSel == 3){
                gerado = gerado.concat(gerador.caractereEspecialAleatorio());
            }
            contTempSel++;
        }
        adicionarSenhasALista(gerado);
    }

    public void obterSenhas() {
        System.out.print("\n");
        for (Senha senha : senhas) {
            System.out.printf("%d° Senha gerada: %s\n", senhas.indexOf(senha) + 1, senha.getSenha());
        }
        System.out.print("\n");
    }

    public void limparSenhas(){
        senhas.clear();
    }

}
