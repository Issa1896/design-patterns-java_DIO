package com.designpatterns.gof.creational.abstractfactory;

/**
 * Interface para o produto abstrato OrderPanel.
 * Define o comportamento comum para todos os painéis de pedido, independente do tema.
 */
public interface OrderPanel {
    
    /**
     * Renderiza o painel de pedido na interface do usuário
     */
    void render();
    
    /**
     * Exibe os detalhes de um pedido
     * 
     * @param orderId ID do pedido
     * @param customerName Nome do cliente
     * @param amount Valor do pedido
     */
    void displayOrderDetails(String orderId, String customerName, double amount);
}
