package com.deivisonprogrammer.implem_log4j;

import org.apache.log4j.Logger;

public class ImprimiLog4j1 {
	
	final static Logger logger = Logger.getLogger(ImprimiLog4j1.class);
	
	public static void main(String[] args) {
		
		Soma soma = new Soma();
		
		soma.soma("a", "a");
		
	}	
	
}
