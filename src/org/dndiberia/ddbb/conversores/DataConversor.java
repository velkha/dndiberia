package org.dndiberia.ddbb.conversores;

public class DataConversor {
	
	/**
	 * Convierte el nombre mandado en el formato asignado para la base de datos
	 * Actualmente: pone todo en minisculas y cambia todos los espacios por _
	 * @param spellName
	 * @return
	 */
	public String databaseStringConversor(String spellName) {
		spellName=spellName.toLowerCase();
		spellName=spellName.replaceAll("\\s","_");
		return spellName;
	}
}
