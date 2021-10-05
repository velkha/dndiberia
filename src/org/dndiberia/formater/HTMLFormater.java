package org.dndiberia.formater;

import java.util.List;

public class HTMLFormater {
	/**
	 * Construye los divs que se enviaran en format html para mostrar en la pagina, es usado para cuando solo hay 1 dato
	 * @param nombre
	 * @param dato
	 * @return
	 */
	public String singleDataWDiv(String nombre, String dato) {
		return "<div class=\"singleData\"><p>"+nombre+"</p><p>"+dato+"</p></div>";
	}
	/**
	 * construye el arbol de divs para mostrar en la pagina de listas del objeto estadistica counter
	 * @param nombre
	 * @param contadores
	 * @return
	 */
	/*
	public String multipleDataWDiv(String nombre, List<EstadisticaCounter> contadores) {
		String returnStr;
		returnStr="<div class=\"multipleData\"><div class=\"row\">"+nombre+"</div>";
		for (EstadisticaCounter contador : contadores) {
			returnStr+="<div class=\"row\"><div class=\"col-6\">"+contador.getName()+"</div><div class=\"col-6\">"+contador.getCounter()+"</div></div>";
		}
		returnStr+="</div>";
		return returnStr;
	}*/

}
