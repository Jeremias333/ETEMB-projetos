//Copyright 2017 Joaquim Fl�vio Almeida Quirino Gomes, D�mis Carlos ----*
//Fonseca Gomes, Marcos Dias da Concei��o e Diego de Castro Rodrigues---*
//----------------------------------------------------------------------*
//Este arquivo � parte da Biblioteca de Fun��es Guar�Teca---------------*
//A Guar�Teca � um software livre; voc� pode redistribu�-lo e/ou--------* 
//modific�-lo sob os termos da Licen�a P�blica Geral GNU como publicada-*
//pela Funda��o do Software Livre (FSF); na vers�o 3 da Licen�a,--------*
//ou (a seu crit�rio) qualquer vers�o posterior.------------------------*
//
//Este programa � distribu�do na esperan�a de que possa ser �til,-------* 
//mas SEM NENHUMA GARANTIA; sem uma garantia impl�cita de ADEQUA��O-----*
//a qualquer MERCADO ou APLICA��O EM PARTICULAR. Veja a-----------------*
//Licen�a P�blica Geral GNU para mais detalhes.-------------------------*
//
//Voc� deve ter recebido uma c�pia da Licen�a P�blica Geral GNU junto---*
//com este programa. Se n�o, veja <http://www.gnu.org/licenses/>--------*

//Tradutor para o usuario--------------------------
#define Ativada    1
#define Desativada 2

//Include of biblios-------------------------------
#if Control_TelaCristalLiquido == Ativada
	#include <GuaraTeca_TelaCristalLiquido.h>
#endif

#if Control_Buzzer == Ativada
    #include <GuaraTeca_Buzzer.h>
#endif
#if Control_Led == Ativada
   #include <GuaraTeca_Led.h>
#endif
#if Control_PushButton == Ativada
   #include <GuaraTeca_PushButton.h>
#endif

#if Control_PonteH == Ativada
    #include <GuaraTeca_PonteH.h>
#endif
#if Control_MotorShield == Ativada
    #include <GuaraTeca_MotorShield.h>
#endif
#if Control_Servo == Ativada
    #include <GuaraTeca_Servo.h>
#endif

#if Control_SensorRefletancia == Ativada
    #include <GuaraTeca_SensorRefletancia.h>
#endif
#if Control_Senso_TCS230 == Ativada
    #include <GuaraTeca_Sensor_TCS230.h>
#endif
#if Control_Sensor_HCSR04 == Ativada
    #include <GuaraTeca_Sensor_HCSR04.h>
#endif
#if Control_Sensor_GY521_MPU6050 == Ativada
    #include <GuaraTeca_Sensor_GY521_MPU6050.h>
#endif
#if Control_SensorAgua == Ativada
    #include <GuaraTeca_SensorAgua.h>
#endif
#if Control_SensorDHT == Ativada
    #include <GuaraTeca_SensorDHT.h>
#endif
