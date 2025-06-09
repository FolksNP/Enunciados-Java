package Introducao.Estacionamento;

public class Carro {

    private String placa;
    private Integer entrada;
    private Integer saida;

    public Carro(String placa, Integer entrada) {
        this.placa = placa;
        this.entrada = entrada;
    }

    public String getPlaca() {
        return placa;
    }

    public Integer getEntrada() {
        return entrada;
    }

    public void setSaida(Integer saida) {
        this.saida = saida;
    }

    public Integer getSaida() {
        return saida;
    }

}
