package com.delivery.delivery_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cliente;
    private String endereco;
    private String produto;
    private Double valor;

    public Delivery() {}

    public Delivery(String cliente, String endereco, String produto, Double valor) {
        this.cliente = cliente;
        this.endereco = endereco;
        this.produto = produto;
        this.valor = valor;
    }

    public Long getId() { return id; }
    public String getCliente() { return cliente; }
    public String getEndereco() { return endereco; }
    public String getProduto() { return produto; }
    public Double getValor() { return valor; }

    public void setCliente(String cliente) { this.cliente = cliente; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public void setProduto(String produto) { this.produto = produto; }
    public void setValor(Double valor) { this.valor = valor; }
}
