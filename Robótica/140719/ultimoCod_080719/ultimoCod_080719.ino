#define funcao OBR
#include <GuaraTeca.h>

Sensor RefletanciaDireita(8);
Sensor RefletanciaEsquerda(7);
HGRobot robo(3, 9, 10, 11, 100);
Sensor Ultrassonico(4, 5);
double valorSensorDireita  = RefletanciaDireita.luz();
double valorSensorEsquerda = RefletanciaEsquerda.luz();
  
void setup() {
  Serial.begin(9600);
  Serial.println("Iniciou");
  robo.defineVelocidade(75, 75);
}

void loop() {
 
  desviarObstaculo();
  seguirLinha(); 
}
void seguirLinha(){
  if( (valorSensorDireita == 1 ) && (valorSensorEsquerda == 0)){
    robo.direita();
    Serial.println("Virou direita");

  }else if((valorSensorEsquerda == 1) && (valorSensorDireita == 0)){
    robo.esquerda();
    Serial.println("Virou esquerda");
   
  }else if((valorSensorDireita == 1 ) && (valorSensorEsquerda == 1)){
    robo.frente();
    Serial.println("Foi para frente!");
  
  }else{
    robo.tras();
  }
}
void dsviarObstaculo(){
  //essa funçâo vira para direita
if(Ultrassonico.distancia() < 12){
  robo.para(1);
  robo.direita(1.5);
  robo.frente(2);
  robo.esquerda(1.5);
  robo.frente(2);
  robo.esquerda(1.5);
  robo.frente(2);
  robo.direita(1.5);
}
if(Ultrassonico.distancia() < 12){
  robo.para(1);
  robo.esquerda(1.5);
  robo.frente(2);
  robo.direita(1.5);
  robo.frente(2);
  robo.direita(1.5);
  robo.frente(2);
  robo.esquerda(1.5);
}
}

/*void irDireita(){
  robo.direita(0);//motor 1 gira no sentido 1
}

void irEsquerda(){
  robo.esquerda(0);//motor 1 gira no sentido 2
}

void irFrente(){
  robo.frente(0);
}

void irTras (){
  robo.tras(0);
}

void parar(){
  robo.para(0);
}
*/
