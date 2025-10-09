#  Projeto Sistema de Pedidos

##  Descrição

Este projeto é um **sistema de pedidos de produtos**, desenvolvido com foco em **modelagem de dados e relacionamento entre entidades**. Ele simula a estrutura de um **e-commerce simples**, permitindo o gerenciamento de usuários, produtos, categorias, pedidos, pagamentos e itens de pedidos.

O sistema foi construído com base em um **modelo conceitual e de domínio** (UML), servindo como base para aplicações em Java com JPA/Hibernate.

---

##  Modelo Conceitual

O diagrama abaixo representa as entidades do sistema e seus relacionamentos principais:

- **User** → representa o cliente que faz o pedido.  
- **Order** → representa o pedido em si.  
- **OrderItem** → conecta um pedido a um produto específico, armazenando quantidade e preço.  
- **Product** → representa os produtos disponíveis na loja.  
- **Category** → agrupa os produtos por tipo.  
- **Payment** → representa o pagamento vinculado a um pedido.  
- **OrderStatus (enum)** → define o estado atual do pedido.

 **Relacionamentos principais:**
- Um **usuário** pode ter vários **pedidos**.  
- Um **pedido** pode ter vários **itens (OrderItem)**.  
- Cada **produto** pode pertencer a várias **categorias**.  
- Um **pedido** pode ter **um pagamento** associado (ou nenhum).

---

##  Estrutura das Entidades

### 🧍‍♂️ User
| Atributo | Tipo | Descrição |
|-----------|------|-----------|
| id | Integer | Identificador único |
| name | String | Nome do cliente |
| email | String | E-mail do cliente |
| phone | String | Telefone |
| password | String | Senha de acesso |

---

###  Product
| Atributo | Tipo | Descrição |
|-----------|------|-----------|
| id | Integer | Identificador único |
| name | String | Nome do produto |
| description | String | Descrição do produto |
| price | Double | Preço |
| imgUrl | String | URL da imagem do produto |

---

###  Category
| Atributo | Tipo | Descrição |
|-----------|------|-----------|
| id | Integer | Identificador único |
| name | String | Nome da categoria |

---

###  Order
| Atributo | Tipo | Descrição |
|-----------|------|-----------|
| id | Integer | Identificador único |
| moment | Date | Data e hora do pedido |
| orderStatus | Enum (OrderStatus) | Status atual do pedido |

**Método:**  
`total()` → Calcula o valor total do pedido.

---

###  OrderItem
| Atributo | Tipo | Descrição |
|-----------|------|-----------|
| quantity | Integer | Quantidade do produto no pedido |
| price | Double | Preço do item |

**Método:**  
`subTotal()` → Calcula o subtotal do item (quantidade × preço).

---

###  Payment
| Atributo | Tipo | Descrição |
|-----------|------|-----------|
| id | Integer | Identificador único |
| moment | Date | Data e hora do pagamento |

---

###  OrderStatus (Enum)
| Valor | Descrição |
|--------|------------|
| WAITING_PAYMENT | Aguardando pagamento |
| PAID | Pago |
| SHIPPED | Enviado |
| DELIVERED | Entregue |
| CANCELED | Cancelado |

---

##  Exemplo de Instâncias (Banco de Teste)

### 🧍‍♂️ Usuários
| ID | Nome | E-mail | Telefone |
|----|-------|---------|-----------|
| 1 | Maria Brown | maria@gmail.com | 988888888 |
| 2 | Alex Green | alex@gmail.com | 977777777 |

---

###  Produtos
| ID | Nome | Preço | Categoria |
|----|-------|--------|-----------|
| 1 | The Lord of the Rings | 90.5 | Books |
| 2 | Smart TV | 2190.0 | Electronics |
| 3 | MacBook Pro | 1250.0 | Computers |
| 4 | PC Gamer | 1200.0 | Computers |
| 5 | Rails for Dummies | 100.99 | Books |

---

###  Pedidos e Pagamentos
| Pedido | Usuário | Status | Data | Pagamento |
|---------|----------|--------|-------|------------|
| 1 | Maria Brown | PAID | 2019-06-20T19:53:07Z | 2019-06-23T13:02:55Z |
| 2 | Maria Brown | WAITING_PAYMENT | 2019-07-21T03:42:10Z | — |
| 3 | Alex Green | WAITING_PAYMENT | 2019-07-22T15:21:22Z | — |

---

##  Tecnologias Recomendadas

Este projeto pode ser implementado com:
- **Java 17+**
- **Spring Boot**
- **JPA / Hibernate**
- **Maven**
- **H2 Database** ou **PostgreSQL**
- **Lombok**
- **Postman** (para testes da API)

