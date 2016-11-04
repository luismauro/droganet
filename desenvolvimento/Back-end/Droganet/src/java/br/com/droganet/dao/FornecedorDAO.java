/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.droganet.dao;

import br.com.droganet.factory.HibernateUtil;
import br.com.droganet.model.Fornecedor;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author marcos.mariano
 */
public class FornecedorDAO {
     Session conexao;
    
    public FornecedorDAO() {
        //abre a conexão com o hibernate
        conexao = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public void salvar(Fornecedor f) {
        //insere ou altera o registro de aluno
        conexao.beginTransaction();
        conexao.saveOrUpdate(f);
        conexao.getTransaction().commit();
    }
    
    public void excluir(Fornecedor f) {
        conexao.beginTransaction();
        conexao.delete(f);
        conexao.getTransaction().commit();
    }
    
    public Fornecedor consultar(String nome){
        conexao.beginTransaction();
        Query query = conexao.createQuery("from fornecedor where nome = " + nome);
        Fornecedor j = (Fornecedor) query.uniqueResult();
        conexao.getTransaction().commit();
        return j;
    }
    
    public List<Fornecedor> listar() {
        conexao.beginTransaction();
        Query query = conexao.createQuery("from fornecedor");
        List<Fornecedor> lista = query.list();
        conexao.getTransaction().commit();
        return lista;
    }   

    
}
