package org.example;

public class Venda {

    private ISegmentoFactory fabrica;

    public Venda(ISegmentoFactory fabrica) {
        this.fabrica = fabrica;
    }

    public String emitirContrato() {
        return fabrica.createContrato().gerar();
    }

    public String emitirFatura() {
        return fabrica.createFatura().gerar();
    }
}