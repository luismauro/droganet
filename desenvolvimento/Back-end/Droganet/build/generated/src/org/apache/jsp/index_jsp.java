package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("        <!--[if IE]>\r\n");
      out.write("            <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("            <![endif]-->\r\n");
      out.write("        <title>:: DROGANET ::</title>\r\n");
      out.write("        <!--GOOGLE FONT -->\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <!--BOOTSTRAP MAIN STYLES -->\r\n");
      out.write("        <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <!--FONTAWESOME MAIN STYLE -->\r\n");
      out.write("        <link href=\"assets/css/font-awesome.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <!--SLIDER CSS CLASES -->\r\n");
      out.write("        <link href=\"assets/Slides-SlidesJS-3/examples/playing/css/slider.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <!--CUSTOM STYLE -->\r\n");
      out.write("        <link href=\"assets/css/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("        <!--[if lt IE 9]>\r\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js\"></script>\r\n");
      out.write("        <![endif]-->\r\n");
      out.write("    </head>\r\n");
      out.write("    <!--END HEAD SECTION -->\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            session.invalidate();
        
      out.write("\r\n");
      out.write("        <div class=\"navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("            <div class=\"col-md-3\">\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.jsp\"><img src=\"assets/img/logo.png\" width=\"270\" height=\"70\"/></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-6\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-md-3 right\">\r\n");
      out.write("                <div class=\"navbar-collapse collapse\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-left\">\r\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-facebook-square fa-3x color-facebook2\"></i></a>\r\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-twitter-square fa-3x color-twitter3\"></i></a>\r\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-google-plus-square fa-3x color-google-plus2\"></i></a>\r\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-linkedin-square fa-3x color-linkedin2\"></i></a>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <p align=\"right\"><a href=\"Plano.jsp\" class=\"btn2 btn-default\">Assinar Agora</a>\r\n");
      out.write("                            <a href=\"login.jsp\" class=\" btn btn-link\">Já Tenho Cadastro</a></p>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- SLIDER SECTION -->\r\n");
      out.write("        <div id=\"slides\">\r\n");
      out.write("            <img src=\"assets/img/slider/images/1.jpg\" alt=\"\" />\r\n");
      out.write("            <img src=\"assets/img/slider/images/2.jpg\" alt=\"\" />\r\n");
      out.write("            <img src=\"assets/img/slider/images/1.jpg\" alt=\"\" />\r\n");
      out.write("            <img src=\"assets/img/slider/images/2.jpg\" alt=\"\" />\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- END SLIDER SECTION -->\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row main-low-margin text-center\">\r\n");
      out.write("                <div class=\"col-md-4 col-sm-4\">\r\n");
      out.write("                    <div class=\"\"><i class=\"glyphicon glyphicon-cog fa-5x  \"></i></div>\r\n");
      out.write("                    <h3>GERENCIE SEU ESTOQUE</h3>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        Lorem ipsum dolor sit amet, consectetur adipiscing elit.\r\n");
      out.write("                        Curabitur nec nisl odio. Mauris vehicula at nunc id posuere.\r\n");
      out.write("                        Curabitur nec nisl odio. Mauris vehicula at nunc id posuere.\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-4 col-sm-4\">\r\n");
      out.write("                    <div class=\"\"><i class=\"fa fa-dollar fa-5x  \"></i></div>\r\n");
      out.write("                    <h3>ÓTIMO CUSTO</h3>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        Lorem ipsum dolor sit amet, consectetur adipiscing elit.\r\n");
      out.write("                        Curabitur nec nisl odio. Mauris vehicula at nunc id posuere.\r\n");
      out.write("                        Curabitur nec nisl odio. Mauris vehicula at nunc id posuere.\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-4 col-sm-4\">\r\n");
      out.write("                    <div class=\"\"><i class=\"glyphicon glyphicon-th-list fa-5x  \"></i></div>\r\n");
      out.write("                    <h3>CADASTRE SUA REDE</h3>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        Lorem ipsum dolor sit amet, consectetur adipiscing elit.\r\n");
      out.write("                        Curabitur nec nisl odio. Mauris vehicula at nunc id posuere.\r\n");
      out.write("                        Curabitur nec nisl odio. Mauris vehicula at nunc id posuere.\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row main-low-margin text-center\">\r\n");
      out.write("                <div class=\"col-md-4 col-sm-4\">\r\n");
      out.write("                    <div class=\"\"><i class=\"glyphicon glyphicon-ok fa-5x  \"></i></div>\r\n");
      out.write("                    <h3>CONTROLE DE CRÉDITOS</h3>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        Lorem ipsum dolor sit amet, consectetur adipiscing elit.\r\n");
      out.write("                        Curabitur nec nisl odio. Mauris vehicula at nunc id posuere.\r\n");
      out.write("                        Curabitur nec nisl odio. Mauris vehicula at nunc id posuere.\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-4 col-sm-4\">\r\n");
      out.write("                    <div class=\"\"><i class=\"glyphicon glyphicon-list-alt fa-5x  \"></i></div>\r\n");
      out.write("                    <h3>CONTROLE DE VENDAS</h3>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        Lorem ipsum dolor sit amet, consectetur adipiscing elit.\r\n");
      out.write("                        Curabitur nec nisl odio. Mauris vehicula at nunc id posuere.\r\n");
      out.write("                        Curabitur nec nisl odio. Mauris vehicula at nunc id posuere.\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-4 col-sm-4\">\r\n");
      out.write("                    <div class=\"\"><i class=\"glyphicon glyphicon-signal fa-5x \"></i></div>\r\n");
      out.write("                    <h3>GRÁFICOS DE DESEMPENHO</h3>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        Lorem ipsum dolor sit amet, consectetur adipiscing elit.\r\n");
      out.write("                        Curabitur nec nisl odio. Mauris vehicula at nunc id posuere.\r\n");
      out.write("                        Curabitur nec nisl odio. Mauris vehicula at nunc id posuere.\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row main-low-margin \">\r\n");
      out.write("                <div align=\"center\"><a href=\"pricing.html\"><button type=\"submit\" class=\"btn2 \">Assine Agora !</button></a></div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"space-bottom\"></div>\r\n");
      out.write("        <!--END HOME SECTION -->\r\n");
      out.write("        <!--FOOTER SECTION -->\r\n");
      out.write("\r\n");
      out.write("        <div id=\"footer\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <p align=\"center\">\r\n");
      out.write("                        <img src=\"assets/img/logo_transparent2.png\" width=\"275\" height=\"75\"/>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <h4>Informações Rápidas </h4>\r\n");
      out.write("                    <hr>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        Lorem ipsum dolor sit amet, consectetur adipiscing elit.\r\n");
      out.write("                        Curabitur nec nisl odio. Mauris vehicula at nunc id posuere.\r\n");
      out.write("                        Curabitur nec nisl odio. Mauris vehicula at nunc id posuere.\r\n");
      out.write("                        Lorem ipsum dolor sit amet, consectetur adipiscing elit.\r\n");
      out.write("                        Curabitur nec nisl odio. Mauris vehicula at nunc id posuere.\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <a href=\"#\"><i class=\"fa fa-facebook-square fa-3x color-facebook\"></i></a>\r\n");
      out.write("                    <a href=\"#\"><i class=\"fa fa-twitter-square fa-3x color-twitter\"></i></a>\r\n");
      out.write("                    <a href=\"#\"><i class=\"fa fa-google-plus-square fa-3x color-google-plus\"></i></a>\r\n");
      out.write("                    <a href=\"#\"><i class=\"fa fa-linkedin-square fa-3x color-linkedin\"></i></a>\r\n");
      out.write("                    <hr>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        600, Av. Dr.Armando Sales Oliveira,<br>\r\n");
      out.write("                        Franca, SP.<br>\r\n");
      out.write("                        Fone: +55-16-3407-0093<br>\r\n");
      out.write("                        Email: contato@droganet.com.br<br>\r\n");
      out.write("                    </p>\r\n");
      out.write("\r\n");
      out.write("                    2016 www.droganet.com.br | Todos os Direitos Reservados\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script src=\"assets/js/jquery.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/Slides-SlidesJS-3/examples/playing/js/jquery.slides.min.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("            $(document).ready(function () {\r\n");
      out.write("                $('#slides').slidesjs({\r\n");
      out.write("                    width: 940,\r\n");
      out.write("                    height: 528,\r\n");
      out.write("                    play: {\r\n");
      out.write("                        active: true,\r\n");
      out.write("                        auto: true,\r\n");
      out.write("                        interval: 4000,\r\n");
      out.write("                        swap: true\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
