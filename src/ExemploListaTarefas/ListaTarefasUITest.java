package ExemploListaTarefas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListaTarefasUITest extends JDialog {
    private JPanel contentPane;
    private JButton btnAddTarefas;
    private JButton btnVerTarefas;
    private JLabel etiquetaTitulo;
    private JTextField entradaTituloTarefa;
    private JLabel etiquetaDescricao;
    private JTextArea entradaDescricao;
    ListaTarefas tarefas = new ListaTarefas();

    public ListaTarefasUITest() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnAddTarefas);

        // Adicionar Tarefa
        btnAddTarefas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Boolean situacao = tarefas.verificarTarefaExistente(entradaTituloTarefa.getText(), entradaDescricao.getText());
                String s = situacao ? "Cadastrado com sucesso" : "Tarefa já existente";
                JOptionPane.showMessageDialog(null, s);
            }
        });
        btnVerTarefas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        ListaTarefasUITest dialog = new ListaTarefasUITest();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

}
