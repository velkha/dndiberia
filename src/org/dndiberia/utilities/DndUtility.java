package org.dndiberia.utilities;

import java.util.regex.Pattern;

public class DndUtility {
	
	/**
	 * Metodo al que le mandas un conjunto de dados y daños fijos ej 3d4+2+8d9+1+312d45 y te calcula un daño aleatorio de esos dados
	 * @param dice
	 * @return
	 */
	public int rollDice(String dice) {
		int resultado=0;
		String[] partes;
		partes=dice.split("+");
		for(int i=0; i<partes.length; i++) {
			partes[i]=partes[i].replaceAll("\\s","");
			if(isRollValid(partes[i])) {
				resultado+=getRandomDiceValue(partes[i]);
			}
			else if(Pattern.matches("-?\\d+(\\.\\d+)?", partes[i])) {
				resultado+=Integer.valueOf(partes[i]);
			}
		}
		
		return resultado;
	}
	private boolean isRollValid(String dice) {
		boolean check;
		check=Pattern.matches("(\\d{1,4})(d)(\\d{1,4})", dice);
		return check;
	}
	private int getRandomDiceValue(String dice) {
		String[] values;
		int max, min, finalValue;
		values=dice.split("d");
		min=Integer.valueOf(values[0]);
		max=min*Integer.valueOf(values[1]);
		finalValue = (int)(Math.random() * max-min) + min;
		return finalValue;
	}
}
