package com.dio.Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public abstract class CalculatorForm extends JFrame {

    private static final int TAMANHO_TXT = 10;

    protected JPanel pnlForm;
    protected JPanel pnlRodape;

    protected JButton btnCalcular;
    protected JButton btnLimpar;
    protected JButton btnFechar;

    //Valor
    protected  JLabel lblValor;
    protected JTextField txtValor;
    //Valor2
    protected  JLabel lblValor2;
    protected JTextField txtValor2;
    //Resultado
    protected  JLabel lblResultado;
    protected JTextField txtResultado;

    public CalculatorForm() {
        this.inicializar();
        this.eventos();
    }

    private void inicializar() {
        this.setTitle("Calculadora Composta");

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.getContentPane().setLayout(new BorderLayout());
        this.setResizable(true);


        this.getContentPane().add(getPnlForm(), BorderLayout.CENTER);
        this.getContentPane().add(getPnlRodape(), BorderLayout.PAGE_END);
        this.pack();
    }

    protected abstract void btnCalcularclick(ActionEvent ev);
    protected abstract void btnLimparlick(ActionEvent ev);
    protected abstract void btnFechaclick(ActionEvent ev);

    private void eventos() {
        btnCalcular.addActionListener(this::btnFechaclick);
        btnLimpar.addActionListener(this::btnFechaclick);
        btnFechar.addActionListener(this::btnFechaclick);
    }

    public JPanel getPnlForm() {
        if(pnlForm == null) {
            pnlForm = new JPanel(new GridLayout(4, 2));

            lblValor = new JLabel("Valor");
            txtValor = new JTextField(TAMANHO_TXT);

            lblValor2 = new JLabel("Valor2");
            txtValor2 = new JTextField(TAMANHO_TXT);

            lblResultado = new JLabel("Resultado");
            txtResultado = new JTextField(20);
            txtResultado.setEditable(true);

            pnlForm.add(lblValor);
            pnlForm.add(txtValor);

            pnlForm.add(lblValor2);
            pnlForm.add(txtValor2);

            pnlForm.add(lblResultado);
            pnlForm.add(txtResultado);
        }
        return pnlForm;
    }

    public JPanel getPnlRodape() {
        if(pnlRodape == null) {
            pnlRodape = new JPanel(new FlowLayout(FlowLayout.CENTER));

            btnCalcular = new JButton("Calcular");
            btnLimpar = new JButton("Limpar");
            btnFechar = new JButton("Fechar");

            pnlRodape.add(btnCalcular);
            pnlRodape.add(btnLimpar);
            pnlRodape.add(btnFechar);
        }
        return pnlRodape;
    }
}
