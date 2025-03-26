package com.alisson.pedidos_de_comida.controller;

import com.alisson.pedidos_de_comida.entity.Pedido;
import com.alisson.pedidos_de_comida.service.PedidoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/pedido")
@Slf4j
public class PedidoController {

    private final PedidoService pedidoService;

    @GetMapping
    public ResponseEntity<List<Pedido>> buscarPedidos(Pedido pedido) {
        log.info("Listando pedidos");
        List<Pedido> listarPedidos = pedidoService.buscarPedidos(pedido);
        return ResponseEntity.status(HttpStatus.OK).body(listarPedidos);
    }

    @PostMapping
    public ResponseEntity<Pedido> criarPedido(@RequestBody Pedido pedido) {
        log.info("Criando novo pedido");
        Pedido novoPedido = pedidoService.CriarPedido(pedido);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoPedido);
    }
}
