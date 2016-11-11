<%-- 
    Document   : CadastrarCliente
    Created on : 04/11/2016, 17:49:28
    Author     : marcos.mariano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
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
	
		<div class="container">
			<div class="row main-low-margin ">
				<div class="row"></br></br></br></div>
                                <form class="form-horizontal col-sm-12" align="center" method="POST" action="InserirCliente">				
				<fieldset>
				<legend><h1>Cadastrar Cliente</h1></legend>
					
					<div class="form-group">
						<label class="col-sm-1">Nome:</label>
						<div class="col-sm-11"> 
							<input type="text" class="form-control" name="nome" placeholder="Digite o nome">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-1">CPF:</label>
						<div class="col-sm-5"> 
							<input type="text" class="form-control" name="cpf" placeholder="Digite o CPF">							
						</div>
						<label class="col-sm-1">RG:</label>
						<div class="col-sm-5"> 
							<input type="text" class="form-control" name="rg" placeholder="Digite o RG">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-1">Fone:</label>
						<div class="col-sm-5"> 
							<input type="text" class="form-control" name="tel" placeholder="Digite o Telefone">							
						</div>
						<label class="col-sm-1">Celular:</label>
						<div class="col-sm-5"> 
							<input type="text" class="form-control" name="cel" placeholder="Digite o Celular">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-1">Nasc:</label>
						<div class="col-sm-5"> 
							<input type="date" class="form-control" name="dtNasc" placeholder="Digite o Nascimento"/>							
						</div>
							<label class="col-sm-1">Sexo:</label>
							<label class="col-sm-1">Masculino:</label>
								<div>
									<input type="radio" name="sexo" value="masculino" class="col-sm-1">                            
								</div>
							<label class="col-sm-1">Feminino:</label>
								<div>
									<input type="radio" name="sexo" value="feminino" class="col-sm-1">                            
								</div>			
					</div>									
					<div class="form-group">
						<label class="col-sm-1">End:</label>
						<div class="col-sm-5"> 
							<input type="text" class="form-control" name="enderco" placeholder="Digite o Endereço">							
						</div>
						<label class="col-sm-1">Número:</label>
						<div class="col-sm-5"> 
							<input type="text" class="form-control" name="numero" placeholder="Digite o Número">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-1">Bairro:</label>
						<div class="col-sm-5"> 
							<input type="text" class="form-control" name="bairro" placeholder="Digite o Bairro">							
						</div>
						<label class="col-sm-1">CEP:</label>
						<div class="col-sm-5"> 
							<input type="text" class="form-control" name="cep" placeholder="Digite o CEP">
						</div>						
					</div>
					<div class="form-group">
						<label class="col-sm-1">Cidade:</label>
						<div class="col-sm-5"> 
							<input type="text" class="form-control" name="cidade" placeholder="Digite o Cidade">							
						</div>
						<label class="col-sm-1">Estado:</label>
						<div class="col-sm-5"> 
                                                    <select name="estado" class="form-control">
								<option value="Sao Paulo">São Paulo</option>
								<option value="Minas Gerais">Minas Gerais</option>								
							</select>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-1">e-mail:</label>
						<div class="col-sm-11"> 
							<input type="text" class="form-control" name="email" placeholder="Digite o e-mail">
						</div>
					</div>
					<div>
						<input type="submit" class="btn btn-primary"/>
						<input type="reset" class="btn btn-danger "/> 
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
    
</body>
</html>
