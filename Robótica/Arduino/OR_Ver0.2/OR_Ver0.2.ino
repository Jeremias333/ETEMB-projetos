#include <GuaraTeca_Demo.h>
#include <GuaraTeca_SensorRefletancia.h>
#include <GuaraTeca_PonteH.h>

SensorRefletancia reflet;//declaramos o sensor de refletancia

SensorUltrassonico ultras(9, 6);//Declaramos um objeto e definimos em qual pino esta conectado
                       // Tp,Ep
PonteH motorTeste;//É declarado o motor


void setup() {
  	Serial.begin(9600);//inicia o monitor serial na frequencia de 9600  


    pinMode(9, OUTPUT);//do objeto ultras

    reflet.iniciaSensorRefletancia(A0);//iniciamos o sensor de refletancia na porta A0
  	pinMode(10, OUTPUT);


   	//MOTOR
  	motorTeste.iniciaPonteH(3,4,10,5,6,11); //preparamos a PonteH para receber os comandos(Necessario a alteração)
  	motorTeste.controleDeCorrente(10, 255); //É definido a velocidade do motor na porta 1 como maxima 
  	motorTeste.controleDeCorrente(11, 255); //É definido a velocidade do motor na porta 2 como maxima   

}

void loop() {

  //basta chamar aqui o determinado método que vamos testar
  
}

void refletancia(){
  	Serial.print("Distancia: ");
   	Serial.print(reflet.leitura(A0));//imprimimos no monitor serial a leitura do sensor
  	Serial.println("cm");
  	
  	double dist = reflet.leitura(A0);
  	
  	if (dist < 15 ){
    	digitalWrite(10, HIGH);
  	}else{
    	digitalWrite(10, LOW);
   	} 
}

void ultrassonico(){
  	double valor = (ultras.leitura(A0)* 5) / 4096 ;
  	Serial.print("Refletancia: ");
  	    
  	Serial.println(valor);//imprimimos a leitura do sensor na porta A0
  	  
  	if (valor == 0 ){
  		digitalWrite(10, LOW);
  	}else{
          digitalWrite(10, HIGH);
      }
}

void ponteH(){
  	motorTeste.sentido1(3, 4);//motor 1 gira no sentido 1
  	motorTeste.sentido1(5, 6);//motor 2 gira no sentido 1
  	delay(1000);
  	motorTeste.trava(3, 4);//motor 1 para
  	motorTeste.trava(5, 6);//motor 2 para
  	delay(1000);
  	motorTeste.sentido2(3, 4);//motor 1 gira no sentido 2
  	motorTeste.sentido2(5, 6);//motor 2 gira no sentido 2
  	delay(1000);
}
