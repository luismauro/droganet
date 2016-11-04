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
            <a class="navbar-brand" href="index.html"><img src="assets/img/logo.png" width="270" height="70"/></a>
	</div>
	<div class="col-md-6">
            <div id = "nav">
                <ul>
					<li><a href="#">CADASTRO</a>
					<ul>
						<li><a href="#">Cliente</a><li>																
					</ul>
					<li><a href="#">ESTOQUE</a>
					<ul>
						<li><a href="#">Produto</a><li>
					</ul>						
					<li><a href="#">RELATORIOS</a>
					<ul>
						<li><a href="#">Venda</a><li>
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
					<p align="right">Bem vindo Admin
					<a href="login.html" class=" btn btn-link">Sair</a></p>
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
							<select name="sexo">
								<option value="m">Masculino</option>
								<option value="f">Feminino</option>								
							</select>
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
						<label class="col-sm-1">UF:</label>
						<div class="col-sm-5"> 
							<select name="estado">
								<option value="sp">SP</option>
								<option value="mg">MG</option>								
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
