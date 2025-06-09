package ExemploEstudante;

import javax.swing.*;
import java.util.ArrayList;

public class EstudanteTest {

    public static void main(String[] args) {

        ArrayList<Estudante> estudantes = new ArrayList<>();

        for (int x = 0; x < 1; x++){
            System.out.println(x);
            String nomeTemp = JOptionPane.showInputDialog(null, "Digite o nome do aluno: ", "Cadastro", JOptionPane.QUESTION_MESSAGE);
            Integer matriculaTemp = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a matrícula do aluno: ", "Cadastro", JOptionPane.QUESTION_MESSAGE));
            String cursoTemp = JOptionPane.showInputDialog(null, "Digite o curso do aluno: ", "Cadastro", JOptionPane.QUESTION_MESSAGE);
            estudantes.add(new Estudante(nomeTemp, matriculaTemp, cursoTemp));
        }

        for (Estudante estudante : estudantes) {
            String format = estudante.nome + " " + estudante.matricula + " "  + estudante.curso;
            JOptionPane.showMessageDialog(null, format, "Aluno: ",JOptionPane.INFORMATION_MESSAGE);
        }

    }

}
