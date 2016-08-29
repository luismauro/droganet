<?php
    function soma (){
        $p = func_get_args();
        $total_p = func_num_args();
        $res = 0;
        for($i=0; $total_p > $i;$i++){
            $res += $p[$i];
        }
        return $res;
    }

    $teste = soma(1,2,3,4,5,6,7,8,9);
    echo $teste;

    function soma2($a, $b){
        $s = $a + $b;
        echo "</br> Este é o valor de soma 2: $s";
    }
?>