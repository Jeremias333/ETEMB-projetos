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
  robo.defineVM(75, 75);
}

void loop() {
  DesviarObstaculoDireita();
  DesviarObstaculoEsquerda();
  seguirLinha(); 
}
void DesviarObstaculoDireita(){
  //essa funçâo vira para direita
if(Ultrassonico.distancia() < 12){
  //podemos colocar a função move.
   //Não entendi como colocar por isso deixei assim.
  robo.para(1);
  robo.direita(1.5);
  robo.frente(2);
  robo.esquerda(1.5);
  robo.frente(2);
  robo.esquerda(1.5);
  robo.frente(2);
  robo.direita(1.5);
}else{
  seguirLinha(); 
}
}
void DesviarObstaculoEsquerda(){
if(Ultrassonico.distancia() < 12){
  //podemos colocar a função move.
  //Não entendi como colocar por isso deixei assim.
  robo.para(1);
  robo.esquerda(1.5);
  robo.frente(2);
  robo.direita(1.5);
  robo.frente(2);
  robo.direita(1.5);
  robo.frente(2);
  robo.esquerda(1.5);
}else{
  seguirLinha(); 
}
}
void seguirLinha(){
  if( (valorSensorDireita == 1 )&& (valorSensorEsquerda == 0)){
    robo.direita(0);
    Serial.println("Virou direita");

  }else if((valorSensorEsquerda == 1) && (valorSensorDireita == 0)){
    robo.esquerda(0);
    Serial.println("Virou esquerda");
   
  }else if((valorSensorDireita == 0 )&& (valorSensorEsquerda == 0)){
    robo.frente(0);
    Serial.println("Foi para frente!");
  
  }else if((valorSensorDireita == 1 )&& (valorSensorEsquerda == 1)){
    robo.frente(0);
    Serial.println("Foi para frente!");
}
}
