package com.alisson.pedidos_de_comida.repository;

import com.alisson.pedidos_de_comida.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Long> {
}
