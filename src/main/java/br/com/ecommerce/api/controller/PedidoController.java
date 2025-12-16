package br.com.ecommerce.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ecommerce.api.model.Pedido;
import br.com.ecommerce.api.service.PedidoService;

@RestController
@RequestMapping(value="/pedidos")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public ResponseEntity<List<Pedido>>ListarPedidos(){
        return ResponseEntity.ok().body(pedidoService.consultarPedidos());
    }

     @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Pedido>>buscarPedidoPeloId(@PathVariable ("id") Long id){
        return ResponseEntity.ok().body(pedidoService.consultarPedidoPeloId(id));
    }

    @PostMapping 
    public ResponseEntity<Pedido> cadastrarPedido(@RequestBody Pedido pedido){
        return ResponseEntity.status(HttpStatus.CREATED).body(pedidoService.salvarPedido(pedido));
    }



}
