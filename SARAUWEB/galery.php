<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title></title>
    <style media="screen">
      *{
        margin: 0;
        padding: 0;
        border: none;
      }
      .container{
        scroll-snap-type: x mandatory;
        display: flex;
        overflow-x: scroll;
      }
      section{
        background-size: cover;
        background-position: center center;
        height: 100vh;
        min-width: 100vw;
        scroll-snap-align: start;
        positon: relative;
      }
    </style>
  </head>
  <body>
    <div class="container">
      <?php
        $files = new FilesystemIterator('_IMG/galery');
        echo "<script> var y = ".iterator_count($files)."</script>";
        $fi = iterator_count($files);

        for ($i = 1; $i <= $fi; $i++){
          echo "<section style=background-image:url('_IMG/galery/image".$i.".png')><img src=''></section>";
        }
       ?>

   </div>
  </body>
</html>
