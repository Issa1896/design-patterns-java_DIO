package com.designpatterns.gof.creational.abstractfactory;

/**
 * Interface para o serviço de frete - um dos produtos na família de produtos
 */
public interface ShippingService {
    
    /**
     * Calcula o custo do frete para a entrega
     * 
     * @param weight Peso do pacote em kg
     * @param distance Distância em km
     * @return Custo do frete em R$
     */
    double calculateCost(double weight, double distance);
    
    /**
     * Retorna o tempo estimado de entrega em dias
     * 
     * @param distance Distância em km
     * @return Tempo estimado em dias
     */
    int getEstimatedDeliveryTime(double distance);
    
    /**
     * Retorna o nome do serviço de entrega
     * 
     * @return Nome do serviço
     */
    String getServiceName();
}
