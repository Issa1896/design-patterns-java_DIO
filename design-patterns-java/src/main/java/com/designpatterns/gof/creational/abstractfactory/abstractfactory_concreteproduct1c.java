package com.designpatterns.gof.creational.abstractfactory;

/**
 * Implementação concreta de serviço de frete internacional
 */
public class InternationalShippingService implements ShippingService {
    
    private static final double BASE_COST = 50.0;
    private static final double COST_PER_KG = 5.0;
    private static final double COST_PER_KM = 0.08;
    private static final int BASE_DAYS = 7;
    private static final int DAYS_PER_3000_KM = 2;

    @Override
    public double calculateCost(double weight, double distance) {
        return BASE_COST + (weight * COST_PER_KG) + (distance * COST_PER_KM);
    }

    @Override
    public int getEstimatedDeliveryTime(double distance) {
        return BASE_DAYS + (int)(distance / 3000) * DAYS_PER_3000_KM;
    }

    @Override
    public String getServiceName() {
        return "Entrega Internacional";
    }
}
