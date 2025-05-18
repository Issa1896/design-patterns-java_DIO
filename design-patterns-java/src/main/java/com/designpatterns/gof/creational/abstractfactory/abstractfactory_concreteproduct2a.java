package com.designpatterns.gof.creational.abstractfactory;

/**
 * Implementação concreta de embalagem padrão
 */
public class StandardPackaging implements Packaging {
    
    private static final double COST = 5.0;

    @Override
    public String pack(String itemName) {
        return "Item '" + itemName + "' embalado com caixa de papelão padrão";
    }

    @Override
    public double getCost() {
        return COST;
    }

    @Override
    public String getType() {
        return "Embalagem Padrão (Caixa de Papelão)";
    }
}
