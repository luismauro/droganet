<?php
    require_once('config/conexao.class.php');

    //$con = new conexao(); // instancia classe de conxao
    //$con->connect(); // abre conexao com o banco
?>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
       

        <table style="border: 2px solid red;">
            <thead>
                <tr>
                    <th>
                        Quantidade
                    </th>
                </tr>
            </thead>
            <tbody>
                <?php
					$query = "SELECT * FROM faces";
					$query = 'SELECT NOW() as qtd';
			
					$resultado = Dao::conn()->execQuery($query);
				
				
                    //$consulta = mysql_query("SELECT * FROM faces"); // query que busca todos os dados da tabela PRODUTO
                    while($campo = mysql_fetch_array($resultado)){ // laço de repetiçao que vai trazer todos os resultados da consulta
                ?>
                    <tr>
                        <td>
                            <?php echo $campo['qtd']; ?>
                        </td>
                    </tr>
                <?php } ?>
            </tbody>
        </table>
    </body>
</html>
