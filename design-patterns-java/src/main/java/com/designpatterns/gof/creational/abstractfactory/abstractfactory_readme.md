# Padrão Abstract Factory

## Descrição
O padrão Abstract Factory fornece uma interface para criar conjuntos (ou famílias) de objetos relacionados sem especificar suas classes concretas. Permite que um sistema seja independente de como seus produtos são criados, compostos e representados.

## Quando Usar
- Quando o sistema precisa ser independente de como seus produtos são criados
- Quando o sistema é configurado com múltiplas famílias de produtos
- Quando você quer fornecer uma biblioteca de produtos e só revelar suas interfaces, não suas implementações
- Quando famílias de produtos relacionados são projetadas para serem usadas juntas

## Aplicação no Sistema de Pedidos
No nosso sistema de pedidos, usamos o Abstract Factory para criar conjuntos de componentes relacionados a diferentes tipos de pedidos (padrão, express, internacional), cada um com seu próprio serviço de frete, embalagem e documentação.
