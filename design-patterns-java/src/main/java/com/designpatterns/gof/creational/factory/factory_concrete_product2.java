package com.designpatterns.gof.creational.factory;

/**
 * Implementação concreta de pagamento via boleto bancário
 */
public class BankSlipPayment implements Payment {
    
    private String customerName;
    private String cpf;
    private String dueDate;
    
    public BankSlipPayment(String customerName, String cpf, String dueDate) {
        this.customerName = customerName;
        this.cpf = cpf;
        this.dueDate = dueDate;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Gerando boleto bancário no valor de R$" + amount);
        System.out.println("Cliente: " + customerName + " | CPF: " + cpf + " | Vencimento: " + dueDate);
        
        // Simulando código de barras do boleto
        String barCode = generateBarCode();
        System.out.println("Código de barras: " + barCode);
        
        System.out.println("Boleto gerado com sucesso! Aguardando pagamento.");
        return true; // Retorna true porque o boleto foi gerado com sucesso
    }

    @Override
    public String getPaymentDetails() {
        return "Pagamento via Boleto Bancário - Vencimento: " + dueDate;
    }
    
    /**
     * Gera um código de barras fictício para o boleto
     */
    private String generateBarCode() {
        StringBuilder barCode = new StringBuilder();
        for (int i = 0; i < 48; i++) {
            barCode.append((int) (Math.random() * 10));
        }
        return barCode.toString();
    }
}
