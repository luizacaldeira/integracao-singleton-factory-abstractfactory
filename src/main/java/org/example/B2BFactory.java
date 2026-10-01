package org.example;

public class B2BFactory implements ISegmentoFactory {

    private B2BFactory() {};
    private static B2BFactory instance = new B2BFactory();
    public static B2BFactory getInstance() {
        return instance;
    }

    @Override
    public IContrato createContrato() {
        return new ContratoB2B();
    }

    @Override
    public IFatura createFatura() {
        return new FaturaB2B();
    }
}