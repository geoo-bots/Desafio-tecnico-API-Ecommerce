package br.com.ecommerce.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ecommerce.api.model.Produto;
import br.com.ecommerce.api.service.ProdutoService;

@RestController
@RequestMapping(value="/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public ResponseEntity<List<Produto>>ListarProdutos(){
        return ResponseEntity.ok().body(produtoService.consultarProdutos());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Produto>>buscarProdutoPeloId(@PathVariable ("id") Long id){
        return ResponseEntity.ok().body(produtoService.consultarProdutoPeloId(id));
    }

    @PostMapping 
    public ResponseEntity<Produto> cadastrarProduto(@RequestBody Produto produto){
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoService.salvarProduto(produto));
    }



     @PutMapping(value = "/{id}")
        public ResponseEntity<Produto>atualizarProduto(@PathVariable Long id, 
            @RequestBody Produto produto)
        {
            Optional <Produto> produtoExistente = produtoService.consultarProdutoPeloId(id);
            if(produtoExistente.isEmpty()){
                return ResponseEntity.notFound().build();
            }
            produto.setId(id);
        return ResponseEntity.ok().body(produtoService.salvarProduto(produto));
        }

    @DeleteMapping(value = "/{id}")
        public ResponseEntity<Void> excluirProduto(@PathVariable Long id){
            Optional<Produto> produtoExistente = produtoService.consultarProdutoPeloId(id);

            if(produtoExistente.isEmpty()){
                return ResponseEntity.notFound().build();
            }
            produtoService.deletarProduto(id);
            return ResponseEntity.noContent().build();
        }
}
