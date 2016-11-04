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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author MarcosVinicius
 */
@Entity
@Table(name="PLANO")
public class Plano implements Serializable {
    @Id
    @Column(name="idPlano")
    @Basic(optional=false)
    @SequenceGenerator(name="seq_plano", sequenceName="seq_plano" , allocationSize=1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator="seq_plano")
    private int idPlano;
    @Column
    private String nome;
    @Column
    private double valor;

    @OneToMany(mappedBy="plano")
    private List<Administrador> listaAdminsitrador;
    
    
 
    public int getIdPlano() {
        return idPlano;
    }

    public void setIdPlano(int idPlano) {
        this.idPlano = idPlano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public List<Administrador> getListaAdminsitrador() {
        return listaAdminsitrador;
    }

    public void setListaAdminsitrador(List<Administrador> listaAdminsitrador) {
        this.listaAdminsitrador = listaAdminsitrador;
    }
    
    
}
