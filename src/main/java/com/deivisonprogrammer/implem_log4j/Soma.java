package com.deivisonprogrammer.implem_log4j;

import org.apache.log4j.Logger;


public class Soma {
	
	final static Logger logger = Logger.getLogger(Soma.class);
	
	//Cenário criado para simular erros, por isso o uso da String 
	public void soma(String number1, String  number2){		
		
		if(number1 != null && !number1.isEmpty() && number2 != null && !number2.isEmpty()){
			try{
				int resultado = Integer.parseInt(number1) + Integer.parseInt(number2);
				
				for(int i=0; i < 10; i++){
					logger.info(getClass().toString() + ": O resultado da soma: " + resultado);
				}
			}
			catch(Exception e){
				logger.error(getClass().toString() + " - method: soma(string, string) : " + e);
			}
		}
	}
}
