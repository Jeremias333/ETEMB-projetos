var jeje =1;
var seg2 = 1;
var seg1 = 0;
var min1 = 0;
var min2 = 0;
var hor1 = 0;
var hor2 = 0;
var aux = 0;

setInterval( 
	function() {
		if(aux == 0){
			document.getElementById('seg1').src = './img/'+seg1+'.png';
			document.getElementById('seg2').src = './img/'+seg2+'.png';
			document.getElementById('min1').src = './img/'+min1+'.png';
			document.getElementById('min2').src = './img/'+min2+'.png';
			document.getElementById('hora1').src = './img/'+hor1+'.png';
			document.getElementById('hora2').src = './img/'+hor2+'.png';

			aux++;

		}
		
		if(seg2 > 9){
			seg2 = 0;
			seg1 ++; 
		document.getElementById('seg1').src = './img/'+seg1+'.png';
	  	console.log(seg1);
				
		}
		document.getElementById('seg2').src = './img/'+seg2+'.png';
	  	console.log(seg2);

	 		seg2++;

	 		if (seg1 == 6) { 
	 			seg1 = 0;
	 			seg2 = 0;
	 			document.getElementById('seg1').src = './img/'+seg1+'.png';
	  	console.log(seg1);
	  	document.getElementById('seg2').src = './img/'+seg2+'.png';
	  	console.log(seg2);
	 			min2++; 
			document.getElementById('min2').src = './img/'+min2+'.png';
	  	console.log(min2);
			seg2 = 0; 

		}

		if(min2 > 9){
			min2 = 0;
			document.getElementById('min2').src = './img/'+min2+'.png';
	  	console.log(min2);
			min1 ++; 
		document.getElementById('min1').src = './img/'+min1+'.png';
	  	console.log(min1);
				
		}

		if (min1 == 6) { 
	 			min1 = 0;
	 			min2 = 0;
	 			document.getElementById('min1').src = './img/'+min1+'.png';
	  	console.log(min1);
	  	document.getElementById('min2').src = './img/'+min2+'.png';
	  	console.log(min2);
	 			hor2++; 
			document.getElementById('hora2').src = './img/'+hor2+'.png';
	  	console.log(min2);
			seg2 = 0; 
		}

		if(hor2 > 9){
			hor2 = 0;
			document.getElementById('hora2').src = './img/'+hor2+'.png';
	  	console.log(hor2);
			hor1++; 
		document.getElementById('hora1').src = './img/'+hor1+'.png';
	  	console.log(min1);
				
		}


}, jeje);



setInterval({

}, 1000);

function limpa() {
	seg2 = 1;
 	seg1 = 0;
 	min1 = 0;
	min2 = 0;
 	hor1 = 0;
	hor2 = 0;
	document.getElementById('seg1').src = './img/'+seg1+'.png';
	  	console.log(seg1);
	document.getElementById('seg2').src = './img/'+seg2+'.png';
	  	console.log(seg2);
	document.getElementById('min1').src = './img/'+min1+'.png';
	  	console.log(min1);
	document.getElementById('min2').src = './img/'+min2+'.png';
	  	console.log(min2);  
	document.getElementById('hora1').src = './img/'+hor1+'.png';
	  	console.log(hor1);  	
	document.getElementById('hora2').src = './img/'+hor2+'.png';
	  	console.log(hor2);    		

}

