package com.designpatterns.gof.creational.singleton;

/**
 * Implementação do padrão Singleton usando inicialização preguiçosa (lazy initialization)
 * com bloqueio duplo para thread safety.
 */
public class OrderRegistry {
    
    // A instância única é armazenada como um campo estático privado
    private static volatile OrderRegistry instance;
    
    // Contador de pedidos para demonstrar que é a mesma instância
    private int orderCount;
    
    // Construtor privado impede a instanciação externa
    private OrderRegistry() {
        System.out.println("Criando uma nova instância do OrderRegistry");
        orderCount = 0;
    }
    
    /**
     * Método estático para obter a instância única do OrderRegistry.
     * Usa inicialização preguiçosa com bloqueio duplo para garantir
     * thread safety com bom desempenho.
     */
    public static OrderRegistry getInstance() {
        // Primeira verificação (sem bloqueio)
        if (instance == null) {
            // Bloqueio na classe para sincronização
            synchronized (OrderRegistry.class) {
                // Segunda verificação (com bloqueio)
                if (instance == null) {
                    instance = new OrderRegistry();
                }
            }
        }
        return instance;
    }
    
    /**
     * Registra um novo pedido e retorna o ID do pedido
     */
    public int registerNewOrder(String customerName, double amount) {
        orderCount++;
        System.out.println("Pedido #" + orderCount + " registrado para " + customerName + 
                          " no valor de R$" + amount);
        return orderCount;
    }
    
    /**
     * Retorna o número total de pedidos registrados
     */
    public int getTotalOrders() {
        return orderCount;
    }
}
