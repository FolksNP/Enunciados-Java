package ExemploGeradorDeSenhas;

import java.util.Random;

public class Geradores {

    private Random rand = new Random();

    public Integer numeroAleatorio(){
        return rand.nextInt(9);
    }

    public String letraAleatoria() {
        char letra = (char) ('a' + rand.nextInt(26));
        return String.valueOf(letra);
    }

    public String caractereEspecialAleatorio() {
        String especiais = "!@#$%¨&*";
        int index = rand.nextInt(especiais.length());
        return String.valueOf(especiais.charAt(index));
    }

}
