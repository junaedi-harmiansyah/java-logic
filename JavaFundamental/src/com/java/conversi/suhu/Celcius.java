package com.java.conversi.suhu;

/**
 * 
 * @author Noviana Dewi
 *
 */

public class Celcius {
	double toFahrenheit(){
        //�F = �C � 1,8 + 32
        return (KonversiSuhu.SuhuAwal*1.8+32);
    }
    double toReamur(){
        //�R� = �C � 0,8
        return (KonversiSuhu.SuhuAwal*0.8);
    }
    double toKelvin(){
        //K = �C + 273,15
        return (KonversiSuhu.SuhuAwal+273.15);
    }
   
}
