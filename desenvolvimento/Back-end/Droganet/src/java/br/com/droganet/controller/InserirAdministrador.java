/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.droganet.controller;

import br.com.droganet.dao.AdministradorDAO;
import br.com.droganet.dao.PlanoDAO;
import br.com.droganet.model.Administrador;
import br.com.droganet.model.Plano;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author marcos.mariano
 */
@WebServlet(name = "InserirAdministrador", urlPatterns = {"/InserirAdministrador"})
public class InserirAdministrador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
            Plano p;
    
        int id = Integer.parseInt(request.getParameter("idPlano"));
        PlanoDAO pDAO = new PlanoDAO();
        p = pDAO.consultar(id);
        
        Administrador a = new Administrador();
        a.setNomeRede(request.getParameter("nomeRede"));
        a.setNomeAdmin(request.getParameter("nome"));
        a.setCpf(request.getParameter("cpf"));
        a.setRg(request.getParameter("rg"));
        a.setTelefone(request.getParameter("telefone"));
        a.setDtNascimento(request.getParameter("dtNasc"));
        a.setSexo(request.getParameter("sexo"));
        a.setEstado(request.getParameter("estado"));
        a.setCidade(request.getParameter("cidade"));
        a.setBairro(request.getParameter("bairro"));
        a.setCep(request.getParameter("cep"));
        a.setEndereco(request.getParameter("endereco"));
        a.setNumero(request.getParameter("numero"));
        a.setEmail(request.getParameter("email"));
        a.setSenha(request.getParameter("senha"));
        a.setPlano(p);
        AdministradorDAO aDAO =new AdministradorDAO();
        aDAO.salvar(a);
        response.sendRedirect("HomeSuperAdmin.html");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
