package com.designpatterns.gof.creational.abstractfactory;

/**
 * Implementação concreta da fábrica para processamento de pedidos internacionais
 */
public class InternationalOrderProcessingFactory implements OrderProcessingFactory {

    @Override
    public ShippingService createShippingService() {
        return new InternationalShippingService();
    }

    @Override
    public Packaging createPackaging() {
        return new InternationalPackaging();
    }

    @Override
    public Documentation createDocumentation() {
        return new InternationalDocumentation();
    }
    
    @Override
    public String getProcessingType() {
        return "Processamento de Pedido Internacional";
    }
}
