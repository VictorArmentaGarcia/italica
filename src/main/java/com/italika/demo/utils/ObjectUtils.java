package com.italika.demo.utils;

public class ObjectUtils {

	public static boolean validaObject(Object object) {
		boolean bandera = true;
		if(object == null) {
			bandera = false;			
		}
		
		return bandera;
	}

	public static boolean validaString(String str) {
		if(str == null) {
			return false;
		}
		
		if(str.isBlank() || str.isEmpty()){
			return false;
		}
		
		return validaSimple(str);
	}
	
	public static boolean validaSimple(String str) {
		if(str.equals(Constantes.STR_VACIO) || str.equals(Constantes.STR_NULL_ONE) ||
				str.equals(Constantes.STR_NULL_TWO) || str.equals(Constantes.STR_NULL_THREE)) {
			return false;
		}
		
		return true;
	}
}
