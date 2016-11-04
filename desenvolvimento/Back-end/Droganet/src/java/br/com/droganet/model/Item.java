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
@Table(name="ITEM")
public class Item implements Serializable {
 @Id
 @Column(name="idItem")
 @Basic(optional=false)
 @SequenceGenerator(name="seq_item", sequenceName="seq_item" , allocationSize=1)
 @GeneratedValue(strategy = GenerationType.AUTO, generator="seq_item")
 private int idItem;
 @Column
 private String quantidade;
 
 @ManyToOne
 @JoinColumn(name="medicamento")
 private Medicamento medicamento;

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
 
 
}
