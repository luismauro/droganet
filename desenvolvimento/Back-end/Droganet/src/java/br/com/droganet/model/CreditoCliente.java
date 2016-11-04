/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.droganet.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author marcos.mariano
 */
@Entity
@Table(name="CREDITOCLIENTE")
public class CreditoCliente implements Serializable {
    @Id
    @Column(name="idCredito")
    @Basic(optional=false)
    @SequenceGenerator(name="seq_credito", sequenceName="seq_credito" , allocationSize=1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator="seq_credito")
    private int idCredito;
    @Column
    private double credito;
    
 @ManyToOne
 @JoinColumn(name="cliente")
 private Cliente cliente;

    public int getIdCredito() {
        return idCredito;
    }

    public void setIdCredito(int idCredito) {
        this.idCredito = idCredito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
 
 
}
