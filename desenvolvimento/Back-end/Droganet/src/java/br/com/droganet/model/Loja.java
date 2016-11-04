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
@Table(name="LOJA")
public class Loja implements Serializable {
    @Id
    @Column(name="idLoja")
    @Basic(optional=false)
    @SequenceGenerator(name="seq_loja", sequenceName="seq_loja" , allocationSize=1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator="seq_loja")
    private int idLoja;
    @Column
    private String razaoSocial;
    @Column
    private String cnpj;
    @Column
    private String telefone;
    @Column
    private String inscEstadual;
    @Column
    private String endereco;
    @Column
    private String numero;
    @Column
    private String bairro;
    @Column
    private String cep;
    @Column
    private String cidade;
    
 @ManyToOne
 @JoinColumn(name="administrador")
 private Administrador administrador;
 
  @OneToMany(mappedBy="loja")
  private List<Funcionario> listaFuncionario;

    public int getIdLoja() {
        return idLoja;
    }

    public void setIdLoja(int idLoja) {
        this.idLoja = idLoja;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getInscEstadual() {
        return inscEstadual;
    }

    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
 
 
    
}
