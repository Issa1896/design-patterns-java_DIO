package com.designpatterns.gof.creational.abstractfactory;

/**
 * Implementação concreta de serviço de frete padrão
 */
public class StandardShippingService implements ShippingService {
    
    private static final double BASE_COST = 10.0;
    private static final double COST_PER_KG = 1.5;
    private static final double COST_PER_KM = 0.03;
    private static final int BASE_DAYS = 5;
    private static final int DAYS_PER_1000_KM = 2;

    @Override
    public double calculateCost(double weight, double distance) {
        return BASE_COST + (weight * COST_PER_KG) + (distance * COST_PER_KM);
    }

    @Override
    public int getEstimatedDeliveryTime(double distance) {
        return BASE_DAYS + (int)(distance / 1000) * DAYS_PER_1000_KM;
    }

    @Override
    public String getServiceName() {
        return "Entrega Padrão";
    }
}
