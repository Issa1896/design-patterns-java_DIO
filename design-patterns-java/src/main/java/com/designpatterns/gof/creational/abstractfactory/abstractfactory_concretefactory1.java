package com.designpatterns.gof.creational.abstractfactory;

/**
 * Implementação concreta da fábrica para processamento de pedidos padrão
 */
public class StandardOrderProcessingFactory implements OrderProcessingFactory {

    @Override
    public ShippingService createShippingService() {
        return new StandardShippingService();
    }

    @Override
    public Packaging createPackaging() {
        return new StandardPackaging();
    }

    @Override
    public Documentation createDocumentation() {
        return new StandardDocumentation();
    }
    
    @Override
    public String getProcessingType() {
        return "Processamento de Pedido Padrão";
    }
}
