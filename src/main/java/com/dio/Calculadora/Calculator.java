package com.dio.Calculadora;

import java.awt.event.ActionEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator extends CalculatorForm {

    private BigDecimal toBigDecimal(String valor) {
        try{
            return new BigDecimal(valor).setScale(4, RoundingMode.HALF_EVEN);
        }catch (Exception ex) {
            return BigDecimal.ZERO;
        }
    }

    @Override
    protected void btnCalcularclick(ActionEvent ev) {
        BigDecimal valor = toBigDecimal(txtValor.getText());
        BigDecimal valor2 = toBigDecimal(txtValor.getText());
        BigDecimal Resultado = toBigDecimal(txtResultado.getText());
        
        //Valor + Valor (1 + Resultado)
        BigDecimal resultado = valor.divide(new BigDecimal(100), RoundingMode.HALF_EVEN);
        resultado = resultado.add(BigDecimal.ONE);
        resultado = resultado.pow(valor2.intValue());
        resultado = resultado.multiply(valor);
        resultado = resultado.setScale(2, RoundingMode.HALF_EVEN);
        
        txtResultado.setText(resultado.toPlainString());
    }

    @Override
    protected void btnLimparlick(ActionEvent ev) {
        txtValor.setText("");
        txtValor.setText("");
        txtResultado.setText("");
    }

    @Override
    protected void btnFechaclick(ActionEvent ev) {
        this.setVisible(false);
        this.dispose();
    }
}
