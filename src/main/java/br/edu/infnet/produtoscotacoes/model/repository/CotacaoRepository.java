package br.edu.infnet.produtoscotacoes.model.repository;

import br.edu.infnet.produtoscotacoes.model.domain.Cotacao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CotacaoRepository extends CrudRepository<Cotacao,Integer> {
}
