aux = 0;

function botao(num) {
	var numero = document.formCalculadora.inOperacao.value;
  if (document.getElementById('inOperacao').isSelected()) {
    document.formCalculadora.inOperacao.value = "";
    document.formCalculadora.inOperacao.value = num;
    aux = 0;
  }
	document.formCalculadora.inOperacao.value = numero + num;
}

function resetAll(){
	document.formCalculadora.inOperacao.value = "";
}

function selectAll() {
    aux = 1;
    document.getElementById("inOperacao").select(); 
}

function resetOne(){
	var expressao = document.getElementById('inOperacao').value;
	document.formCalculadora.inOperacao.value = expressao.substr(1,(expressao.length - 1));
}

function calcular(){
	var expressao = document.getElementById('inOperacao').value;
	var resultado = eval(expressao);
  document.formCalculadora.inOperacao.value = resultado;

	if(resultado == ("Infinity")){
		document.formCalculadora.inOperacao.value = "Operação inválida";
	}
}
