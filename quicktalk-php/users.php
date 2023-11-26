<?php
    session_start();
    if(!isset($_SESSION['unique_id'])){
        header('location: login.php');
    }
?>

<?php include_once "head.php" ?>

<body>
<video class="video-background" autoplay muted loop>
        <source src="QuickTalk-logado.mp4" type="video/mp4">
      </video>
    <div class="wrapper">
        <section class="users">
            <header>
            <?php 
                include_once"php/config.php";
                $sql = mysqli_query($conn, "SELECT * FROM users WHERE unique_id = {$_SESSION['unique_id']}");
                if(mysqli_num_rows($sql)>0){
                    $row = mysqli_fetch_assoc($sql);
                }
            ?>
                <div class="content">
                    <img src="php/images/<?php echo $row['img'];?>" alt="">
                    <div class="details">
                        <span><?php echo $row['fname'] . " " . $row['lname'];?></span>
                        <p>
                        <?php echo $row['status'];?>
                        </p>
                    </div>
                </div>
                <a href="#" class="logout">Sair</a>
            </header>
            <div class="search">
                <span class="text">Selecione usuário para iniciar chat</span>
                <input type="text" placeholder="Nome do usuário para buscar">
                <button><i class="fas fa-search"></i></button>
            </div>
            <div class="users-list">

            </div>
        </section>
    </div>
    <script src ="js/users.js"></script>
</body>
</html>