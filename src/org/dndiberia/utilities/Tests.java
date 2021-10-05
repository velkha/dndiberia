package org.dndiberia.utilities;

import org.dndiberia.models.Hechizo;
import org.dndiberia.utilities.security.PasswordUtils;

public class Tests {
	
	public static Hechizo generateTestHechizo() {
		Hechizo hechizo;
		int id_hechizo=-1;
		String nombre="hechizo test";
		String descripcion="test para los hechizos";
		int nvl_hechizo=2;
		int escuela=1;
		String tiempo_lanzamiento="2 actions";
		String alcance="90feet";
		String objetivo="tarjet";
		String tipo="fuego";
		String ataque="100";
		String ataque_superior="2d8";
		String descripcion_superior="a niveles superiores hace 1d8 extra de da�o";
		String componentes="VMS";
		
		hechizo=new Hechizo(id_hechizo, nombre, descripcion, nvl_hechizo, escuela, tiempo_lanzamiento, alcance, objetivo, tipo, ataque, ataque_superior, descripcion_superior, componentes);
		System.out.println("generado hechizo de prueba");
		return hechizo;
	}
	
	public static void passwordCheck() {
		PasswordUtils passwordUtils = new PasswordUtils();
        String myPassword = "myPassword123";
        
        // Generate Salt. The generated value can be stored in DB. 
        String salt = passwordUtils.getSalt(30);
        
        // Protect user's password. The generated value can be stored in DB.
        String mySecurePassword = passwordUtils.generateSecurePassword(myPassword, salt);
        
        // Print out protected password 
        System.out.println("My secure password = " + mySecurePassword);
        System.out.println("Salt value = " + salt);
	}
	
}
