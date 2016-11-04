/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.droganet.dao;

import br.com.droganet.model.Administrador;
import br.com.droganet.factory.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author marcos.mariano
 */
public class AdministradorDAO {
    Session conexao;
    
    public AdministradorDAO() {
        //abre a conexão com o hibernate
        conexao = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public void salvar(Administrador a) {
        //insere ou altera o registro de aluno
        conexao.beginTransaction();
        conexao.saveOrUpdate(a);
        conexao.getTransaction().commit();
    }
    
    public void excluir(Administrador a) {
        conexao.beginTransaction();
        conexao.delete(a);
        conexao.getTransaction().commit();
    }
    
    public Administrador consultar(String nome){
        conexao.beginTransaction();
        Query query = conexao.createQuery("from Adminsitrador where nomeAdmin = " + nome);
        Administrador j = (Administrador) query.uniqueResult();
        conexao.getTransaction().commit();
        return j;
    }
    
    public List<Administrador> listar() {
        conexao.beginTransaction();
        Query query = conexao.createQuery("from Administrador");
        List<Administrador> lista = query.list();
        conexao.getTransaction().commit();
        return lista;
    }    

}
