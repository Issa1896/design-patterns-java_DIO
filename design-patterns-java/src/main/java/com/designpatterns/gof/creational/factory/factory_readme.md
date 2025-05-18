# Padrão Factory Method

## Descrição
O padrão Factory Method define uma interface para criar um objeto, mas deixa as subclasses decidirem qual classe instanciar. O Factory Method permite que uma classe adie a instanciação para subclasses.

## Quando Usar
- Quando uma classe não pode antecipar a classe de objetos que deve criar
- Quando uma classe quer que suas subclasses especifiquem os objetos que criam
- Quando classes delegam responsabilidade para uma dentre várias subclasses auxiliares, e você quer localizar o conhecimento de qual subclasse auxiliar é a delegada

## Aplicação no Sistema de Pedidos
No nosso sistema de pedidos, usamos o Factory Method para criar diferentes tipos de pagamentos (cartão de crédito, boleto, PIX) sem especificar explicitamente suas classes.
