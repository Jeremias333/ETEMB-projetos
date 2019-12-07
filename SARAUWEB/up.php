<?php
  if(isset($_FILES['fileupload'])){
    date_default_timezone_set("Brazil/East"); //Definindo timezone padrão

    $ext = strtolower(substr($_FILES['fileupload']['name'],-4)); //Pegando extensão do arquivo
    $fi = new FilesystemIterator("_IMG/galery/");
    $qnt = iterator_count($fi);
    $or = $qnt + 1;
    $new_name = "image".$or.".png"; //Definindo um novo nome para o arquivo
    $dir = '_IMG/galery/';

      move_uploaded_file($_FILES['fileupload']['tmp_name'], $dir.$new_name); //Fazer upload do arquivo
  }
?>
