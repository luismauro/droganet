package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CadastrarCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <title>:: DROGANET ::</title>\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"assets/css/font-awesome.min.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"assets/Slides-SlidesJS-3/examples/playing/css/slider.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"assets/css/style.css\" rel=\"stylesheet\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("\t\t<div class=\"col-md-3\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"index.html\"><img src=\"assets/img/logo.png\" width=\"270\" height=\"70\"/></a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-6\">\n");
      out.write("                </div>\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t\t<div class=\"navbar-collapse collapse\">\n");
      out.write("                <ul class=\"nav navbar-nav navbar-left\">\n");
      out.write("\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-facebook-square fa-3x color-facebook2\"></i></a>\n");
      out.write("\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-twitter-square fa-3x color-twitter2\"></i></a>\n");
      out.write("\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-google-plus-square fa-3x color-google-plus2\"></i></a>\n");
      out.write("\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-linkedin-square fa-3x color-linkedin2\"></i></a>\n");
      out.write("\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t<p align=\"right\">Bem vindo Gerente\n");
      out.write("\t\t\t\t\t<a href=\"login.html\" class=\" btn btn-link\">Sair</a></p>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\t\t</div>\n");
      out.write("    </div>\n");
      out.write("\t\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row main-low-margin \">\n");
      out.write("\t\t\t\t<div class=\"row\"></br></br></br></div>\n");
      out.write("                                <form class=\"form-horizontal col-sm-12\" align=\"center\" method=\"POST\" action=\"InserirCliente\">\t\t\t\t\n");
      out.write("\t\t\t\t<fieldset>\n");
      out.write("\t\t\t\t<legend><h1>Cadastrar Cliente</h1></legend>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label class=\"col-sm-1\">Nome:</label>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-11\"> \n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"nome\" placeholder=\"Digite o nome\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label class=\"col-sm-1\">CPF:</label>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-5\"> \n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"cpf\" placeholder=\"Digite o CPF\">\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<label class=\"col-sm-1\">RG:</label>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-5\"> \n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"rg\" placeholder=\"Digite o RG\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label class=\"col-sm-1\">Fone:</label>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-5\"> \n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"tel\" placeholder=\"Digite o Telefone\">\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<label class=\"col-sm-1\">Celular:</label>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-5\"> \n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"cel\" placeholder=\"Digite o Celular\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label class=\"col-sm-1\">Nasc:</label>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-5\"> \n");
      out.write("\t\t\t\t\t\t\t<input type=\"date\" class=\"form-control\" name=\"dtNasc\" placeholder=\"Digite o Nascimento\"/>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<label class=\"col-sm-1\">Sexo:</label>\n");
      out.write("\t\t\t\t\t\t\t<select name=\"sexo\">\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"m\">Masculino</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"f\">Feminino</option>\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label class=\"col-sm-1\">End:</label>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-5\"> \n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"enderco\" placeholder=\"Digite o Endereço\">\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<label class=\"col-sm-1\">Número:</label>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-5\"> \n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"numero\" placeholder=\"Digite o Número\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label class=\"col-sm-1\">Bairro:</label>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-5\"> \n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"bairro\" placeholder=\"Digite o Bairro\">\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<label class=\"col-sm-1\">CEP:</label>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-5\"> \n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"cep\" placeholder=\"Digite o CEP\">\n");
      out.write("\t\t\t\t\t\t</div>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label class=\"col-sm-1\">Cidade:</label>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-5\"> \n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"cidade\" placeholder=\"Digite o Cidade\">\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<label class=\"col-sm-1\">UF:</label>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-5\"> \n");
      out.write("\t\t\t\t\t\t\t<select name=\"estado\">\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"sp\">SP</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"mg\">MG</option>\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label class=\"col-sm-1\">e-mail:</label>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-11\"> \n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"email\" placeholder=\"Digite o e-mail\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" class=\"btn btn-primary\"/>\n");
      out.write("\t\t\t\t\t\t<input type=\"reset\" class=\"btn btn-danger \"/> \n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\t\n");
      out.write("\t\t\t\t</fieldset>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("   <p></p>\n");
      out.write("    <div id=\"footer\">\n");
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
      out.write("    \n");
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
