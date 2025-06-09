package Introducao.Estacionamento;

import java.util.ArrayList;

public class Estacionamento {

    public float primeiraHora = 5.00f;
    public float horasAdicionais = 2.00f;

    private ArrayList<Carro> carrosEstacionados;

    public Estacionamento() {
        this.carrosEstacionados = new ArrayList<>();
    }

    public boolean entradaCarro(String placa, Integer entrada){
        if (this.carrosEstacionados.size() > 10) {
            return false;
        }else{
            carrosEstacionados.add(new Carro(placa, entrada));
            return true;
        }
    }

    public void registrarSaida(String placa){
        carrosEstacionados.remove(placa);
    }

    public boolean sairCarro(String placa, int horaSaida) {
        for (Carro c : carrosEstacionados) {
            if (c.getPlaca().equals(placa)) {
                int tempo = horaSaida - c.getEntrada();
                int valor = 5 + (tempo > 1 ? (tempo - 1) * 2 : 0);
                System.out.println("Carro com placa " + placa + " saiu às " + horaSaida + "h.");
                System.out.println("Tempo: " + tempo + "h - Valor a pagar: R$" + valor);
                carrosEstacionados.remove(c);
                return true;
            }
        }
        System.out.println("Carro com placa " + placa + " não encontrado.");
        return false;
    }

    public ArrayList<Carro> carrosEstacionados(){
        return carrosEstacionados;
    }

}
