/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package bancoTest;

import com.mycompany.bancobridge.BancoNacional;
import com.mycompany.bancobridge.BancoInternacional;
import com.mycompany.bancobridge.Deposito;
import com.mycompany.bancobridge.pagamento;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepositoTest {

    @Test
    void deveRealizarDepositoComBancoNacional() {
        pagamento pagamento = new BancoNacional();
        Deposito deposito = new Deposito(pagamento);

        assertEquals(
            "Depósito: Pagamento de R$ 1000.0 processado pelo Banco Nacional.",
            deposito.executar(1000.0)
        );
    }

    @Test
    void deveRealizarDepositoComBancoInternacional() {
        pagamento pagamento = new BancoInternacional();
        Deposito deposito = new Deposito(pagamento);

        assertEquals(
            "Depósito: Pagamento de R$ 1000.0 processado pelo Banco Internacional.",
            deposito.executar(1000.0)
        );
    }
}
