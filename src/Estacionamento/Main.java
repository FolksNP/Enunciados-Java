package Introducao.Estacionamento;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Estacionamento estacionamento = new Estacionamento();
    public static void main(String[] args){

        int opc = 1;
        while (opc == 1){

            System.out.println("1 - Entrar carro\n" + "2 - Sair carro\n" + "3 - Listar carros\n" + "0 - Sair do sistema");
            int opcSis = sc.nextInt();
            switch (opcSis){
                case 1:
                    System.out.println("Digite a placa do carro: ");
                    String placa = sc.next();
                    System.out.println("Digite o horario: ");
                    int hora = sc.nextInt();
                    estacionamento.entradaCarro(placa, hora);
                    break;
                case 2:

            }
        }

    }

}
