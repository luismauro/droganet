/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.droganet.dao;

import br.com.droganet.factory.HibernateUtil;
import br.com.droganet.model.CreditoCliente;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author marcos.mariano
 */
public class CreditoClienteDAO {
    Session conexao;
    
    public CreditoClienteDAO() {
        //abre a conexão com o hibernate
        conexao = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public void salvar(CreditoCliente f) {
        //insere ou altera o registro de aluno
        conexao.beginTransaction();
        conexao.saveOrUpdate(f);
        conexao.getTransaction().commit();
    }
    
    public void excluir(CreditoCliente f) {
        conexao.beginTransaction();
        conexao.delete(f);
        conexao.getTransaction().commit();
    }
    
    public CreditoCliente consultar(String nome){
        conexao.beginTransaction();
        Query query = conexao.createQuery("from creditocliente where nome = " + nome);
        CreditoCliente j = (CreditoCliente) query.uniqueResult();
        conexao.getTransaction().commit();
        return j;
    }
    
    public List<CreditoCliente> listar() {
        conexao.beginTransaction();
        Query query = conexao.createQuery("from creditocliente");
        List<CreditoCliente> lista = query.list();
        conexao.getTransaction().commit();
        return lista;
    }   

    
}
