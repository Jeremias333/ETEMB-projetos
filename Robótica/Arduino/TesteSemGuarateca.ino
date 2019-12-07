//Definindo os pinos ligados a ponte H
int in1 = 4;
int in2 = 5;
int in3 = 6;
int in4 = 7;


void setup() {
  // put your setup code here, to run once:
  //Definindo os pinos como output
pinMode(in1, OUTPUT);
pinMode(in2, OUTPUT);
pinMode(in3, OUTPUT);
pinMode(in4, OUTPUT);
}

void loop() {
 //Tambem é possivel criar metodos para as funções(*)
 
 //Girar o A no sentido horario(Frente)
 digitalWrite(in1, HIGH);
 digitalWrite(in2, LOW);
 delay(2000);
 //Parar o motor A(Freio)
 digitalWrite(in1, HIGH);
 digitalWrite(in2, HIGH);
 delay(500);
 //Gira o Motor B no sentido horario*
 digitalWrite(in3, HIGH);
 digitalWrite(in4, LOW);
 delay(2000);
 //Para o motor B*
 digitalWrite(in3, HIGH);
 digitalWrite(in4, HIGH);
 delay(500);

  //Gira o Motor A no sentido anti-horario(Trás)
 digitalWrite(in1, LOW);
 digitalWrite(in2, HIGH);
 delay(2000);
 //Para o motor A*
 digitalWrite(in1, HIGH);
 digitalWrite(in2, HIGH);
 delay(500);
 //Gira o Motor B no sentido anti-horario*
 digitalWrite(in3, LOW);
 digitalWrite(in4, HIGH);
 delay(2000);
 //Para o motor B*
 digitalWrite(in3, HIGH);
 digitalWrite(in4, HIGH);
 delay(500);
}


 
 
