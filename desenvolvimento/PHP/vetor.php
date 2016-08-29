<?php
    $v = array(1,2,3);

    $v[] = 4;
    print_r($v);
    $v[4] = 5;
    print_r($v);

    $r = range(5,20,5);
    print_r($r);

    echo "<br/><br/>exemplo utilizando o foreach:";
    foreach ($r as $valor){
        echo " <br/>$valor"; // foreach = para cada valor de $r imprima valor.
    }

    $r = range(1,100,10);
    echo "<br/><br/>Outro exemplo utilizando o foreach:";
    foreach ($r as $valor){
        echo " <br/>$valor"; // foreach = para cada valor de $r imprima valor.
    }

    unset($r[0]);
    print_r($r);

    $cadastro = array("nome" => "Júlio",
                "idade" => 25, "peso" => 80.5);
    print_r($cadastro);
    echo "<br/>";
    $cadastro["ativo"] = true;
    print_r($cadastro);
    echo "<br/>";

    if ($cadastro["ativo"] == 1){
        $cadastro["ativo"] = (String) "SIM";
    }else
        $cadastro["ativo"] = (String) "NÃO";

    foreach ($cadastro as $nome => $valor){
        echo "<br/> O $nome é $valor";
    }
?>