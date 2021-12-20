package br.edu.infnet.produtoscotacoes.model.repository;

import br.edu.infnet.produtoscotacoes.model.domain.Cotacao;
import br.edu.infnet.produtoscotacoes.model.domain.Produto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto,Integer> {

    @Query ("from Produto p where p.cotacoes=:id")
    List<Produto> obterLista (Integer id);

}
