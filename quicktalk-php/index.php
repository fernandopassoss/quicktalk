<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>QuickTalk</title>
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
</head>
<body>
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
                    <input type="password" placeholder="Sua senha" required  name="password">
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
                <a href="#">Faça seu login</a>
            </div>
        </section>
    </div>
    
<script src ="js/pass-show-hide.js"></script>
<script src="js/signup.js"></script>
</body>
</html>