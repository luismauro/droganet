/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.droganet.dao;

import br.com.droganet.factory.HibernateUtil;
import br.com.droganet.model.Cliente;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author marcos.mariano
 */
public class ClienteDAO {
    Session conexao;
    
    public ClienteDAO() {
        //abre a conexão com o hibernate
        conexao = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public void salvar(Cliente f) {
        //insere ou altera o registro de aluno
        conexao.beginTransaction();
        conexao.saveOrUpdate(f);
        conexao.getTransaction().commit();
    }
    
    public void excluir(Cliente f) {
        conexao.beginTransaction();
        conexao.delete(f);
        conexao.getTransaction().commit();
    }
    
    public Cliente consultar(String nome){
        conexao.beginTransaction();
        Query query = conexao.createQuery("from cliente where nome = " + nome);
        Cliente j = (Cliente) query.uniqueResult();
        conexao.getTransaction().commit();
        return j;
    }
    
    public List<Cliente> listar() {
        conexao.beginTransaction();
        Query query = conexao.createQuery("from cliente");
        List<Cliente> lista = query.list();
        conexao.getTransaction().commit();
        return lista;
    }   

    
}
