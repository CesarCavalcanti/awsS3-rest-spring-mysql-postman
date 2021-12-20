package br.edu.infnet.produtoscotacoes.model.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "cotacao")
public class Cotacao {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "marca")
    private String marca;
    @Column(name = "preco")
    private BigDecimal preco;
    @Column(name = "desconto")
    private String desconto;

    public Cotacao() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getDesconto() {
        return desconto;
    }

    public void setDesconto(String desconto) {
        this.desconto = desconto;
    }
}
