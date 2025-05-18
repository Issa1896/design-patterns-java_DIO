package com.designpatterns.gof.creational.abstractfactory;

/**
 * Implementação concreta de embalagem internacional
 */
public class InternationalPackaging implements Packaging {
    
    private static final double COST = 25.0;

    @Override
    public String pack(String itemName) {
        return "Item '" + itemName + "' embalado com proteção para transporte internacional e embalagem à prova d'água";
    }

    @Override
    public double getCost() {
        return COST;
    }

    @Override
    public String getType() {
        return "Embalagem Internacional (À prova d'água e impacto)";
    }
}
