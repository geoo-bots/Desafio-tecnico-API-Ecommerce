package br.com.ecommerce.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ecommerce.api.model.Pedido;
import br.com.ecommerce.api.model.Produto;
import br.com.ecommerce.api.repository.PedidoRepository;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido salvarPedido(Pedido pedido){
        double total = 0.00;
        for(Produto item : pedido.getProdutos()){
            total += item.getPreco();
        }
        if(total > 200){
            double desc = total * 0.1;
            total = total - desc;
        }
        pedido.setValorTotal(total);
        return pedidoRepository.save(pedido);
    }

    public List<Pedido> consultarPedidos(){
        return pedidoRepository.findAll();
    }

    public Optional<Pedido> consultarPedidoPeloId(Long id){
        return pedidoRepository.findById(id);
    } 
}
