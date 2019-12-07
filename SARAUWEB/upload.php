<!DOCTYPE html>
<html lang="pt-br" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title></title>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons"rel="stylesheet">
    <style media="screen">
      *{
        margin: 0;
        padding: 0;
      }
      body{
        background: rgb(113, 187, 198);
      }
      form{
        position: absolute;
        top: 50%;
        left: 50%;
        transform: translate(-50%, -50%);
        width: 80%;
        height: 60%;
        border: 4px inset rgb(154, 190, 186);
        border-radius: 40px;
        padding: 0.5%;
        background: linear-gradient(to bottom, rgb(105, 78, 0), rgb(156, 89, 0));
        display: flex;
        justify-content: center;
        align-items: center;
        flex-flow: column;
      }
      #file{
        display: none;
      }
      label{
        border-radius: 10px;
        background: rgb(20, 5, 20);
        color: #fff;
        padding: 1%;
        font-family: Times;
        font-size: 34pt;
        cursor: pointer;
        margin-bottom: 50px;

      }
      input[type='file']:checked{
        color: rgb(195, 13, 18);
        box-shadow: 0px 0px 10px #fff;
      }
      .material-icons.md-48{font-size: 48pt}
      input[type='submit']{
        padding: 1%;
        margin: 0;
        width: 100%;
      }
    </style>
    <script type="text/javascript">
        function verify(){
          var check = document.getElementById('file');
          if (check.checked){
            document.getElementById('lfile').style.color = "#000000";
          }
        }
    </script>
  </head>
  <body>
    <header id="cabecalho">
      <h2>Clique na nuvem para selecionar a imagem</h2>
    </header>
    <form class="" action="up.php" method="post" enctype="multipart/form-data">
      <input id="file" type="file" placeholder="eavvaev" name="fileupload" value="">
      <label onclick="verify()" id="lfile" for="file"><i class="material-icons md-48">cloud_upload</i></label>
      <br><input type="submit" name="" value="Enviar">
    </form>
  </body>
</html>
