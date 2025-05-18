package com.designpatterns.gof.creational.abstractfactory;

/**
 * Interface da Abstract Factory para criar família de produtos relacionados
 * ao processamento de pedidos.
 */
public interface OrderProcessingFactory {
    
    /**
     * Cria um serviço de frete
     * 
     * @return O serviço de frete específico
     */
    ShippingService createShippingService();
    
    /**
     * Cria um serviço de embalagem
     * 
     * @return O serviço de embalagem específico
     */
    Packaging createPackaging();
    
    /**
     * Cria um serviço de documentação
     * 
     * @return O serviço de documentação específico
     */
    Documentation createDocumentation();
    
    /**
     * Retorna o nome do tipo de processamento
     * 
     * @return Nome do tipo de processamento
     */
    String getProcessingType();
}
