/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.droganet.dao;

import br.com.droganet.factory.HibernateUtil;
import br.com.droganet.model.Loja;
import br.com.droganet.model.Plano;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author marcos.mariano
 */
public class LojaDAO {
    Session conexao;
    
    public LojaDAO() {
        //abre a conexão com o hibernate
        conexao = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public void salvar(Loja l) {
        //insere ou altera o registro de aluno
        conexao.beginTransaction();
        conexao.saveOrUpdate(l);
        conexao.getTransaction().commit();
    }
    
    public void excluir(Loja l) {
        conexao.beginTransaction();
        conexao.delete(l);
        conexao.getTransaction().commit();
    }
    
    public Loja consultar(String nome){
        conexao.beginTransaction();
        Query query = conexao.createQuery("from loja where nome = " + nome);
        Loja j = (Loja) query.uniqueResult();
        conexao.getTransaction().commit();
        return j;
    }
    
    public List<Loja> listar() {
        conexao.beginTransaction();
        Query query = conexao.createQuery("from loja");
        List<Loja> lista = query.list();
        conexao.getTransaction().commit();
        return lista;
    }   

}
