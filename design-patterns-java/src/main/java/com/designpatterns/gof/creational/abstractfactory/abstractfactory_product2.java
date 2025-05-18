package com.designpatterns.gof.creational.abstractfactory;

/**
 * Interface para o serviço de embalagem - um dos produtos na família de produtos
 */
public interface Packaging {
    
    /**
     * Prepara a embalagem para um item
     * 
     * @param itemName Nome do item a ser embalado
     * @return Descrição da embalagem
     */
    String pack(String itemName);
    
    /**
     * Retorna o custo da embalagem
     * 
     * @return Custo em R$
     */
    double getCost();
    
    /**
     * Retorna o tipo de embalagem
     * 
     * @return Tipo de embalagem
     */
    String getType();
}
