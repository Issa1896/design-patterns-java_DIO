package com.designpatterns.gof.creational.abstractfactory;

/**
 * Implementação concreta da fábrica para processamento de pedidos expressos
 */
public class ExpressOrderProcessingFactory implements OrderProcessingFactory {

    @Override
    public ShippingService createShippingService() {
        return new ExpressShippingService();
    }

    @Override
    public Packaging createPackaging() {
        return new PremiumPackaging();
    }

    @Override
    public Documentation createDocumentation() {
        return new ExpressDocumentation();
    }
    
    @Override
    public String getProcessingType() {
        return "Processamento de Pedido Expresso";
    }
}
