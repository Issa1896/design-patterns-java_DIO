package com.designpatterns.gof.creational.factory;

/**
 * Implementação concreta da fábrica para pagamentos com boleto bancário
 */
public class BankSlipPaymentFactory implements PaymentFactory {
    
    private String customerName;
    private String cpf;
    private String dueDate;
    
    public BankSlipPaymentFactory(String customerName, String cpf, String dueDate) {
        this.customerName = customerName;
        this.cpf = cpf;
        this.dueDate = dueDate;
    }

    @Override
    public Payment createPayment(double amount) {
        return new BankSlipPayment(customerName, cpf, dueDate);
    }
}
