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
#ifndef GuaraTeca_H
#define GuaraTeca_H

//Tradutor para o usuario--------------------------
#define Hardware 1
#define OBR      2
#define Aprender 3

//Define functions biblios-------------------------
#if funcao == 1
    #include <GuaraTeca_PonteH.h>
    #include <GuaraTeca_MotorShield.h>
    #include <GuaraTeca_Servo.h>
    #include <GuaraTeca_SensorRefletancia.h>
    #include <GuaraTeca_SensorCor.h>
    #include <GuaraTeca_SensorUltrassonico.h>
    #include <GuaraTeca_SensorGiroscopioAcelerometro.h>
    #include <GuaraTeca_SensorAgua.h>
    #include <GuaraTeca_SensorDHT.h>
    #include <GuaraTeca_Buzzer.h>
	#include <GuaraTeca_TelaCristalLiquido.h>
#elif funcao == 2
    #include <GuaraTeca_OBR.h>
#elif funcao == 3
    #include <GuaraTeca_Aprender.h>
#endif
#endif