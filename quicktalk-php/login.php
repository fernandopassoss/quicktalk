<?php include_once "head.php" ?>
<body>
<video class="video-background" autoplay muted loop>
        <source src="QuickTalk.mp4" type="video/mp4">
      </video>
    <div class="wrapper">
        <section class="form login">
            <header>
                QuickTalk
            </header>
            <form action="#">
                <div class="error-text">

                </div>
                <div class="field input">
                    <label for="" class="" id="">
                        E-mail
                    </label>
                    <input type="email" name="email" placeholder="Informe seu e-mail">
                </div>
                <div class="field input">
                    <label for="" class="" id="">
                        Senha
                    </label>
                    <input type="text" name="password" placeholder="Informe sua senha">
                    <i class="fas fa-eye"></i>
                </div>
                <div class="field button">
                    <input type="submit" value="Entrar">
                </div>
            </form>
            <div class="link">
                Não está cadastrado?
                <a href="index.php">Cadastre-se agora</a>
            </div>
        </section>
    </div>
<script src ="js/pass-show-hide.js"></script>
<script src ="js/login.js"></script>


</body>
</html>