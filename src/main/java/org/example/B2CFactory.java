package org.example;

public class B2CFactory implements ISegmentoFactory {

    private B2CFactory() {};
    private static B2CFactory instance = new B2CFactory();
    public static B2CFactory getInstance() {
        return instance;
    }

    @Override
    public IContrato createContrato() {
        return new ContratoB2C();
    }

    @Override
    public IFatura createFatura() {
        return new FaturaB2C();
    }
}