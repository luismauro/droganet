/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.droganet.controller;

import br.com.droganet.model.Loja;
import br.com.droganet.dao.LojaDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gustavo
 */

@WebServlet(name = "InserirFuncionario", urlPatterns = {"/InserirFuncionario"})
public class InserirLoja extends HttpServlet {
    
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
    
            Loja l = new Loja();

            l.setRazaoSocial(request.getParameter("razaosocial"));
            l.setCnpj(request.getParameter("cnpj"));
            l.setTelefone(request.getParameter("telefone"));
            l.setInscEstadual(request.getParameter("inscestadual"));
            l.setEndereco("endereco");
            l.setNumero(request.getParameter("numero"));
            l.setBairro(request.getParameter("bairro"));
            l.setCep(request.getParameter("cep"));
            l.setCidade(request.getParameter("cidade"));

            LojaDAO lDAO = new LojaDAO();
                lDAO.salvar(l);

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
