<?php
$conn = mysqli_connect("localhost", "root", "", "quicktalk2");

if(!$conn){
    echo "Erro ao conectar".mysqli_conncet_error();
}