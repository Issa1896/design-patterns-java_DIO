package com.designpatterns.gof.creational.singleton;

/**
 * Demonstração do padrão Singleton no sistema de pedidos
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("Demonstração do padrão Singleton");
        System.out.println("================================");
        
        // Simulando diferentes partes do sistema acessando o mesmo registro de pedidos
        
        System.out.println("\nAcessando o registro a partir do módulo de vendas:");
        OrderRegistry salesModule = OrderRegistry.getInstance();
        salesModule.registerNewOrder("João Silva", 150.50);
        
        System.out.println("\nAcessando o registro a partir do módulo financeiro:");
        OrderRegistry financeModule = OrderRegistry.getInstance();
        financeModule.registerNewOrder("Maria Souza", 299.99);
        
        System.out.println("\nAcessando o registro a partir do módulo de logística:");
        OrderRegistry logisticsModule = OrderRegistry.getInstance();
        logisticsModule.registerNewOrder("Carlos Ferreira", 599.50);
        
        // Verificando que todos os módulos compartilham a mesma instância
        System.out.println("\nVerificando o total de pedidos em cada 'instância':");
        System.out.println("Módulo de vendas: " + salesModule.getTotalOrders() + " pedidos");
        System.out.println("Módulo financeiro: " + financeModule.getTotalOrders() + " pedidos");
        System.out.println("Módulo de logística: " + logisticsModule.getTotalOrders() + " pedidos");
        
        // Prova de que todas as variáveis apontam para a mesma instância
        System.out.println("\nVerificação de identidade das instâncias:");
        System.out.println("salesModule == financeModule: " + (salesModule == financeModule));
        System.out.println("financeModule == logisticsModule: " + (financeModule == logisticsModule));
        
        System.out.println("\nConclusão: Todas as variáveis apontam para a mesma instância do OrderRegistry.");
    }
}
