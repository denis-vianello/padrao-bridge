/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancobridge;

/**
 *
 * @author PICHAU
 */
public class Transferencia extends OperacaoBancaria {

    public Transferencia(pagamento pagamento) {
        super(pagamento);
    }

    @Override
    public String executar(double valor) {
        return "Transferência: " + pagamento.processarPagamento(valor);
    }
}
