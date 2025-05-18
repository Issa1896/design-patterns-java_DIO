package com.designpatterns.gof.creational.abstractfactory;

/**
 * Interface para o produto abstrato TextField.
 * Define o comportamento comum para todos os campos de texto, independente do tema.
 */
public interface TextField {
    
    /**
     * Renderiza o campo de texto na interface do usuário
     * 
     * @param placeholder Texto de placeholder a ser exibido
     */
    void render(String placeholder);
    
    /**
     * Processa o evento de entrada de dados no campo
     * 
     * @param text Texto digitado pelo usuário
     */
    void onInput(String text);
}
