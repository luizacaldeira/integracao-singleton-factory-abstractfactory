import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.*;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendaTest {

    @Test
    void deveEmitirContratoB2C() {
        Venda venda = new Venda(B2CFactory.getInstance());
        assertEquals("Contrato B2C gerado", venda.emitirContrato());
    }

    @Test
    void deveEmitirFaturaB2C() {
        Venda venda = new Venda(B2CFactory.getInstance());
        assertEquals("Fatura B2C gerada", venda.emitirFatura());
    }

    @Test
    void deveEmitirContratoB2B() {
        Venda venda = new Venda(B2BFactory.getInstance());
        assertEquals("Contrato B2B gerado", venda.emitirContrato());
    }

    @Test
    void deveEmitirFaturaB2B() {
        Venda venda = new Venda(B2BFactory.getInstance());
        assertEquals("Fatura B2B gerada", venda.emitirFatura());
    }

    @Test
    void mesmaInstanciaDeFabricaB2C() {
        assertSame(B2CFactory.getInstance(), B2CFactory.getInstance());
    }

    @Test
    void mesmaInstanciaDeFabricaB2B() {
        assertSame(B2BFactory.getInstance(), B2BFactory.getInstance());
    }
}