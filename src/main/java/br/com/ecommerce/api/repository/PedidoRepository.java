package br.com.ecommerce.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ecommerce.api.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{
    
}