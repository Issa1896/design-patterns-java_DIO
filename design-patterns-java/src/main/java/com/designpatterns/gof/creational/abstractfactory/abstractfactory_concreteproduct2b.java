package com.designpatterns.gof.creational.abstractfactory;

/**
 * Implementação concreta de embalagem premium
 */
public class PremiumPackaging implements Packaging {
    
    private static final double COST = 15.0;

    @Override
    public String pack(String itemName) {
        return "Item '" + itemName + "' embalado com caixa reforçada e proteção extra";
    }

    @Override
    public double getCost() {
        return COST;
    }

    @Override
    public String getType() {
        return "Embalagem Premium (Reforçada)";
    }
}
