package com.dio.Calculadora;

import javax.swing.*;

public class Aplicação {

    public static void main(String[] args) {
        //Este metodo é responsavel por não travar a aplicação(chama uma tela dentro de uma tred)
        SwingUtilities.invokeLater(() -> {
            Calculator calc = new Calculator();
            calc.setVisible(true);
        });
    }
}


