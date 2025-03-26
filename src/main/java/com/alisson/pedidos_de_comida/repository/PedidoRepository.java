package com.alisson.pedidos_de_comida.repository;

import com.alisson.pedidos_de_comida.entity.Item;
import com.alisson.pedidos_de_comida.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido,Long> {
}
