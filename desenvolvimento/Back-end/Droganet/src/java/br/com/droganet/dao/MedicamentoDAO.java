/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.droganet.dao;

import br.com.droganet.factory.HibernateUtil;
import br.com.droganet.model.Medicamento;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author marcos.mariano
 */
public class MedicamentoDAO {
    Session conexao;
    
    public MedicamentoDAO() {
        //abre a conexão com o hibernate
        conexao = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public void salvar(Medicamento p) {
        //insere ou altera o registro de aluno
        conexao.beginTransaction();
        conexao.saveOrUpdate(p);
        conexao.getTransaction().commit();
    }
    
    public void excluir(Medicamento p) {
        conexao.beginTransaction();
        conexao.delete(p);
        conexao.getTransaction().commit();
    }
    
    public Medicamento consultar(String nome){
        conexao.beginTransaction();
        Query query = conexao.createQuery("from medicamento where nome = " + nome);
        Medicamento j = (Medicamento) query.uniqueResult();
        conexao.getTransaction().commit();
        return j;
    }
    
    public List<Medicamento> listar() {
        conexao.beginTransaction();
        Query query = conexao.createQuery("from medicamento");
        List<Medicamento> lista = query.list();
        conexao.getTransaction().commit();
        return lista;
    }   

}
