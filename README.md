# 🛒 API de E-commerce - Desafio Técnico

API RESTful desenvolvida com **Java** e **Spring Boot** para gerenciamento de produtos e pedidos.

## 📋 Funcionalidades

- **Produtos:** Cadastro e listagem de produtos.
- **Pedidos:** Criação de pedidos com itens associados.
- **Regra de Negócio:** Cálculo automático do valor total.
  - **Desconto:** Pedidos acima de **R$ 200,00** recebem automaticamente **10% de desconto**.

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- Banco de Dados (MySQL)
- Maven

## ⚙️ Como Executar

1. Clone o repositório: https://github.com/geoo-bots/Desafio-tecnico-API-Ecommerce.git
2. Configure o banco de dados no arquivo application.properties
3. Execute o projeto via IDE (Utilizei o VsCode)

##⚙️⚙️Como Testar
1. Cadastrar Produtos
   POST /produtos
   {
  "nome": "Mouse",
  "preco": 50.0
}

2. Criar Pedido
  POST /pedidos
{
    "produtos": [
        {
            "id": 1,
            "preco": 50.0
        }
    ]
}
           
