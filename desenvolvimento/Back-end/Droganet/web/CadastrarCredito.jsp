<%-- 
    Document   : CadastrarCredito
    Created on : 11/11/2016, 21:02:56
    Author     : luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>:: DROGANET ::</title>
        <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>
        <link href="assets/css/bootstrap.css" rel="stylesheet" />
        <link href="assets/css/font-awesome.min.css" rel="stylesheet" />
        <link href="assets/Slides-SlidesJS-3/examples/playing/css/slider.css" rel="stylesheet" />
        <link href="assets/css/style.css" rel="stylesheet" />
    </head>
    <body>
        <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="col-md-3">
                <a class="navbar-brand" href="index.jsp"><img src="assets/img/logo.png" width="270" height="70"/></a>
            </div>
            <div class="col-md-6">
                <div id = "nav">
                    <ul>
                        <li><a >CADASTRO</a>
                            <ul>
                                <li><a href="CadastrarCredito.jsp">Creditos</a><li>
                                <li><a href="CadastrarCliente.jsp">Cliente</a><li>
                                <li><a href="CadastrarFornecedor.jsp">Fornecedor</a><li>
                                <li><a href="CadastrarFuncionario.jsp">Funcionario</a><li>
                                <li><a href="CadastrarLoja.jsp">Loja</a><li>
                                <li><a href="CadastrarMedicamento.jsp">Medicamento</a><li>
                                <li><a href="CadastrarRede.jsp">Rede</a><li>
                                <li><a href="CadastrarTipo.jsp">Tipo</a><li>
                                <li><a href="CadastrarVenda.jsp">Venda</a><li>

                            </ul>
                        <li><a>CONSULTA</a>
                            <ul>
                                <li><a href="CaixaFinal.jsp">Caixa Final</a><li>
                                <li><a href="ListaFuncionario.jsp">Funcionario</a><li>
                                <li><a href="ListaMedicamento.jsp">Medicamento</a><li>
                                <li><a href="ListaLoja.jsp">Loja</a><li>
                            </ul>
                        <li><a>ESTOQUE</a>
                            <ul>
                                <li><a href="estoque.jsp">Produto</a><li>
                            </ul>						
                        <li><a>RELATORIOS</a>
                            <ul>
                                <li><a href="RelatorioVenda.jsp">Venda</a><li>
                                <li><a href="RelatorioCliente.jsp">Cliente</a><li>
                                <li><a href="RelatorioMedicamento.jsp">Medicamento</a><li>
                            </ul>											
                        <li><a href="#">Contato</a></li>
                    </ul>                              
                </div>  
            </div>
            <div class="col-md-3">
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav navbar-left">
                        <a href="#"><i class="fa fa-facebook-square fa-3x color-facebook2"></i></a>
                        <a href="#"><i class="fa fa-twitter-square fa-3x color-twitter3"></i></a>
                        <a href="#"><i class="fa fa-google-plus-square fa-3x color-google-plus2"></i></a>
                        <a href="#"><i class="fa fa-linkedin-square fa-3x color-linkedin2"></i></a>
                        <br>
                        <p align="right">Bem vindo <%=session.getValue("loginUsuario")%>
                            <a href="index.jsp" class=" btn btn-link">Sair</a></p>
                    </ul>
                </div>
            </div>
        </div>
        </br></br></br></br></br></br></br></br>
        <div class="container">
            <div class="row main-low-margin ">
                <div class = "row"></br></br></br></div>
                <form class = "form-horizontal col-sm-12" align = "center">             
                    <fieldset>
                        <legend><h1> Cadastrar Créditos</h1></legend>

                        <div class="form-group">
                            <label class = "col-sm-2">Nome:</label>
                            <div class = "col-sm-4"> 
                                <input type="text" class="form-control" id="nome" placeholder="Digite o nome">
                            </div>                
                            <label class="col-sm-2">Codigo:</label>
                            <div class="col-sm-4"> 
                                <select name="estado" class = "largura_campo1">
                                    <option value="codigo1">Codigo 1</option>
                                    <option value="codigo2">Codigo 2</option>                              
                                </select>
                            </div>							
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2">Crédito Atual:</label>
                            <div class="col-sm-4"> 
                                <input type="text" class="form-control" id="cpf" placeholder="Digite o Crédito Atual">                            
                            </div>
                            <label class="col-sm-2">Crédito Inserido:</label>
                            <div class="col-sm-2"> 
                                <input type="text" class="form-control" id="rg" placeholder="Digite o Crédito Inserido">
                            </div>	                                          
                        </div>
                        </br></br>

                        <div>
                            <button type="submit" class="btn btn-primary">Enviar</button>
                            <button type="reset" class="btn btn-danger "> Cancelar</button>
                        </div>                  
                    </fieldset>
                </form>
            </div>
        </div>
        <p></p>
        <div id="footer">
            <div class="row">
                <div class="col-md-4">
                    <p align="center">
                        <img src="assets/img/logo_transparent2.png" width="275" height="75"/>
                    </p>
                </div>
                <div class="col-md-4">
                    <h4>Informações Rápidas </h4>
                    <hr>
                    <p>
                        Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                        Curabitur nec nisl odio. Mauris vehicula at nunc id posuere.
                        Curabitur nec nisl odio. Mauris vehicula at nunc id posuere.
                        Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                        Curabitur nec nisl odio. Mauris vehicula at nunc id posuere.
                    </p>
                </div>
                <div class="col-md-4">
                    <a href="#"><i class="fa fa-facebook-square fa-3x color-facebook"></i></a>
                    <a href="#"><i class="fa fa-twitter-square fa-3x color-twitter"></i></a>
                    <a href="#"><i class="fa fa-google-plus-square fa-3x color-google-plus"></i></a>
                    <a href="#"><i class="fa fa-linkedin-square fa-3x color-linkedin"></i></a>
                    <hr>
                    <p>
                        600, Av. Dr.Armando Sales Oliveira,<br>
                        Franca, SP.<br>
                        Fone: +55-16-3407-0093<br>
                        Email: contato@droganet.com.br<br>
                    </p>

                    2016 www.droganet.com.br | Todos os Direitos Reservados
                </div>
            </div>
        </div>
        <script src="assets/js/jquery.js"></script>
        <script src="assets/js/bootstrap.min.js"></script>
        <script src="assets/Slides-SlidesJS-3/examples/playing/js/jquery.slides.min.js"></script>
        <script>
            $(document).ready(function () {
                $('#slides').slidesjs({
                    width: 940,
                    height: 528,
                    play: {
                        active: true,
                        auto: true,
                        interval: 4000,
                        swap: true
                    }
                });
            });

        </script>

    </body>
</html>
