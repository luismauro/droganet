/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.droganet.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author marcos.mariano
 */
@Entity
@Table(name="MEDICAMENTO")
public class Medicamento implements Serializable {
    @Id
    @Column(name="idMedicamento")
    @Basic(optional=false)
    @SequenceGenerator(name="seq_medicamento", sequenceName="seq_medicamento" , allocationSize=1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator="seq_medicamento")
    private int idMedicamento;
    @Column
    private String nome;
    @Column
    private int estoqueMinimo;
    @Column
    private int estoqueAtual;
    
    @ManyToOne
    @JoinColumn(name="tipo")
    private Tipo tipo;
  
    @ManyToOne
    @JoinColumn(name="fornecedor")
    private Fornecedor fornecedor;
    
    @OneToMany(mappedBy="medicamento")
    private List<Item> listaItem;

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public List<Item> getListaItem() {
        return listaItem;
    }

    public void setListaItem(List<Item> listaItem) {
        this.listaItem = listaItem;
    }

    public int getEstoqueAtual() {
        return estoqueAtual;
    }

    public void setEstoqueAtual(int estoqueAtual) {
        this.estoqueAtual = estoqueAtual;
    }
    
    
    
}
