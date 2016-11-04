/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.droganet.dao.teste;

import br.com.droganet.dao.PlanoDAO;
import br.com.droganet.model.Plano;

/**
 *
 * @author marcos.mariano
 */
public class PlanoTeste {
    public static void main(String[] args) {
        Plano p = new Plano();
        p.setNome("Plano 1");
        p.setValor(1000);
        
        PlanoDAO pDAO = new PlanoDAO();
        pDAO.salvar(p);
        
        Plano p1 = new Plano();
        p1.setNome("Plano 2");
        p1.setValor(1500);
        
        PlanoDAO pDAO1 = new PlanoDAO();
        pDAO1.salvar(p1);
        
        Plano p2 = new Plano();
        p2.setNome("Plano 3");
        p2.setValor(3000);
        
        PlanoDAO pDAO2=new PlanoDAO();
        pDAO2.salvar(p2);
    }
    
}
