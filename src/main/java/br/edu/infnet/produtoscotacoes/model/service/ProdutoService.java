package br.edu.infnet.produtoscotacoes.model.service;

import br.edu.infnet.produtoscotacoes.model.domain.Cotacao;
import br.edu.infnet.produtoscotacoes.model.domain.Produto;
import br.edu.infnet.produtoscotacoes.model.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> obterLista(){

        return (List<Produto>)produtoRepository.findAll();
    }


    public void excluir (Integer id) {
        produtoRepository.deleteById(id);
    }

    public Produto salvar (Produto produto){
        if (produto != null){
            if (produto.getId() == null){
                produtoRepository.save(produto);
                return produto;
            } else {
                Produto p = produtoRepository.findById(produto.getId()).get();
                if(p != null){
                    p.copiarValoresDe(produto);
                    return p;
                }
            }
        }
        return null;
    }

    public List<Produto> obterLista(Integer id){

        return (List<Produto>)produtoRepository.obterLista(id);
    }
}
