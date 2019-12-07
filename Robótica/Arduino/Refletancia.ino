
#include <GuaraTeca_SensorRefletancia.h>

SensorRefletancia objct;//declaramos o sensor de refletancia

void setup() {   
  Serial.begin(9600);
  objct.iniciaSensorRefletancia(A0);//iniciamos o sensor de refletancia na porta A0
  pinMode(10, OUTPUT);

}

void loop() {
  double   trab = (objct.leitura(A0)* 5) / 4096 ;
  Serial.print("Refletancia: ");
    
  Serial.println(trab);//imprimimos a leitura do sensor na porta A0
  if (trab == 0 ){
    digitalWrite(10, LOW);
  }else{
        digitalWrite(10, HIGH);
    }

}
