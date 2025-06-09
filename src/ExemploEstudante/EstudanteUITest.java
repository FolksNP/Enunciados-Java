package ExemploEstudante;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EstudanteUITest extends JDialog {
    private JPanel contentPane;
    private JLabel etiquetaNome;
    private JTextField inputNome;
    private JLabel etiquetaMatricula;
    private JTextField entradaMatricula;
    private JTextField entradaCurso;
    private JLabel etiquetaCurso;
    private JButton btnCadastrar;
    private JButton buttonOK;
    Estudante estudante;

    public EstudanteUITest() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        // Botão para cadastrar alunos
        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                estudante = new Estudante(inputNome.getText(), Integer.parseInt(entradaMatricula.getText()), entradaCurso.getText());
                String format = estudante.nome + " " + estudante.matricula + " "  + estudante.curso;
                JOptionPane.showMessageDialog(null, format, "Aluno: ",JOptionPane.INFORMATION_MESSAGE);
            }
        });

    }

    public static void main(String[] args) {
        EstudanteUITest dialog = new EstudanteUITest();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
