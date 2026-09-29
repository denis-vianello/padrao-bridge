/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package bancoTest;

import com.mycompany.bancobridge.BancoInternacional;
import com.mycompany.bancobridge.BancoNacional;
import com.mycompany.bancobridge.Transferencia;
import com.mycompany.bancobridge.pagamento;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransferenciaTest {

    @Test
    void deveRealizarTransferenciaComBancoNacional() {
        pagamento pagamento = new BancoNacional();
        Transferencia transferencia = new Transferencia(pagamento);

        assertEquals(
            "Transferência: Pagamento de R$ 1000.0 processado pelo Banco Nacional.",
            transferencia.executar(1000.0)
        );
    }

    @Test
    void deveRealizarTransferenciaComBancoInternacional() {
        pagamento pagamento = new BancoInternacional();
        Transferencia transferencia = new Transferencia(pagamento);

        assertEquals(
            "Transferência: Pagamento de R$ 1000.0 processado pelo Banco Internacional.",
            transferencia.executar(1000.0)
        );
    }
}
