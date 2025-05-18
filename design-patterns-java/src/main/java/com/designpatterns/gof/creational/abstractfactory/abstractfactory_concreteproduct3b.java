package com.designpatterns.gof.creational.abstractfactory;

/**
 * Implementação concreta de documentação expressa
 */
public class ExpressDocumentation implements Documentation {

    @Override
    public String generateDocuments(String orderId) {
        return "Nota fiscal eletrônica e protocolo de entrega expressa gerados para o pedido " + orderId;
    }

    @Override
    public boolean isComplete() {
        return true;
    }

    @Override
    public String getType() {
        return "Documentação Expressa";
    }
}
