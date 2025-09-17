
## Descrição

Este projeto Java implementa o padrão de projeto Strategy para cálculo de frete. O usuário pode escolher entre diferentes métodos de envio:

- Transportadora
- Correios
- Retirada Local

Cada método possui um algoritmo próprio para calcular o custo do frete.

## Estrutura do Projeto

- `src/ShippingStrategy.java`: Interface do padrão Strategy
- `src/CarrierShipping.java`: Estratégia para transportadora
- `src/PostalServiceShipping.java`: Estratégia para correios
- `src/LocalPickup.java`: Estratégia para retirada local
- `src/ShippingContext.java`: Contexto para seleção da estratégia
- `src/Main.java`: Aplicação principal

## Como Executar

1. Compile todos os arquivos Java na pasta `src`:
   ```bash
   javac src/*.java
   ```
2. Execute o programa principal:
   ```bash
   java -cp src Main
   ```


