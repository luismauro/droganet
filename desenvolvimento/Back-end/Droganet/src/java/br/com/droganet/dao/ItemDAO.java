/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.droganet.dao;

import br.com.droganet.factory.HibernateUtil;
import br.com.droganet.model.Item;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author marcos.mariano
 */
public class ItemDAO {
    Session conexao;
    
    public ItemDAO() {
        //abre a conexão com o hibernate
        conexao = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public void salvar(Item l) {
        //insere ou altera o registro de aluno
        conexao.beginTransaction();
        conexao.saveOrUpdate(l);
        conexao.getTransaction().commit();
    }
    
    public void excluir(Item l) {
        conexao.beginTransaction();
        conexao.delete(l);
        conexao.getTransaction().commit();
    }
    
    public Item consultar(String nome){
        conexao.beginTransaction();
        Query query = conexao.createQuery("from item where nome = " + nome);
        Item j = (Item) query.uniqueResult();
        conexao.getTransaction().commit();
        return j;
    }
    
    public List<Item> listar() {
        conexao.beginTransaction();
        Query query = conexao.createQuery("from item");
        List<Item> lista = query.list();
        conexao.getTransaction().commit();
        return lista;
    }   

}
