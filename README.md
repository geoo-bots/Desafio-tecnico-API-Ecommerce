# 🛒 API de E-commerce - Desafio Técnico

API RESTful desenvolvida com **Java** e **Spring Boot** para gerenciamento de produtos e pedidos.

## 📋 Funcionalidades

- **Produtos:** Cadastro e listagem de produtos.
- **Pedidos:** Criação de pedidos com itens associados.
- 
  -----------------------------------------------------

  ## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot
- MySql
---------------------------------------------------------

COMO RODAR:
1. Clone o repositorio.
2. Configure o banco no application.properties.
3. Rode o projeto na sua IDE (utilizei VsCode)

---------------------------------------------------------

COMO TESTAR (POSTMAN):

TESTE 1: CADASTRAR PRODUTO
<br>
Rota: POST /produtos
<br>
JSON para enviar:
<pre>
{
  "nome": "Mouse",
  "preco": 50.0
}
</pre>
<br>

TESTE 2: CRIAR PEDIDO
<br>
Rota: POST /pedidos
<br>
JSON para enviar:
<pre>
{
  "produtos": [
    {
      "id": 1,
      "preco": 50.0
    }
  ]
}
</pre>
<br>

TESTE 3: CRIAR PEDIDO COM VALOR ACIMA DE 200
<br>
Rota: POST /pedidos
<br>
JSON para enviar:
<pre>
{
  "produtos": [
    { "id": 1, "preco": 50.0 },
    { "id": 1, "preco": 50.0 },
    { "id": 1, "preco": 50.0 },
    { "id": 1, "preco": 60.0 }
  ]
}
</pre>
