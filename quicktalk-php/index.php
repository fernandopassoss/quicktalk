<?php include_once "head.php" ?>
<body>
<video class="video-background" autoplay muted loop>
        <source src="QuickTalk.mp4" type="video/mp4">
      </video>
    <div class="wrapper">
        <section class="form signup">
            <header>
                QuickTalk
            </header>
            <form action="#" enctype="multipart/form-data ">
                <div class="error-text">
                    Erro ao cadastrar
                </div>
                <div class="name-details">
                    <div class="field input">
                        <label for="" class="" id="">
                            Nome
                        </label>
                        <input type="text" placeholder="Seu nome" required name="fname">
                    </div>
                    <div class="field input">
                        <label for="" class="" id="">
                            Sobrenome
                        </label>
                        <input type="text" placeholder="Seu sobrenome" required  name="lname">
                    </div>
                </div>
                <div class="field input">
                    <label for="" class="" id="">
                        E-mail
                    </label>
                    <input type="email" placeholder="Seu e-mail" required  name="email">
                </div>
                <div class="field input">
                    <label for="" class="" id="">
                        Senha
                    </label>
                    <input type="text" name="password" placeholder="Sua senha">
                    <i class="fas fa-eye"></i>
                </div>
                <div class="field image">
                    <input type="file" required  name="image">
                </div>
                <div class="field button">
                    <input type="submit" value="Salvar">
                </div>
            </form>
            <div class="link">
                Já está cadastrado?
                <a href="login.php">Faça seu login</a>
            </div>
        </section>
    </div>
    
<script src ="js/pass-show-hide.js"></script>
<script src="js/signup.js"></script>
</body>
</html>