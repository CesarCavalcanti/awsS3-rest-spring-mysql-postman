package br.edu.infnet.produtoscotacoes.controller;

import br.edu.infnet.produtoscotacoes.model.domain.Produto;
import br.edu.infnet.produtoscotacoes.model.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> obterLista(){
        return produtoService.obterLista();
    }

    @PostMapping
    public Produto salvar (@RequestBody Produto produto){
        Produto p = produtoService.salvar(produto);
        return p;
    }

    @PutMapping
    public Produto atualizar (@RequestBody Produto produto){
        Produto p = produtoService.salvar(produto);
        return p;
    }

    @DeleteMapping
    public void deletar (@RequestBody Produto produto){
        produtoService.excluir(produto.getId());
    }

    @GetMapping(value = "/{id}")
    public List<Produto> buscarPorProduto (@PathVariable Integer id){
        return  produtoService.obterLista(id);
    }

}
