package com.designpatterns.gof.creational.abstractfactory;

/**
 * Interface para a documentação - um dos produtos na família de produtos
 */
public interface Documentation {
    
    /**
     * Gera a documentação necessária para o pedido
     * 
     * @param orderId ID do pedido
     * @return Descrição dos documentos gerados
     */
    String generateDocuments(String orderId);
    
    /**
     * Verifica se toda a documentação está completa
     * 
     * @return true se a documentação está completa, false caso contrário
     */
    boolean isComplete();
    
    /**
     * Retorna o tipo de documentação
     * 
     * @return Tipo de documentação
     */
    String getType();
}
