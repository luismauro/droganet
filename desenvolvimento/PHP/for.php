<?php
    echo "Digite um número para ver sua tabuada";

    $tab = $_GET["t"];

    for($i = 0; $i <= 10; $i++){

        $res = $tab * $i;

        echo "</br>$tab x $i = $res";
    }

?>