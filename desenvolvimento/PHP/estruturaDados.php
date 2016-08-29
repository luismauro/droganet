<?php
    $vetor = array("A", "B", "C");
    foreach ($vetor as $valor){
        echo "$valor<br/>";
    }
    array_push($vetor, "D"); // adicionou D no final do vetor
    print_r($vetor);

    echo "<br/>";

    array_pop($vetor); // removeu o ultimo elemento do vetor.
    foreach ($vetor as $valor){
        echo "$valor<br/>";
    }

    array_unshift($vetor, "W"); // adcionou W na posição 0
    print_r($vetor);
    array_shift($vetor); // removeu o primeiro valor
    foreach ($vetor as $valor){
        echo "$valor<br/>";
    }

    $v2 = array(6,4,2,8,5);
    sort($v2); // ordena o vetor
    print_r($v2);
    rsort($v2); //ordem reversa
    print_r($v2);
    echo"<br/>";
    asort($v2); // ordena vetor e indices
    print_r($v2);
    arsort($v2); // ordem reversa de indices e valores
    print_r($v2);
    echo"<br/>";
    ksort($v2); // ordena somente os indices
    print_r($v2);
    krsort($v2); // ordena somente os indices de forma reversa
    print_r($v2);

?>