<?php
	
	//Definição do nome da classe
	class Dao {
	
		//Atributos da Classe
		private $host;
		private $banco;
		private $usuario;
		private $senha;
		private $sql;
		private $resultado;
		private $conexao;
	
		//Método Construtor
		public function __construct($server, $db, $user, $pass) {	
			$this->setHost($server);
			$this->setUsuario($user);
			$this->setSenha($pass);
			$this->setBanco($db);
		}
		
		//Encapsulamento
		public function setHost($p_host) {		
			$this->host = $p_host;
		}
		
		public function getHost() {
			return $this->host;
		}
		
		public function setBanco($p_banco) {		
			$this->banco = $p_banco;
		}
		
		public function getBanco() {
			return $this->banco;
		}
		
		public function setUsuario($p_usuario) {		
			$this->usuario = $p_usuario;
		}
		
		public function getUsuario() {
			return $this->usuario;
		}
		
		public function setSenha($p_senha) {		
			$this->senha = $p_senha;
		}
		
		public function getSenha() {
			return $this->senha;
		}
		
		public function setSql($p_sql) {		
			$this->sql = $p_sql;
		}
		
		public function getSql() {
			return $this->sql;
		}
		
		public function setResultado($p_resultado) {		
			$this->resultado = $p_resultado;
		}
		
		public function getResultado() {
			return $this->resultado;
		}
		
		public function setConexao($p_conexao) {		
			$this->conexao = $p_conexao;
		}
		
		public function getConexao() {
			return $this->conexao;
		}
		//Métodos de Comunicação
		public function abreConexao() {
			//Realizo a conexão com banco
			$conn = mysql_connect($this->getHost(), $this->getUsuario(), $this->getSenha());
			
			//Armazeno a conexão no atributo $conexao
			$this->setConexao($conn);
			
			//Testo se existe ou não conexão
			if (!$this->getConexao()) { //Se não existir
				echo 'N&atilde;o foi poss&iacute;vel realizar conex&atilde;o com o servidor!';
				exit();
			
			} elseif (!mysql_select_db($this->getBanco(), $this->getConexao())) {
				echo 'N&atilde;o foi poss&iacute;vel selecionar o banco de dados desejado!';
				exit();
				
			}
			
		}
		
		
		//Fechar a conexão
		public function fechaConexao() {
			return mysql_close($this->getConexao());
		}
		
		//Método para executar query
		public function execQuery($comando_sql) {
			
			$this->setSql($comando_sql);
			
			$this->abreConexao();
			$this->setResultado(mysql_query($this->getSql()));			
			
			if (!$this->getResultado()) { //Caso não execute
				echo "Nao foi possivel executar o SQL desejado.<br />Mysql ERROR: ".mysql_error()."<br />Comando com problemas: ".$this->getSql();
				$this->fechaConexao();
				exit();
			
			} else { //Se o comando executou com sucesso
				$this->fechaConexao();
				return $this->getResultado();
				
			}
			
			
			
			
		}
		
		private $db_host = 'bancotcc.criwayq9m3wj.us-west-2.rds.amazonaws.com:3306'; // servidor
    private $db_user = 'luis'; // usuario do banco
    private $db_pass = 'pa$$w0rd827'; // senha do usuario do banco
    private $db_name = 'bancotcc'; // nome do banco
		
		static public function conn() {
			
			$dao = new Dao($db_host, $db_name, $db_user, $db_pass);
			
			return $dao;
		}
		
		
	}
?>