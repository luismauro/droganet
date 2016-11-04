/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.droganet.dao;

import br.com.droganet.factory.HibernateUtil;
import br.com.droganet.model.Plano;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author marcos.mariano
 */
public class PlanoDAO {
     Session conexao;
    
    public PlanoDAO() {
        //abre a conexão com o hibernate
        conexao = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public void salvar(Plano p) {
        //insere ou altera o registro de aluno
        conexao.beginTransaction();
        conexao.saveOrUpdate(p);
        conexao.getTransaction().commit();
    }
    
    public void excluir(Plano p) {
        conexao.beginTransaction();
        conexao.delete(p);
        conexao.getTransaction().commit();
    }
    
    public Plano consultar(int id){
        conexao.beginTransaction();
        Query query = conexao.createQuery("from Plano where idPlano = " + id);
        Plano j = (Plano) query.uniqueResult();
        conexao.getTransaction().commit();
        return j;
    }
    
    public List<Plano> listar() {
        conexao.beginTransaction();
        Query query = conexao.createQuery("from plano");
        List<Plano> lista = query.list();
        conexao.getTransaction().commit();
        return lista;
    }   

    
}
