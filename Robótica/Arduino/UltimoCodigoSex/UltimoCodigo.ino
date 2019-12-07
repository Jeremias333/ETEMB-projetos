#define funcao OBR
#include <GuaraTeca.h>

Sensor RefletanciaDireita(8);
Sensor RefletanciaEsquerda(7);
HRobot robo(2, 3, 9, 4, 5, 10, 100);
Sensor Ultrassonico(9, 2);


void setup() {
  Serial.begin(9600);
  Serial.println("Iniciou");
  motor.defineVelocidade(0.5,0.5);
}

void loop() {
	double valorSensorDireita       = RefletanciaDireita.luz();
	double valorSensorEsquerda        = RefletanciaEsquerda.luz();

	if( (valorSensorDireita == 1 )&& (valorSensorEsquerda == 0)){
	girarDireita();
	Serial.println("Virou direita");

   
  }else if((valorSensorEsquerda == 1) && (valorSensorDireita == 0)){
    girarEsquerda();
    Serial.println("Virou esquerda");
   
  }else if((valorSensorDireita == 0 )&& (valorSensorEsquerda == 0)){
    Serial.println("Foi para frente!");
   	robo.frente(0);
  }else{robo.para(0);}

}

double verificarDistancia(){//
  Serial.print("Sensor de distancia: ");Serial.println(Ultrassonico.distancia());
  return Ultrassonico.distancia();
}


void girarDireita(){
    robo.direita(0);//motor 1 gira no sentido 1
}

void girarEsquerda(){
    robo.esquerda(0);//motor 1 gira no sentido 2
}
