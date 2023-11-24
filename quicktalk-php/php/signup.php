<?php

session_start();
include_once "config.php";

$fname = mysqli_real_escape_string($conn, $_POST['fname']);
$lname = mysqli_real_escape_string($conn, $_POST['lname']);
$email = mysqli_real_escape_string($conn, $_POST['email']);
$password = mysqli_real_escape_string($conn, $_POST['password']);

if(!empty($fname) && !empty($lname) && !empty($email) && !empty($password)){
    $sql = mysqli_query($conn, "SELECT email FROM users WHERE email ='{$email}'");
    if(mysqli_num_rows($sql)==0){
        if (isset($_FILES['image'])) {
            $img_name = $_FILES['image']['name'];
            $tmp_name = $_FILES['image']['tmp_name'];

            $img_explode = explode('.', $img_name);
            $img_ext = end($img_explode);

            $

        }
    }else{
        echo "O e-mail já existe";
    }
}else{
    echo "Preencha todos os campos";
}