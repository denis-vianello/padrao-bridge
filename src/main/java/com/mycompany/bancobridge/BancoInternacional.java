/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancobridge;

/**
 *
 * @author PICHAU
 */
public class BancoInternacional implements pagamento {

    @Override
    public String processarPagamento(double valor) {
        return "Pagamento de R$ " + valor + " processado pelo Banco Internacional.";
    }
}