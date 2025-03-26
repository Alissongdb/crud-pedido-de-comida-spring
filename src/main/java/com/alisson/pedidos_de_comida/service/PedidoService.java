package com.alisson.pedidos_de_comida.service;

import com.alisson.pedidos_de_comida.entity.Pedido;
import com.alisson.pedidos_de_comida.repository.PedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    public List<Pedido> buscarPedidos (Pedido pedido) {
        return pedidoRepository.findAll();
    }

    public Pedido CriarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

}
