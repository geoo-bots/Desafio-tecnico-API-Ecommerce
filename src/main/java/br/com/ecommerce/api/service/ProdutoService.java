package br.com.ecommerce.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ecommerce.api.model.Produto;
import br.com.ecommerce.api.repository.ProdutoRepository;


@Service
public class ProdutoService {
  
    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto salvarProduto(Produto produto){
        return produtoRepository.save(produto);
    }

    public List<Produto> consultarProdutos(){
        return produtoRepository.findAll();
    }

    public Optional<Produto> consultarProdutoPeloId(Long id){
        return produtoRepository.findById(id);
    } 

    public void deletarProduto(Long id){
        produtoRepository.deleteById(id);
    }

}
