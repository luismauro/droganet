package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Plano_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("﻿<!DOCTYPE html>\n");
      out.write("<!--[if lt IE 7 ]><html class=\"ie ie6\" lang=\"en\"> <![endif]-->\n");
      out.write("<!--[if IE 7 ]><html class=\"ie ie7\" lang=\"en\"> <![endif]-->\n");
      out.write("<!--[if IE 8 ]><html class=\"ie ie8\" lang=\"en\"> <![endif]-->\n");
      out.write("<!--[if (gte IE 9)|!(IE)]><!-->\n");
      out.write("<html lang=\"en\">\n");
      out.write("<!--<![endif]-->\n");
      out.write("<!-- HEAD SECTION -->\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <!--[if IE]>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("        <![endif]-->\n");
      out.write("    <title>:: DROGANET ::</title>\n");
      out.write("    <!--GOOGLE FONT -->\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>\n");
      out.write("    <!--BOOTSTRAP MAIN STYLES -->\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("    <!--FONTAWESOME MAIN STYLE -->\n");
      out.write("    <link href=\"assets/css/font-awesome.min.css\" rel=\"stylesheet\" />\n");
      out.write("    <!--SLIDER CSS CLASES -->\n");
      out.write("    <link href=\"assets/Slides-SlidesJS-3/examples/playing/css/slider.css\" rel=\"stylesheet\" />\n");
      out.write("    <!--CUSTOM STYLE -->\n");
      out.write("    <link href=\"assets/css/style.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("</head>\n");
      out.write("<!--END HEAD SECTION -->\n");
      out.write("<body>\n");
      out.write("       <div class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("        <div class=\"col-md-3\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"index.html\"><img src=\"assets/img/logo.png\" width=\"270\" height=\"70\"/></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-6\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-3\">\n");
      out.write("            <div class=\"navbar-collapse collapse\">\n");
      out.write("                <ul class=\"nav navbar-nav navbar-left\">\n");
      out.write("                    <a href=\"#\"><i class=\"fa fa-facebook-square fa-3x color-facebook2\"></i></a>\n");
      out.write("                    <a href=\"#\"><i class=\"fa fa-twitter-square fa-3x color-twitter32\"></i></a>\n");
      out.write("                    <a href=\"#\"><i class=\"fa fa-google-plus-square fa-3x color-google-plus2\"></i></a>\n");
      out.write("                    <a href=\"#\"><i class=\"fa fa-linkedin-square fa-3x color-linkedin2\"></i></a>\n");
      out.write("                    <br>\n");
      out.write("                    \n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"row main-low-margin \">\n");
      out.write("\n");
      out.write("            <div class=\"container\" id=\"pricing-section\">\n");
      out.write("\n");
      out.write("                <div class=\"main-low-margin col-md-10 col-md-offset-1 col-sm-10 col-sm-offset-1 margin-top-100 \">\n");
      out.write("                    <div id=\"pricing-table\" class=\"row\">\n");
      out.write("                        <div class=\"col-md-4 col-sm-4\">\n");
      out.write("                            <ul class=\"plan-main\">\n");
      out.write("                                <li class=\"plan-name\">Starter</li>\n");
      out.write("                                <li class=\"plan-price\">R$ 1.000</li>\n");
      out.write("                                <li>Cadastro 03 Lojas</li>\n");
      out.write("                                <li>Controle de Estoque</li>\n");
      out.write("                                <li>Cadastro de Funcionarios</li>\n");
      out.write("                                <li>Geração de Relatórios</li>\n");
      out.write("                                <li>Direito de Suporte</li>\n");
      out.write("                                <li class=\"plan-action\"><a href=\"CadastrarRede.jsp?id=1\" class=\"btn2 btn-default \">Assinar Agora</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4 col-sm-4\">\n");
      out.write("                             <ul class=\"plan-main\">\n");
      out.write("                                <li class=\"plan-name\">Medium</li>\n");
      out.write("                                <li class=\"plan-price\">R$ 1.500</li>\n");
      out.write("                                <li>Cadastro 05 Lojas</li>\n");
      out.write("                                <li>Controle de Estoque</li>\n");
      out.write("                                <li>Cadastro de Funcionarios</li>\n");
      out.write("                                <li>Geração de Relatórios</li>\n");
      out.write("                                <li>Direito de Suporte</li>\n");
      out.write("                                <li class=\"plan-action\"><a href=\"CadastrarRede.jsp?id=2\" class=\"btn2 btn-default \">Assinar Agora</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4 col-sm-4\">\n");
      out.write("                             <ul class=\"plan-main\">\n");
      out.write("                                <li class=\"plan-name\">Advance</li>\n");
      out.write("                                <li class=\"plan-price\">R$ 3.000</li>\n");
      out.write("                                <li>Cadastro 10 Lojas</li>\n");
      out.write("                                <li>Controle de Estoque</li>\n");
      out.write("                                <li>Cadastro de Funcionarios</li>\n");
      out.write("                                <li>Geração de Relatórios</li>\n");
      out.write("                                <li>Direito de Suporte</li>\n");
      out.write("                                <li class=\"plan-action\"><a href=\"CadastrarRede.jsp?id=3\" class=\"btn2 btn-default\">Assinar Agora</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- ./ Row Content-->\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"space-bottom\"></div>\n");
      out.write("    <!--END PRICING SECTION -->\n");
      out.write("    <!--FOOTER SECTION -->\n");
      out.write("\n");
      out.write("<div id=\"footer\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <p align=\"center\">\n");
      out.write("                    <img src=\"assets/img/logo_transparent2.png\" width=\"275\" height=\"75\"/>\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <h4>Informações Rápidas </h4>\n");
      out.write("                <hr>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("                    Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n");
      out.write("                         Curabitur nec nisl odio. Mauris vehicula at nunc id posuere.\n");
      out.write("                        Curabitur nec nisl odio. Mauris vehicula at nunc id posuere.\n");
      out.write("                            Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n");
      out.write("                         Curabitur nec nisl odio. Mauris vehicula at nunc id posuere.\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-facebook-square fa-3x color-facebook\"></i></a>\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-twitter-square fa-3x color-twitter\"></i></a>\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-google-plus-square fa-3x color-google-plus\"></i></a>\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-linkedin-square fa-3x color-linkedin\"></i></a>\n");
      out.write("                <hr>\n");
      out.write("                <p>\n");
      out.write("                    600, Av. Dr.Armando Sales Oliveira,<br>\n");
      out.write("                    Franca, SP.<br>\n");
      out.write("                    Fone: +55-16-3407-0093<br>\n");
      out.write("                    Email: contato@droganet.com.br<br>\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("                2016 www.droganet.com.br | Todos os Direitos Reservados\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
