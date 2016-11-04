/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.droganet.dao;

import br.com.droganet.factory.HibernateUtil;
import br.com.droganet.model.Tipo;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author marcos.mariano
 */
public class TipoDAO {
    Session conexao;
    
    public TipoDAO() {
        //abre a conexão com o hibernate
        conexao = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public void salvar(Tipo p) {
        //insere ou altera o registro de aluno
        conexao.beginTransaction();
        conexao.saveOrUpdate(p);
        conexao.getTransaction().commit();
    }
    
    public void excluir(Tipo p) {
        conexao.beginTransaction();
        conexao.delete(p);
        conexao.getTransaction().commit();
    }
    
    public Tipo consultar(String nome){
        conexao.beginTransaction();
        Query query = conexao.createQuery("from tipo where nome = " + nome);
        Tipo j = (Tipo) query.uniqueResult();
        conexao.getTransaction().commit();
        return j;
    }
    
    public List<Tipo> listar() {
        conexao.beginTransaction();
        Query query = conexao.createQuery("from tipo");
        List<Tipo> lista = query.list();
        conexao.getTransaction().commit();
        return lista;
    }   

}
