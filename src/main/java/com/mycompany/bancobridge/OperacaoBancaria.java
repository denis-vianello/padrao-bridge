/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancobridge;

/**
 *
 * @author PICHAU
 */
public abstract class OperacaoBancaria {

    protected pagamento pagamento;

    public OperacaoBancaria(pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public abstract String executar(double valor);
}
