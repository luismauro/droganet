/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.droganet.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;



/**
 *
 * @author marcos.mariano
 */
@Entity
@Table(name="TIPO")
public class Tipo implements Serializable {
    @Id
    @Column(name="idTipo")
    @Basic(optional=false)
    @SequenceGenerator(name="seq_tipo", sequenceName="seq_tipo" , allocationSize=1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator="seq_tipo")
    private int idTipo;
    @Column
    private String nome;
    @Column
    private String descricao;
    
    @OneToMany(mappedBy="tipo")
    private List<Medicamento> listaMedicamento;

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Medicamento> getListaMedicamento() {
        return listaMedicamento;
    }

    public void setListaMedicamento(List<Medicamento> listaMedicamento) {
        this.listaMedicamento = listaMedicamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
