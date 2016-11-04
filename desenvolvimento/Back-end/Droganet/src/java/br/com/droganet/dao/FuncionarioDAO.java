/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.droganet.dao;

import br.com.droganet.factory.HibernateUtil;
import br.com.droganet.model.Funcionario;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author marcos.mariano
 */
public class FuncionarioDAO {
    Session conexao;
    
    public FuncionarioDAO() {
        //abre a conexão com o hibernate
        conexao = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public void salvar(Funcionario p) {
        //insere ou altera o registro de aluno
        conexao.beginTransaction();
        conexao.saveOrUpdate(p);
        conexao.getTransaction().commit();
    }
    
    public void excluir(Funcionario p) {
        conexao.beginTransaction();
        conexao.delete(p);
        conexao.getTransaction().commit();
    }
    
    public Funcionario consultar(String nome){
        conexao.beginTransaction();
        Query query = conexao.createQuery("from funcionario where nome = " + nome);
        Funcionario j = (Funcionario) query.uniqueResult();
        conexao.getTransaction().commit();
        return j;
    }
    
    public List<Funcionario> listar() {
        conexao.beginTransaction();
        Query query = conexao.createQuery("from funcionario");
        List<Funcionario> lista = query.list();
        conexao.getTransaction().commit();
        return lista;
    }   

}
