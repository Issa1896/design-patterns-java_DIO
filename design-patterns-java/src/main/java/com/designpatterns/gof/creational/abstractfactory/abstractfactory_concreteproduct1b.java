package com.designpatterns.gof.creational.abstractfactory;

/**
 * Implementação concreta de serviço de frete expresso
 */
public class ExpressShippingService implements ShippingService {
    
    private static final double BASE_COST = 25.0;
    private static final double COST_PER_KG = 2.5;
    private static final double COST_PER_KM = 0.05;
    private static final int BASE_DAYS = 1;
    private static final int DAYS_PER_2000_KM = 1;

    @Override
    public double calculateCost(double weight, double distance) {
        return BASE_COST + (weight * COST_PER_KG) + (distance * COST_PER_KM);
    }

    @Override
    public int getEstimatedDeliveryTime(double distance) {
        return BASE_DAYS + (int)(distance / 2000) * DAYS_PER_2000_KM;
    }

    @Override
    public String getServiceName() {
        return "Entrega Expressa";
    }
}
