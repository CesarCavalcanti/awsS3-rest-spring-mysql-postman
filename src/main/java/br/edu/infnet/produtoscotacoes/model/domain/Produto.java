package br.edu.infnet.produtoscotacoes.model.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "produto")
public class Produto {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "quantidade")
    private String quantidade;
    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn (name = "id_cotacao")
    private List<Cotacao> cotacoes;

    public void copiarValoresDe (Produto p){
        this.nome = p.nome;
        this.quantidade = p.quantidade;
        this.cotacoes = p.cotacoes;
    }

    public Produto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public List<Cotacao> getCotacoes() {
        return cotacoes;
    }

    public void setCotacoes(List<Cotacao> cotacoes) {
        this.cotacoes = cotacoes;
    }
}
