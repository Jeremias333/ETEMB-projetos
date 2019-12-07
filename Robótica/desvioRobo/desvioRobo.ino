#define funcao OBR
#include <GuaraTeca.h>

Sensor Ultrassonico(9, 2);

void setup() {
  Serial.begin(9600);
}

void loop() {
  // put your main code here, to run repeatedly:

}

void desvioObstaculo(){
    Serial.print("Sensor de distancia: ");Serial.println(Ultrassonico.distancia());
  Serial.print("Sensor de posicao: ");Serial.println(Ultrassonico.posicao());
}
