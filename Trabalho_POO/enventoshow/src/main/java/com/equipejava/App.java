package com.equipejava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class App implements ActionListener{
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JTextField nomeEventoCampo;
    private JLabel dataEventoTexto;
    private JLabel nomeEventoTexto;
    private JTextField dataEventoCampo;
    private JLabel localEventoTexto;
    private JLabel responsavelEventoTexto;
    private JTextField localEventoCampo;
    private JTextField responsavelEventoCampo;
    private JLabel feedback;
    private Gerenciador gerenciador = new Gerenciador();

    public App() {
        frame = new JFrame("Gerenciador de Eventos");

        panel = new JPanel();
        panel.setLayout(null);

        nomeEventoTexto = new JLabel("Nome do evento:  ");
        nomeEventoTexto.setBounds(10, 20, 100, 25);
        panel.add(nomeEventoTexto);

        nomeEventoCampo = new JTextField();
        nomeEventoCampo.setBounds(120, 20, 100, 25);
        panel.add(nomeEventoCampo);

        dataEventoTexto = new JLabel("Data do evento: ");
        dataEventoTexto.setBounds(10, 50, 100, 25);
        panel.add(dataEventoTexto);

        dataEventoCampo = new JTextField();
        dataEventoCampo.setBounds(120, 50, 100, 25);
        panel.add(dataEventoCampo);

        localEventoTexto = new JLabel("Local do evento: ");
        localEventoTexto.setBounds(10, 80, 100, 25);
        panel.add(localEventoTexto);

        localEventoCampo = new JTextField();
        localEventoCampo.setBounds(120, 80, 100, 25);
        panel.add(localEventoCampo);

        responsavelEventoTexto = new JLabel("Responsável do evento: ");
        responsavelEventoTexto.setBounds(10, 110, 150, 25);
        panel.add(responsavelEventoTexto);

        responsavelEventoCampo = new JTextField();
        responsavelEventoCampo.setBounds(160, 110, 100, 25);
        panel.add(responsavelEventoCampo);

        button = new JButton("Cadastrar");
        button.setBounds(10, 140, 100, 25);
        button.addActionListener((ActionListener) this);
        panel.add(button);

        feedback = new JLabel("");
        feedback.setBounds(10, 170, 2000, 50);
        panel.add(feedback);

        frame.add(panel);
        frame.setSize(600, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new App();
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        String nome;
        String data;
        String local;
        String responsavel;
        nome = nomeEventoCampo.getText();
        data = dataEventoCampo.getText();
        local = localEventoCampo.getText();
        responsavel = responsavelEventoCampo.getText();
        gerenciador.addEvento(nome, data, local,responsavel);
        feedback.setText(gerenciador.showEventos());
    }
}