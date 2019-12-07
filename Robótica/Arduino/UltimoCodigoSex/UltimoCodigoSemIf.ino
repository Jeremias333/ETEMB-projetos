#define funcao OBR
#include <GuaraTeca.h>

Sensor RefletanciaDireita(8);
Sensor RefletanciaEsquerda(7);
HRobot motor(5, 6, 10, 3, 4, 11, 10);
Sensor Ultrassonico(9, 2);


void setup() {
  Serial.begin(9600);
  Serial.println("Iniciou");
  motor.defineVelocidade(0.5,0.5);
}

void loop() {
  //  verificarRefletancia();
    double valorSensorDireita       = RefletanciaDireita.luz();
  double valorSensorEsquerda        = RefletanciaEsquerda.luz();
  
  
  if((valorSensorDireita == 0 )&& (valorSensorEsquerda == 0)){
     motor.frente();
  }else{motor.tras();}

}

//boolean verificarRefletancia(){//retorna verdadeiro/false
//  double valorSensorDireita         = ((RefletanciaDireita.luz()*5)/ 4096);
//  double valorSensorEsquerda        = ((RefletanciaEsquerda.luz()*5)/ 4096);
//  
//  if(valorSensorDireita == 1.0 && valorSensorEsquerda == 0.0){
//   girarDireita();
//   Serial.println("Virou direita");
//   return false;
//  }else if(valorSensorEsquerda == 1.0 && valorSensorDireita == 0.0){
//    girarEsquerda();
//    Serial.print("Virou esquerda");
//    return false;
//  }else if(valorSensorDireita == 0.0 && valorSensorEsquerda == 0.0){
//    Serial.print("Foi para frente!");
//    return true;
//  }
//}

double verificarDistancia(){//
  Serial.print("Sensor de distancia: ");Serial.println(Ultrassonico.distancia());
  return Ultrassonico.distancia();
}


void girarDireita(){
    motor.direita();//motor 1 gira no sentido 1
}

void girarEsquerda(){
    motor.esquerda();//motor 1 gira no sentido 2
}
